// Begin everything from scratch

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    public static void main(String[] args) {

        final int FRAMEWIDTH = 800;
        final int FRAMEHEIGHT = 600;
        final int RECTWIDTH = 50;
        final int RECTHEIGHT = 50;

        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                JFrame frame = new JFrame("Tetris");
                frame.setSize(FRAMEWIDTH, FRAMEHEIGHT);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                //frame.setLayout(new GridLayout(2,3));
                frame.setVisible(true);

                ShowSomeGraphics rect = new ShowSomeGraphics(100, 120, RECTWIDTH, RECTHEIGHT, FRAMEWIDTH, FRAMEHEIGHT);
                frame.add(rect);

                frame.setFocusable(true);
                frame.setFocusableWindowState(true);
                frame.requestFocus();



                frame.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                        if(e.getKeyCode() == KeyEvent.VK_D){
                            rect.setX(10);
                            rect.repaint();
                            //System.out.println("Right arrow pressed");
                        } else if(e.getKeyCode() == KeyEvent.VK_A){
                            rect.setX(-10);
                            rect.repaint();
                            //System.out.println("Left arrow pressed");
                        } else if(e.getKeyCode() == KeyEvent.VK_W){
                            rect.setY(-10);
                            rect.repaint();
                        } else if(e.getKeyCode() == KeyEvent.VK_S){
                            rect.setY(10);
                            rect.repaint();
                        }
                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }
                });

                /*
                // move our object down to bottom
                try{
                    while(true){
                        rect.setX(10);
                        Thread.sleep(1000);
                        rect.repaint();
                    }
                } catch (InterruptedException e){
                    System.out.println("Exception in moving");
                }
                */


/*
                frame.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {

                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                        if(e.getKeyCode() == KeyEvent.VK_A){
                            rect.setX(-10);
                            rect.repaint();
                            System.out.println("Left arrow pressed");
                        }
                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }
                });

*/


                /*
                JButton left = new JButton("Left");
                frame.add(left);
                left.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        rect.setX(-10);
                        rect.repaint();
                    }
                });

                JButton right = new JButton("Right");
                frame.add(right);
                right.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        rect.setX(10);
                        rect.repaint();
                        System.out.println("Right button pressed.");
                    }
                });




                JButton up = new JButton("Up");
                frame.add(up);
                up.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        rect.setY(-10);
                        rect.repaint();
                    }
                });

                JButton down = new JButton("down");
                frame.add(down);
                down.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        rect.setY(10);
                        rect.repaint();
                    }
                });
                */

            }
        });
    }
}



