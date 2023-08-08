/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_CYCLE_2.Q5;

//import java.awt.BorderLayout;
//import java.awt.Dimension;
//import java.awt.GridLayout;
//import java.awt.TextField;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JTextField;

/**
 *
 * @author lanaa
 */
//public class SimpleCalculator extends JFrame {
//
//    JPanel myPanel;
//    JButton addBtn, subBtn, equalBtn, clearBtn;
//    JTextField textField1;
//
//    double num1, num2, result;
//    char operator;
//
//    public SimpleCalculator() {
//        this.setSize(300, 300);
//        this.setLocation(900, 500);
//
//        textField1 = new JTextField();
//        textField1.setSize(100 , 100);
//        textField1.setLocation(100, 100);
//        
//        
//
//        addBtn = new JButton("+");
//        subBtn = new JButton("-");
//        equalBtn = new JButton("=");
//        clearBtn = new JButton("Clear");
//
//        addBtn.setBounds(10, 80, 60, 40); // X, Y, Width, Height
//        subBtn.setBounds(10, 130, 60, 40);
//
//        // Positioning buttons on the other side
//        equalBtn.setBounds(220, 80, 60, 40);
//        clearBtn.setBounds(220, 130, 60, 40);
//
//        myPanel = new JPanel();
////        myPanel.setLayout(new GridLayout(5, 5, 10, 10));
//        myPanel.add(addBtn);
//        myPanel.add(subBtn);
//
//        myPanel.add(equalBtn);
//        myPanel.add(clearBtn);
//
//        this.add(textField1);
//        this.add(myPanel); 
//
//        addBtn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                num1 = Double.parseDouble(textField1.getText());
//                operator = '+';
//                textField1.setText(num1+"+");
//            }
//        });
//
//        equalBtn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                num2 = Double.parseDouble(textField1.getText());
//                switch (operator) {
//                    case '+':
//                        result = num1 + num2;
//                        break;
//                }
//
//                textField1.setText(String.valueOf(result));
//
//            }
//
//
//        });
//
//        clearBtn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                textField1.setText("");
//                
//            }
//        });
//        this.setLayout(null); // Use null layout for manual positioning
////        this.setVisible(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setVisible(true);
//    }
//
//}

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator extends JFrame {

    JPanel myPanel;
    JButton addBtn, subBtn, equalBtn, clearBtn;
    JTextField textField1;

    double num1, num2, result;
    char operator;

    public SimpleCalculator() {
        this.setSize(300, 300);
        this.setLocation(900, 500);

        textField1 = new JTextField();
        
        addBtn = new JButton("+");
        subBtn = new JButton("-");
        equalBtn = new JButton("=");
        clearBtn = new JButton("Clear");

        myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(2, 2, 10, 10));
        myPanel.add(addBtn);
        myPanel.add(subBtn);
        myPanel.add(equalBtn);
        myPanel.add(clearBtn);

        this.add(textField1, BorderLayout.NORTH);
        this.add(myPanel, BorderLayout.CENTER);

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField1.getText());
                operator = '+';
                textField1.setText("");
                textField1.setText("+");
            }
        });

        equalBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(textField1.getText());
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                }

                textField1.setText(String.valueOf(result));
            }
        });

        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    
}


