package com.mr.save.score;

import javax.swing.*;
import java.awt.event.*;

/**
 * Calculates scores based on the user input.
 *
 * @author Manoj
 */
public class ScoreCounter extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8;
    JButton b1, b2, b3;
    String p1, p2, p3, p4, p5, p6, p7, p8, p9;
    int n;

    public ScoreCounter(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9) {
        p1 = s1;
        p2 = s2;
        p3 = s3;
        p4 = s4;
        p5 = s6;
        p6 = s6;
        p7 = s7;
        p8 = s8;
        p9 = s9;
        n = Integer.parseInt(s9);

        setLayout(null);
        l1 = new JLabel("Player name");
        add(l1);
        l1.setBounds(10, 10, 100, 30);
        l2 = new JLabel("Points");
        add(l2);
        l2.setBounds(10, 50, 100, 30);
        l3 = new JLabel("wins");
        add(l3);
        l3.setBounds(10, 90, 100, 30);
        l4 = new JLabel("enter score");
        add(l4);
        l4.setBounds(10, 130, 100, 30);
        b1 = new JButton("APPLY");
        add(b1);
        b1.setBounds(100, 180, 100, 30);
        b2 = new JButton("RESET");
        add(b2);
        b2.setBounds(10, 230, 100, 30);
        b3 = new JButton("BACK");
        add(b3);
        b3.setBounds(130, 230, 100, 30);

        int x1 = 10, y1 = 10, x11 = 100, y11 = 30;
        int x2 = 10, y2 = 50, x22 = 100, y22 = 30;
        int x3 = 10, y3 = 90, x33 = 100, y33 = 30;
        int x4 = 10, y4 = 130, x44 = 100, y44 = 30;

        if (!s1.equals("")) {
            l5 = new JLabel(s1);
            add(l5);
            l5.setBounds(x1 + x11 + 10, 10, 100, 30);
            x1 = x1 + x11 + 10;
            l8 = new JLabel("0");
            add(l8);
            l8.setBounds(x2 + x22 + 10, 50, 100, 30);
            x2 = x2 + x22 + 10;
            l11 = new JLabel("0");
            add(l11);
            l11.setBounds(x3 + x33 + 10, 90, 100, 30);
            x3 = x3 + x33 + 10;
            t1 = new JTextField("0");
            add(t1);
            t1.setBounds(x4 + x44 + 10, 130, 100, 30);
            x4 = x4 + x44 + 10;
        }

        if (!s2.equals("")) {
            l6 = new JLabel(s2);
            add(l6);
            l6.setBounds(x1 + x11 + 10, 10, 100, 30);
            x1 = x1 + x11 + 10;
            l9 = new JLabel("0");
            add(l9);
            l9.setBounds(x2 + x22 + 10, 50, 100, 30);
            x2 = x2 + x22 + 10;
            l12 = new JLabel("0");
            add(l12);
            l12.setBounds(x3 + x33 + 10, 90, 100, 30);
            x3 = x3 + x33 + 10;
            t2 = new JTextField("0");
            add(t2);
            t2.setBounds(x4 + x44 + 10, 130, 100, 30);
            x4 = x4 + x44 + 10;
        }

        if (!s3.equals("")) {
            l7 = new JLabel(s3);
            add(l7);
            l7.setBounds(x1 + x11 + 10, 10, 100, 30);
            x1 = x1 + x11 + 10;
            l10 = new JLabel("0");
            add(l10);
            l10.setBounds(x2 + x22 + 10, 50, 100, 30);
            x2 = x2 + x22 + 10;
            l13 = new JLabel("0");
            add(l13);
            l13.setBounds(x3 + x33 + 10, 90, 100, 30);
            x3 = x3 + x33 + 10;
            t3 = new JTextField("0");
            add(t3);
            t3.setBounds(x4 + x44 + 10, 130, 100, 30);
            x4 = x4 + x44 + 10;
        }

        if (!s4.equals("")) {
            l14 = new JLabel(s4);
            add(l14);
            l14.setBounds(x1 + x11 + 10, 10, 100, 30);
            x1 = x1 + x11 + 10;
            l15 = new JLabel("0");
            add(l15);
            l15.setBounds(x2 + x22 + 10, 50, 100, 30);
            x2 = x2 + x22 + 10;
            l16 = new JLabel("0");
            add(l16);
            l16.setBounds(x3 + x33 + 10, 90, 100, 30);
            x3 = x3 + x33 + 10;
            t4 = new JTextField("0");
            add(t4);
            t4.setBounds(x4 + x44 + 10, 130, 100, 30);
            x4 = x4 + x44 + 10;
        }

        if (!s5.equals("")) {
            l17 = new JLabel(s5);
            add(l17);
            l17.setBounds(x1 + x11 + 10, 10, 100, 30);
            x1 = x1 + x11 + 10;
            l18 = new JLabel("0");
            add(l18);
            l18.setBounds(x2 + x22 + 10, 50, 100, 30);
            x2 = x2 + x22 + 10;
            l19 = new JLabel("0");
            add(l19);
            l19.setBounds(x3 + x33 + 10, 90, 100, 30);
            x3 = x3 + x33 + 10;
            t5 = new JTextField("0");
            add(t5);
            t5.setBounds(x4 + x44 + 10, 130, 100, 30);
            x4 = x4 + x44 + 10;
        }

        if (!s6.equals("")) {
            l20 = new JLabel(s6);
            add(l20);
            l20.setBounds(x1 + x11 + 10, 10, 100, 30);
            x1 = x1 + x11 + 10;
            l21 = new JLabel("0");
            add(l21);
            l21.setBounds(x2 + x22 + 10, 50, 100, 30);
            x2 = x2 + x22 + 10;
            l22 = new JLabel("0");
            add(l22);
            l22.setBounds(x3 + x33 + 10, 90, 100, 30);
            x3 = x3 + x33 + 10;
            t6 = new JTextField("0");
            add(t6);
            t6.setBounds(x4 + x44 + 10, 130, 100, 30);
            x4 = x4 + x44 + 10;
        }

        if (!s7.equals("")) {
            l23 = new JLabel(s7);
            add(l23);
            l23.setBounds(x1 + x11 + 10, 10, 100, 30);
            x1 = x1 + x11 + 10;
            l24 = new JLabel("0");
            add(l24);
            l24.setBounds(x2 + x22 + 10, 50, 100, 30);
            x2 = x2 + x22 + 10;
            l25 = new JLabel("0");
            add(l25);
            l25.setBounds(x3 + x33 + 10, 90, 100, 30);
            x3 = x3 + x33 + 10;
            t7 = new JTextField("0");
            add(t7);
            t7.setBounds(x4 + x44 + 10, 130, 100, 30);
            x4 = x4 + x44 + 10;
        }

        if (!s8.equals("")) {
            l26 = new JLabel(s8);
            add(l26);
            l26.setBounds(x1 + x11 + 10, 10, 100, 30);
            x1 = x1 + x11 + 10;
            l27 = new JLabel("0");
            add(l27);
            l27.setBounds(x2 + x22 + 10, 50, 100, 30);
            x2 = x2 + x22 + 10;
            l28 = new JLabel("0");
            add(l28);
            l28.setBounds(x3 + x33 + 10, 90, 100, 30);
            x3 = x3 + x33 + 10;
            t8 = new JTextField("0");
            add(t8);
            t8.setBounds(x4 + x44 + 10, 130, 100, 30);
            x4 = x4 + x44 + 10;
        }

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            if (!p1.equals("") && Integer.parseInt(l8.getText()) <= n) {
                try {
                    Integer.parseInt(t1.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(ScoreCounter.this, "please enter integer only");
                }
                l8.setText(Integer.toString(Integer.parseInt(t1.getText()) + Integer.parseInt(l8.getText())));
                if (Integer.parseInt(t1.getText()) == 0) {
                    l11.setText(Integer.toString(Integer.parseInt(l11.getText()) + 1));
                }
            }

            t1.setText("0");

            if (!p2.equals("") && Integer.parseInt(l9.getText()) <= n) {
                try {
                    Integer.parseInt(t2.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(ScoreCounter.this, "please enter integer only");
                }
                l9.setText(Integer.toString(Integer.parseInt(t2.getText()) + Integer.parseInt(l9.getText())));
                if (Integer.parseInt(t2.getText()) == 0) {
                    l12.setText(Integer.toString(Integer.parseInt(l12.getText()) + 1));
                }
            }

            t2.setText("0");

            if (!p3.equals("") && Integer.parseInt(l10.getText()) <= n) {
                try {
                    Integer.parseInt(t3.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(ScoreCounter.this, "please enter integer only");
                }
                l10.setText(Integer.toString(Integer.parseInt(t3.getText()) + Integer.parseInt(l10.getText())));
                if (Integer.parseInt(t3.getText()) == 0) {
                    l13.setText(Integer.toString(Integer.parseInt(l13.getText()) + 1));
                }
            }

            t3.setText("0");

            if (!p4.equals("") && Integer.parseInt(l15.getText()) <= n) {
                try {
                    Integer.parseInt(t4.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(ScoreCounter.this, "please enter integer only");
                }
                l15.setText(Integer.toString(Integer.parseInt(t4.getText()) + Integer.parseInt(l15.getText())));
                if (Integer.parseInt(t4.getText()) == 0) {
                    l16.setText(Integer.toString(Integer.parseInt(l16.getText()) + 1));
                }
            }

            t4.setText("0");

            if (!p5.equals("") && Integer.parseInt(l18.getText()) <= n) {
                try {
                    Integer.parseInt(t5.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(ScoreCounter.this, "please enter integer only");
                }
                l18.setText(Integer.toString(Integer.parseInt(t5.getText()) + Integer.parseInt(l18.getText())));
                if (Integer.parseInt(t5.getText()) == 0) {
                    l19.setText(Integer.toString(Integer.parseInt(l19.getText()) + 1));
                }
            }

            t5.setText("0");

            if (!p6.equals("") && Integer.parseInt(l21.getText()) <= n) {
                try {
                    Integer.parseInt(t6.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(ScoreCounter.this, "please enter integer only");
                }
                l21.setText(Integer.toString(Integer.parseInt(t6.getText()) + Integer.parseInt(l21.getText())));
                if (Integer.parseInt(t6.getText()) == 0) {
                    l22.setText(Integer.toString(Integer.parseInt(l22.getText()) + 1));
                }
            }

            t6.setText("0");

            if (!p7.equals("") && Integer.parseInt(l24.getText()) <= n) {
                try {
                    Integer.parseInt(t7.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(ScoreCounter.this, "please enter integer only");
                }
                l24.setText(Integer.toString(Integer.parseInt(t7.getText()) + Integer.parseInt(l24.getText())));
                if (Integer.parseInt(t7.getText()) == 0) {
                    l25.setText(Integer.toString(Integer.parseInt(l25.getText()) + 1));
                }
            }

            t7.setText("0");

            if (!p8.equals("") && Integer.parseInt(l27.getText()) <= n) {
                try {
                    Integer.parseInt(t8.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(ScoreCounter.this, "please enter integer only");
                }
                l27.setText(Integer.toString(Integer.parseInt(t8.getText()) + Integer.parseInt(l27.getText())));
                if (Integer.parseInt(t8.getText()) == 0) {
                    l28.setText(Integer.toString(Integer.parseInt(l28.getText()) + 1));
                }
            }
            t8.setText("0");
        }

        if (ae.getSource() == b2) {
            l8.setText("0");
            l9.setText("0");
            l10.setText("0");
            l11.setText("0");
            l12.setText("0");
            l13.setText("0");
            l15.setText("0");
            l16.setText("0");
            l18.setText("0");
            l19.setText("0");
            l21.setText("0");
            l22.setText("0");
            l24.setText("0");
            l25.setText("0");
            l27.setText("0");
            l28.setText("0");
            t1.setText("0");
            t2.setText("0");
            t3.setText("0");
            t4.setText("0");
            t5.setText("0");
            t6.setText("0");
            t7.setText("0");
            t8.setText("0");
        }

        if (ae.getSource() == b3) {
            ApplicationLauncher cc = new ApplicationLauncher();
            cc.setVisible(true);
            cc.setSize(600, 600);
            cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ScoreCounter.this.dispose();
        }
    }
}
