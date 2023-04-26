package Day9javaclass;
import java.awt.*;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;
public class demo3 extends JFrame{
    JPanel buttonPanel = new JPanel();
    JButton runButton = new JButton("Run");
    JButton stopButton = new JButton("Stop");
    Thread thread;

    Model model = new Model();
    View view = new View(model);
    public static void main(String[] args) {
        demo3 c = new demo3();
        c.init();
        c.setSize(300, 300);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void init() {
        layOutComponents();
        attachListenersToComponents();

        // Connect model and view
        model.addObserver(view);
    }

    private void layOutComponents() {
        setLayout(new BorderLayout());
        this.add(BorderLayout.SOUTH, buttonPanel);
        buttonPanel.add(runButton);
        buttonPanel.add(stopButton);
        stopButton.setEnabled(false);
        this.add(BorderLayout.CENTER, view);
    }
    private void attachListenersToComponents() {
        runButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                runButton.setEnabled(false);
                stopButton.setEnabled(true);
                
                model.okToRun = true;
                thread = new Thread(model);
                thread.start();
            }
        });
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                runButton.setEnabled(true);
                stopButton.setEnabled(false);
                
                model.okToRun = false;
            }
        });
        this.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                model.setLimits(view.getWidth(), view.getHeight());
            }
        });
    }
}
class Model extends Observable implements Runnable {
    public final int BALL_SIZE = 20;
    private int xPosition = 0;
    private int yPosition = 0;
    private int xLimit, yLimit;
    private int xDelta = 6;
    private int yDelta = 4;

    public boolean okToRun = false; // can be changed from outside

    public void setLimits(int xLimit, int yLimit) {
        this.xLimit = xLimit - BALL_SIZE;
        this.yLimit = yLimit - BALL_SIZE;
    }

    public int getX() {
        return xPosition;
    }

    public int getY() {
        return yPosition;
    }

    public void run() {
        while (okToRun) {
            makeOneStep();
            try {
                Thread.sleep(40);
            }
            catch (InterruptedException e) { }
        }
    }

    public void makeOneStep() {
        // Do the work
        xPosition += xDelta;
        if (xPosition < 0 || xPosition >= xLimit) {
            xDelta = -xDelta;
            xPosition += xDelta;
        }
        yPosition += yDelta;
        if (yPosition < 0 || yPosition >= yLimit) {
            yDelta = -yDelta;
            yPosition += yDelta;
        }
        // Notify observers
        setChanged();
        notifyObservers();
    }
}

//---------------------------------------------------------------------

class View extends JPanel implements Observer {
    Model model;

    View(Model model) {
        this.model = model;
    }

    public void paint(Graphics g) {
        // Added because of differences between Panel and JPanel

        System.out.println("paint " + g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.red);
        g.fillOval(model.getX(), model.getY(),
                model.BALL_SIZE, model.BALL_SIZE);
    }

    public void update(Observable obs, Object arg) {
        System.out.println("update");
        repaint();
    }
}