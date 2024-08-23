import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    private JTextField inputField;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton equalButton, clearButton;
    private String[] operators = {"+", "-", "*", "/"};
    private String operator = "";
    private double[] operands = new double[4];
    private int operandCount = 0;

    public Calculator() {
        setTitle("Calculator");
        setSize(400, 600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 24));
        add(inputField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));
        add(panel, BorderLayout.CENTER);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            panel.add(numberButtons[i]);
        }

        operatorButtons = new JButton[4];
        for (int i = 0; i < 4; i++) {
            operatorButtons[i] = new JButton(operators[i]);
            operatorButtons[i].addActionListener(this);
            panel.add(operatorButtons[i]);
        }

        equalButton = new JButton("=");
        equalButton.addActionListener(this);
        panel.add(equalButton);

        clearButton = new JButton("C");
        clearButton.addActionListener(this);
        panel.add(clearButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            inputField.setText(inputField.getText() + command);
        } else if (command.equals("C")) {
            inputField.setText("");
            operator = "";
            operandCount = 0;
        } else if (command.equals("=")) {
            if (!inputField.getText().isEmpty()) {
                operands[operandCount] = Double.parseDouble(inputField.getText());
                operandCount++;
                double result = operands[0];
                for (int i = 1; i < operandCount; i++) {
                    if (operator.equals("+")) {
                        result += operands[i];
                    } else if (operator.equals("-")) {
                        result -= operands[i];
                    } else if (operator.equals("*")) {
                        result *= operands[i];
                    } else if (operator.equals("/")) {
                        if (operands[i] != 0) {
                            result /= operands[i];
                        } else {
                            JOptionPane.showMessageDialog(this, "Cannot divide by zero.");
                            return;
                        }
                    }
                }
                inputField.setText(String.valueOf(result));
                operator = "";
                operandCount = 0;
            }
        } else {
            if (!inputField.getText().isEmpty()) {
                operands[operandCount] = Double.parseDouble(inputField.getText());
                operandCount++;
                operator = command;
                inputField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}


