package Q15;
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

        subBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField1.getText());
                operator = '-';
                textField1.setText("");
                textField1.setText("-");
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

class SimpleCalculatorMain {
//
//    /**
//     * @param args the command line arguments
//     */

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new SimpleCalculator();
//            }
//        });
//    }
//}
    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
