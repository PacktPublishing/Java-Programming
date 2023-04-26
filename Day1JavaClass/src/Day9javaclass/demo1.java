
package Day9javaclass;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.*;
import javax.swing.*;
import java.awt.*;
        
public class demo1 extends JPanel{
    int x=300,y=300;
    int width=30,height=30;
    int dx=1,dy=1;
    java.util.Timer move;
    static JFrame frame;
    demo1(){
        frame=new JFrame("Ball Bounce !!");
        frame.setSize(400,400);
        frame.setVisible(true);
        setForeground(Color.red);
        move=new java.util.Timer();
        move.scheduleAtFixedRate(new TimerTask()
        {
            public void run(){
                if(x<0)
                    dx=1;
                if(x>getWidth()-25)
                  dx=-1;
                if(y<0)
                    dy=1;
               if(y>=getHeight()-25)
                    dy=-1;
                x+=dx;
                y+=dy;
                repaint();
            }            
        },0,5);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d=(Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, width, height);        
    }
    public static void main(String[] args){
        demo1 d1=new demo1();
        frame.add(d1);
    }
}
