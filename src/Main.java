import javax.swing.*;

class Calculator extends JFrame {
    JLabel l1, l2, resultLabel, output;
    JTextField number1TextField, number2TextField;
    JButton divideButton, additionButton, subtractButton, MultiButton, clearButton;

    Calculator() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setLayout(null);
        l1 = new JLabel("Number 1:");
        l1.setBounds(34, 48, 100, 25);
        l2 = new JLabel("Number 2:");
        l2.setBounds(34, 83, 100, 25);
        resultLabel = new JLabel("Result");
        resultLabel.setBounds(263, 48, 100, 25);
        output = new JLabel(" ");
        output.setBounds(263, 79, 100, 25);

        number1TextField = new JTextField();
        number1TextField.setBounds(101, 44, 150, 25);
        number2TextField = new JTextField();
        number2TextField.setBounds(101, 79, 150, 25);

        divideButton = new JButton("Divide");
        divideButton.setBounds(61, 126, 100, 25);

        subtractButton = new JButton("Substraction");
        subtractButton.setBounds(171, 126, 100, 25);

        additionButton = new JButton("Addition");
        additionButton.setBounds(61, 161, 100, 25);

        MultiButton = new JButton("Multiplication");
        MultiButton.setBounds(171, 161, 100, 25);

        clearButton = new JButton("Clear");
        clearButton.setBounds(281, 161, 100, 25);

        divideButton.addActionListener(e -> {
            double num1 = Double.parseDouble(number1TextField.getText());
            double num2 = Double.parseDouble(number2TextField.getText());
            if (num2 == 0) {
                JOptionPane.showMessageDialog(null, "Cannot Divide by Zero", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                double result = num1 / num2;
                output.setText("" + result);
            }
        });

        subtractButton.addActionListener(e -> {
            double num1 = Double.parseDouble(number1TextField.getText());
            double num2 = Double.parseDouble(number2TextField.getText());
            double result = num1 - num2;
            output.setText("" + result);
        });

        additionButton.addActionListener(e -> {
            double num1 = Double.parseDouble(number1TextField.getText());
            double num2 = Double.parseDouble(number2TextField.getText());
            double result = num1 + num2;
            output.setText("" + result);
        });

        MultiButton.addActionListener(e -> {
            double num1 = Double.parseDouble(number1TextField.getText());
            double num2 = Double.parseDouble(number2TextField.getText());
            double result = num1 * num2;
            output.setText("" + result);
        });

        clearButton.addActionListener(e -> {
            number1TextField.setText("");
            number2TextField.setText("");
            output.setText(" ");
        });

        add(l1);
        add(l2);
        add(resultLabel);
        add(output);
        add(number1TextField);
        add(number2TextField);
        add(divideButton);
        add(additionButton);
        add(subtractButton);
        add(MultiButton);
        add(clearButton);
    }

    }
    public class Main {
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                Calculator calculator = new Calculator();
                calculator.setLocationRelativeTo(null); // Center the frame on the screen
                calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                calculator.setVisible(true);
            });
        }
    }
