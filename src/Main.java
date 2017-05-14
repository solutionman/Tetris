// Begin everything from scratch

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Tetris");
                frame.setSize(800, 600);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setLayout(new GridLayout(2,3));
                frame.setVisible(true);

                ShowSomeGraphics rect = new ShowSomeGraphics(180, 150, 50, 50);
                frame.add(rect);




                JButton right = new JButton("Right");
                frame.add(right);
                right.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        rect.setX(10);
                        rect.repaint();
                    }
                });

                JButton left = new JButton("Left");
                frame.add(left);
                left.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        rect.setX(-10);
                        rect.repaint();
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


            }
        });
    }
}

