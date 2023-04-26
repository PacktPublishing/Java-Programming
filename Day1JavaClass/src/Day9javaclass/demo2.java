
package Day9javaclass;

import java.awt.*;
import java.awt.Dimension;
import javax.swing.*;

public class demo2 extends JFrame{
    public static final int CANVAS_WIDTH=600;
    public static final int CANVAS_HEIGHT=400;
    private DrawCanvas canvas;
    demo2(){
        canvas=new DrawCanvas();
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH,CANVAS_HEIGHT));
        Container cp=getContentPane();
        cp.add(canvas);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setTitle("Creating Various AWT Graphics");
        setVisible(true);               
    }
class DrawCanvas extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.BLACK);
        g.setColor(Color.YELLOW);
        g.drawLine(30, 30, 100, 200);
        g.drawOval(150, 180, 15, 15);
        g.drawRect(200,210, 30, 40);
        g.setColor(Color.red);
        g.fillOval(300, 310, 35, 55);
        g.fillRect(400, 350, 65,55);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Monospaced",Font.BOLD,20));
        g.drawString("Working with AWT Class", 9, 15);        
    }
}
public static void main(String[] args){
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new demo2();
        }
    });
}
}
