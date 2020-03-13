package gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

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
                //dlete
                BufferedImage image = null;
                try {
                    URL file = getClass().getResource("data/bRook.jpg");
                    image = ImageIO.read(file);
                } catch (IOException ioex) {
                    System.err.println("load error: " + ioex.getMessage());
                }
                ImageIcon icon1 = new ImageIcon(image);
                //use
                JFrame frame = new board();
                panel1.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {

    }


}
