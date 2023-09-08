package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame {
    
    SnakeGame(){
//        setLocation(100,100);
        super("Snake Game");
        add(new Board());
        pack();
        
//        setSize(300, 300);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
}
