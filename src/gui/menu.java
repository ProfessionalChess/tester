package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame{
    private JPanel panel1;
    private JButton PLAYButton;
    private JButton twoPlayerButton;
    private JButton singleplayerButton;

    public menu() {

        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        singleplayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new board();
                panel1.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {

    }


}
