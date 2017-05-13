// Tetris Game

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Tetris extends JFrame {
    JMenuBar menubar;
    JMenu game;
    JMenuItem newgame;
    JMenuItem exit;

    public Tetris(){
        setLayout(new FlowLayout());

        menubar = new JMenuBar();
        setJMenuBar(menubar);

        game = new JMenu("Game");
        menubar.add(game);

        newgame = new JMenuItem("New Game");
        game.add(newgame);

        exit = new JMenuItem("Exit");
        game.add(exit);

        event e = new event();
        exit.addActionListener(e);

    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }

    public static void main(String args[]){

        ImageIcon tetrisicon = new ImageIcon("tetris.jpg");

        Tetris gui = new Tetris();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(800,1000);
        gui.setTitle("Tetris");
        gui.setResizable(false);
        //gui.setIconImage(tetrisicon.getImage());

    }
}

