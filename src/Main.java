import javax.swing.*;

class Calculator extends JFrame {
    JLabel l1, l2, resultLabel, output;
    JTextField number1TextField, number2TextField;
    JButton divideButton, additionButton, subtractButton, MultiButton, clearButton;

    Calculator() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setLayout(null);


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
