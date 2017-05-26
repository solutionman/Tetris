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
        final int RECTWIDTH = 100;
        final int RECTHEIGHT = 50;

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Tetris");
                frame.setSize(FRAMEWIDTH, FRAMEHEIGHT);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);


                frame.setFocusable(true);
                frame.setFocusableWindowState(true);
                frame.requestFocus();




                // from here we work with figure
                ShowSomeGraphics figure = new ShowSomeGraphics(370, 0, RECTWIDTH, RECTHEIGHT);
                ShowStaticGraphics figure2 = new ShowStaticGraphics(400, 300, 100, 50);
                ShowStaticGraphics figure3 = new ShowStaticGraphics(450, 350, 50, 100);

                // why only last added shown?
                //frame.add(figure2);
                //frame.add(figure3);
                frame.add(figure);
                //panel.add(figure);
                //frame.add(figure2);
                //frame.add(figure3);


                // Here we move our figure to bottom
                Timer timer = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        figure.setY(1);
                        figure.repaint();
                        figure2.repaint();
                        figure3.repaint();

                        // if we reach bottom - begin from top again
                        if (figure.getY() == FRAMEHEIGHT - 30 - figure.getHeight()){

                            figure.setOldX(figure.getX());
                            figure.setOldY(figure.getY());
                            figure.setOldHeight(figure.getHeight());
                            figure.setOldWidth(figure.getWidth());

                            figure.setX(-(370 - figure.getX()));
                            figure.setY(-520);
                            figure.setHeight(50);
                            figure.setWidth(100);
                            figure.repaint();
                        }
                    }
                });
                timer.start();


                // here we bound keys to manipulate the object
                frame.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                        if (e.getKeyCode() == KeyEvent.VK_D) {
                            figure.setX(10);
                            figure.repaint();
                            //System.out.println("Right arrow pressed");
                        } else if (e.getKeyCode() == KeyEvent.VK_A) {
                            figure.setX(-10);
                            figure.repaint();
                            //System.out.println("Left arrow pressed");
                        } else if (e.getKeyCode() == KeyEvent.VK_W) {
                            int temp = figure.getWidth();
                            figure.setWidth(figure.getHeight());
                            figure.setHeight(temp);
                            if(figure.getX() > FRAMEWIDTH - figure.getWidth()){
                                figure.setX(100);
                            }
                            figure.repaint();
                        } else if (e.getKeyCode() == KeyEvent.VK_S) {
                            figure.setY(150);
                            figure.repaint();
                        }
                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }
                });

            }
        });
    }
}




