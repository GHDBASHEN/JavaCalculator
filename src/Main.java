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
