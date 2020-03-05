package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class board extends JFrame{

    private JPanel mainBoard;
    private JButton b11;
    private JButton b35;
    private JButton b21;
    private JButton b31;
    private JButton b41;
    private JButton b51;
    private JButton b61;
    private JButton b71;
    private JButton b81;
    private JButton b12;
    private JButton b22;
    private JButton b32;
    private JButton b42;
    private JButton b52;
    private JButton b62;
    private JButton b72;
    private JButton b82;
    private JButton b13;
    private JButton b23;
    private JButton b33;
    private JButton b43;
    private JButton b53;
    private JButton b63;
    private JButton b73;
    private JButton b83;
    private JButton b14;
    private JButton b24;
    private JButton b34;
    private JButton b44;
    private JButton b54;
    private JButton b64;
    private JButton b74;
    private JButton b84;
    private JButton b15;
    private JButton b25;
    private JButton b45;
    private JButton b55;
    private JButton b65;
    private JButton b75;
    private JButton b85;
    private JButton b16;
    private JButton b26;
    private JButton b36;
    private JButton b46;
    private JButton b56;
    private JButton b66;
    private JButton b76;
    private JButton b86;
    private JButton b17;
    private JButton b27;
    private JButton b37;
    private JButton b47;
    private JButton b57;
    private JButton b67;
    private JButton b77;
    private JButton b87;
    private JButton b18;
    private JButton b28;
    private JButton b38;
    private JButton b48;
    private JButton b58;
    private JButton b68;
    private JButton b78;
    private JButton b88;
    private JPanel q1;
    private JPanel q2;
    private JPanel q3;
    private JPanel q4;
    private JPanel q5;
    private JPanel q6;
    private JPanel q7;
    private JPanel q8;
    private JPanel q9;
    private JPanel q10;
    private JPanel q11;
    private JPanel q12;
    private JPanel q13;
    private JPanel q14;
    private JPanel q15;
    private JPanel q16;
    private JPanel q17;
    private JPanel q18;
    private JPanel q19;
    private JPanel q20;
    private JPanel q21;
    private JPanel q22;
    private JPanel q23;
    private JPanel q24;
    private JPanel q25;
    private JPanel q26;
    private JPanel q27;
    private JPanel q28;
    private JPanel q29;
    private JPanel q30;
    private JPanel q31;
    private JPanel q32;
    private JPanel q33;
    private JPanel q34;
    private JPanel q35;
    private JPanel q36;
    private JPanel q37;
    private JPanel q38;
    private JPanel q39;
    private JPanel q40;
    private JPanel q41;
    private JPanel q42;
    private JPanel q43;
    private JPanel q44;
    private JPanel q45;
    private JPanel q46;
    private JPanel q47;
    private JPanel q48;
    private JPanel q49;
    private JPanel q50;
    private JPanel q51;
    private JPanel q52;
    private JPanel q53;
    private JPanel q54;
    private JPanel q55;
    private JPanel q56;
    private JPanel q57;
    private JPanel q58;
    private JPanel q59;
    private JPanel q60;
    private JPanel q61;
    private JPanel q62;
    private JPanel q63;
    private JPanel q64;
    public static int num1 = 0;
    public static int num2 = 0;

    public board() {
        this.setContentPane(mainBoard);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }
    public static void main(String[] args) {


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void trackMove(int input) {
       if (input == num1) {
           num1 = 0;
       } else if (num1 == 0) {
           num1 = input;
       } else if(num1 != 0) {
           num2 = input;
       } else {
           System.out.println("huh");
       }
    }
}
