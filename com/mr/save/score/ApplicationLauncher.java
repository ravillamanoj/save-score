package com.mr.save.score;

import javax.swing.*;
import java.awt.event.*;

/**
 * This class is used for launching initial application screen where an user can enter names of the players and
 * can set the maximum winning score.
 *
 * @author Manoj
 */
public class ApplicationLauncher extends JFrame implements ActionListener {
    JButton b;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    String s1, s2, s3, s4, s5, s6, s7, s8, s9;
    String s;
    int n;

    public ApplicationLauncher() {
        setLayout(null);
        l1 = new JLabel("enter player 1 name:");
        add(l1);
        l1.setBounds(10, 10, 150, 30);
        t1 = new JTextField();
        add(t1);
        t1.setBounds(160, 10, 100, 30);
        l2 = new JLabel("enter player 2 name:");
        add(l2);
        l2.setBounds(10, 50, 150, 30);
        t2 = new JTextField();
        add(t2);
        t2.setBounds(160, 50, 100, 30);
        l3 = new JLabel("enter player 3 name:");
        add(l3);
        l3.setBounds(10, 90, 150, 30);
        t3 = new JTextField();
        add(t3);
        t3.setBounds(160, 90, 100, 30);
        l4 = new JLabel("enter player 4 name:");
        add(l4);
        l4.setBounds(10, 130, 150, 30);
        t4 = new JTextField();
        add(t4);
        t4.setBounds(160, 130, 100, 30);
        l5 = new JLabel("enter player 5 name:");
        add(l5);
        l5.setBounds(10, 170, 150, 30);
        t5 = new JTextField();
        add(t5);
        t5.setBounds(160, 170, 100, 30);
        l6 = new JLabel("enter player 6 name:");
        add(l6);
        l6.setBounds(10, 210, 150, 30);
        t6 = new JTextField();
        add(t6);
        t6.setBounds(160, 210, 100, 30);
        l7 = new JLabel("enter player 7 name:");
        add(l7);
        l7.setBounds(10, 250, 150, 30);
        t7 = new JTextField();
        add(t7);
        t7.setBounds(160, 250, 100, 30);
        l8 = new JLabel("enter player 8 name:");
        add(l8);
        l8.setBounds(10, 290, 150, 30);
        t8 = new JTextField();
        add(t8);
        t8.setBounds(160, 290, 100, 30);
        l9 = new JLabel("enter maximum points up to which you want to play");
        add(l9);
        l9.setBounds(10, 330, 300, 30);
        t9 = new JTextField("0");
        add(t9);
        t9.setBounds(310, 330, 100, 30);
        b = new JButton("START");
        add(b);
        b.setBounds(100, 360, 100, 30);
        s = "<html><font color=green size=50><b>COUNTER</b></font></html>";
        l10 = new JLabel(s);
        add(l10);
        l10.setBounds(300, 100, 200, 200);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {
            //TO CHECK WHETHER THE ENTERED NUMBER IS A POSITIVE INTEGER OR NOT
            try {
                Integer.parseInt(t9.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(ApplicationLauncher.this, "Maximum points should be positive only");
            }

            s1 = t1.getText();
            s2 = t2.getText();
            s3 = t3.getText();
            s4 = t4.getText();
            s5 = t5.getText();
            s6 = t6.getText();
            s7 = t7.getText();
            s8 = t8.getText();
            s9 = t9.getText();

            // TO CHECK IF MINIMUM TWO PLAYER NAMES WERE ENTERED
            if (!((s1.equals("") && s2.equals("") && s3.equals("") && s4.equals("") && s5.equals("") && s6.equals("") && s7.equals("") && s8.equals("")) ||
                    (!s1.equals("") && s2.equals("") && s3.equals("") && s4.equals("") && s5.equals("") && s6.equals("") && s7.equals("") && s8.equals("")) ||
                    (s1.equals("") && !s2.equals("") && s3.equals("") && s4.equals("") && s5.equals("") && s6.equals("") && s7.equals("") && s8.equals("")) ||
                    (s1.equals("") && s2.equals("") && !s3.equals("") && s4.equals("") && s5.equals("") && s6.equals("") && s7.equals("") && s8.equals("")) ||
                    (s1.equals("") && s2.equals("") && s3.equals("") && !s4.equals("") && s5.equals("") && s6.equals("") && s7.equals("") && s8.equals("")) ||
                    (s1.equals("") && s2.equals("") && s3.equals("") && s4.equals("") && !s5.equals("") && s6.equals("") && s7.equals("") && s8.equals("")) ||
                    (s1.equals("") && s2.equals("") && s3.equals("") && s4.equals("") && s5.equals("") && !s6.equals("") && s7.equals("") && s8.equals("")) ||
                    (s1.equals("") && s2.equals("") && s3.equals("") && s4.equals("") && s5.equals("") && s6.equals("") && !s7.equals("") && s8.equals("")) ||
                    (s1.equals("") && s2.equals("") && s3.equals("") && s4.equals("") && s5.equals("") && s6.equals("") && s7.equals("") && !s8.equals("")))) {

                //IF MINIMUM TWO PLAYER NAMES WERE ENTERED THEN CHECK IF THE MAXIMUM POINTS IS GREATERTHAN ZERO
                if (Integer.parseInt(t9.getText()) > 0) {
                    ApplicationLauncher.this.dispose();
                    ScoreCounter d = new ScoreCounter(s1, s2, s3, s4, s5, s6, s7, s8, s9);
                    d.setVisible(true);
                    d.setSize(300, 300);
                    d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                } else
                    JOptionPane.showMessageDialog(ApplicationLauncher.this, "Maximum points should be positive only");
            } else
                JOptionPane.showMessageDialog(ApplicationLauncher.this, "enter minimum two players");
        }
    }

    public static void main(String args[]) {
        ApplicationLauncher cc = new ApplicationLauncher();
        cc.setVisible(true);
        cc.setSize(600, 600);
        cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}