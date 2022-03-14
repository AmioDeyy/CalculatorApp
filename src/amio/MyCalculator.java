package amio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator extends JFrame implements ActionListener {
    JPanel p1, p2, p3;
    JTextField text;
    JButton buttonSqrt, buttonRec, b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, buttonAdd,
            buttonSub, buttonMul, buttonDiv, buttonDec, buttonEq, buttonClr, buttonOff;
    double n1, n2, result;
    int flag;

    MyCalculator() {
        setSize(600, 650);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);


        Font f = new Font("Arial", Font.BOLD, 30);


        p1 = new JPanel();
        p1.setBounds(0, 0, 600, 150);
        p1.setBackground(Color.BLACK);
        p1.setLayout(null);
        add(p1);

        p2 = new JPanel();
        p2.setBounds(0, 150, 450, 450);
        p2.setBackground(Color.RED);
        p2.setLayout(new GridLayout(4, 3, 5, 5));
        add(p2);

        p3 = new JPanel();
        p3.setBounds(450, 150, 150, 450);
        p3.setBackground(Color.BLACK);
        p3.setLayout(new GridLayout(4, 1, 5, 5));
        add(p3);

        text = new JTextField();
        text.setBounds(20, 20, 540, 110);
        text.setFont(f);
        p1.add(text);

        buttonOff = new JButton("OFF");
        buttonSqrt = new JButton("\u221A");
        buttonRec = new JButton("1/X");
        buttonClr = new JButton("Clr");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        buttonDec = new JButton(".");
        buttonEq = new JButton("=");


        p2.add(buttonOff);
        p2.add(buttonSqrt);
        p2.add(buttonRec);
        p2.add(buttonClr);
        p2.add(b9);
        p2.add(b8);
        p2.add(b7);
        p2.add(b6);
        p2.add(b5);
        p2.add(b4);
        p2.add(b3);
        p2.add(b2);
        p2.add(b1);
        p2.add(b0);
        p2.add(buttonDec);
        p2.add(buttonEq);

        buttonAdd = new JButton("+");
        buttonSub = new JButton("-");
        buttonMul = new JButton("*");
        buttonDiv = new JButton("/");

        p3.add(buttonAdd);
        p3.add(buttonSub);
        p3.add(buttonMul);
        p3.add(buttonDiv);

        buttonOff.addActionListener(this);
        buttonOff.setFont(f);
        buttonOff.setBackground(Color.GRAY);

        buttonSqrt.addActionListener(this);
        buttonSqrt.setFont(f);
        buttonSqrt.setBackground(Color.LIGHT_GRAY);

        buttonRec.addActionListener(this);
        buttonRec.setFont(f);
        buttonRec.setBackground(Color.LIGHT_GRAY);

        buttonClr.addActionListener(this);
        buttonClr.setFont(f);
        buttonClr.setBackground(Color.LIGHT_GRAY);

        b1.addActionListener(this);
        b1.setFont(f);
        b1.setBackground(Color.WHITE);
        b1.setFocusable(true);

        b2.addActionListener(this);
        b2.setFont(f);
        b2.setBackground(Color.WHITE);

        b3.addActionListener(this);
        b3.setFont(f);
        b3.setBackground(Color.WHITE);

        b4.addActionListener(this);
        b4.setFont(f);
        b4.setBackground(Color.WHITE);

        b5.addActionListener(this);
        b5.setFont(f);
        b5.setBackground(Color.WHITE);

        b6.addActionListener(this);
        b6.setFont(f);
        b6.setBackground(Color.WHITE);

        b7.addActionListener(this);
        b7.setFont(f);
        b7.setBackground(Color.WHITE);

        b8.addActionListener(this);
        b8.setFont(f);
        b8.setBackground(Color.WHITE);

        b9.addActionListener(this);
        b9.setFont(f);
        b9.setBackground(Color.WHITE);

        b0.addActionListener(this);
        b0.setFont(f);
        b0.setBackground(Color.WHITE);

        buttonDec.addActionListener(this);
        buttonDec.setFont(f);
        buttonDec.setBackground(Color.WHITE);

        buttonEq.addActionListener(this);
        buttonEq.setFont(f);
        buttonEq.setBackground(Color.WHITE);

        buttonAdd.addActionListener(this);
        buttonAdd.setFont(f);
        buttonAdd.setBackground(Color.CYAN);

        buttonSub.addActionListener(this);
        buttonSub.setFont(f);
        buttonSub.setBackground(Color.CYAN);

        buttonMul.addActionListener(this);
        buttonMul.setFont(f);
        buttonMul.setBackground(Color.CYAN);

        buttonDiv.addActionListener(this);
        buttonDiv.setFont(f);
        buttonDiv.setBackground(Color.CYAN);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            text.setText(text.getText() + "1");
        }
        if (e.getSource() == b2) {
            text.setText(text.getText() + "2");
        }
        if (e.getSource() == b3) {
            text.setText(text.getText() + "3");
        }
        if (e.getSource() == b4) {
            text.setText(text.getText() + "4");
        }
        if (e.getSource() == b5) {
            text.setText(text.getText() + "5");
        }
        if (e.getSource() == b6) {
            text.setText(text.getText() + "6");
        }
        if (e.getSource() == b7) {
            text.setText(text.getText() + "7");
        }
        if (e.getSource() == b8) {
            text.setText(text.getText() + "8");
        }
        if (e.getSource() == b9) {
            text.setText(text.getText() + "9");
        }
        if (e.getSource() == b0) {
            text.setText(text.getText() + "0");
        }
        if (e.getSource() == buttonDec) {
            text.setText(text.getText() + ".");

        }

        if (e.getSource() == buttonAdd) {
            try {
                String str1 = text.getText();
                n1 = Double.parseDouble(str1);
            }catch (NumberFormatException es){
                System.out.println(es);
            }
            text.setText("");
            flag = 1;
        }
        if (e.getSource() == buttonSub) {
            try {
                String str1 = text.getText();
                n1 = Double.parseDouble(str1);
            }catch (NumberFormatException es){
                System.out.println(es);
            }
            text.setText("");
            flag = 2;
        }
        if (e.getSource() == buttonMul) {
            try {
                String str1 = text.getText();
                n1 = Double.parseDouble(str1);
            }catch (NumberFormatException es){
                System.out.println(es);
            }
            text.setText("");
            flag = 3;
        }
        if (e.getSource() == buttonDiv) {
            try {
                String str1 = text.getText();
                n1 = Double.parseDouble(str1);
            }catch (NumberFormatException es){
                System.out.println(es);
            }
            text.setText("");
            flag = 4;
        }
        if (e.getSource() == buttonEq) {
            if (flag == 1) {
                String str2 = text.getText();
                n2 = Double.parseDouble(str2);
                result = n1 + n2;
                text.setText(Double.toString(result));

                if (Double.toString(result).endsWith(".0")) {
                    text.setText(Double.toString(result).replace(".0", ""));
                } else {
                    text.setText(Double.toString(result));
                }

            }
            if (flag == 2) {
                String str2 = text.getText();
                n2 = Double.parseDouble(str2);
                result = n1 - n2;
                text.setText(Double.toString(result));

                if (Double.toString(result).endsWith(".0")) {
                    text.setText(Double.toString(result).replace(".0", ""));
                } else {
                    text.setText(Double.toString(result));
                }
            }
            if (flag == 3) {
                String str2 = text.getText();
                n2 = Double.parseDouble(str2);
                result = n1 * n2;
                text.setText(Double.toString(result));

                if (Double.toString(result).endsWith(".0")) {
                    text.setText(Double.toString(result).replace(".0", ""));
                } else {
                    text.setText(Double.toString(result));
                }

            }
            if (flag == 4) {
                String str2 = text.getText();
                n2 = Double.parseDouble(str2);
                result = n1 / n2;
                text.setText(Double.toString(result));

                if (Double.toString(result).endsWith(".0")) {
                    text.setText(Double.toString(result).replace(".0", ""));
                } else {
                    text.setText(Double.toString(result));
                }
            }
        }
        if (e.getSource() == buttonClr) {
            text.setText("");
        }
        if (e.getSource() == buttonSqrt) {
            try {
                String str2 = text.getText();
                n2 = Double.parseDouble(str2);
                result = Math.sqrt(n2);
            }catch(NumberFormatException es){
                System.out.println(es);
            }
            text.setText(Double.toString(result));

            if (Double.toString(result).endsWith(".0")) {
                text.setText(Double.toString(result).replace(".0", ""));
            } else {
                text.setText(Double.toString(result));
            }


        }
        if (e.getSource() == buttonRec) {
            try {
                String str2 = text.getText();
                n1 = Double.parseDouble(str2);
                result = 1 / n1;
            }catch (NumberFormatException es){
                System.out.println(es);
            }
            text.setText(Double.toString(result));

            if (Double.toString(result).endsWith(".0")) {
                text.setText(Double.toString(result).replace(".0", ""));
            } else {
                text.setText(Double.toString(result));
            }
        }

        if(e.getSource() == buttonOff){
            System.exit(0);
        }


    }


}






