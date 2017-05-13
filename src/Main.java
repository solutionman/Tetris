// Begin everything from scratch


import javax.swing.*;
import java.awt.*;

public class Main {

    public static class ShowSomeGraphics extends Canvas{
        public void paint(Graphics g){
            g.fillRect(130, 120, 50, 50);
        }
    }

    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Tetris");
                frame.setSize(800, 600);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);

                ShowSomeGraphics rect = new ShowSomeGraphics();
                frame.add(rect);
            }
        });
    }
}

