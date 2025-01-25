import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator {
    @SuppressWarnings("Convert2Lambda")
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create a text field for input/output
        JTextField textField = new JTextField();
        textField.setBounds(30, 40, 340, 50);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setEditable(false); // Prevent manual editing
        frame.add(textField);

        // Array for buttons
        String[] buttons = {
            "7", "8", "9", "/", 
            "4", "5", "6", "*", 
            "1", "2", "3", "-", 
            "C", "0", "=", "+"
        };

        // Create buttons and add to the frame
        JButton[] buttonObjects = new JButton[buttons.length];
        int x = 30, y = 120;

        for (int i = 0; i < buttons.length; i++) {
            buttonObjects[i] = new JButton(buttons[i]);
            buttonObjects[i].setBounds(x, y, 80, 50);
            buttonObjects[i].setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(buttonObjects[i]);

            x += 90; // Move button horizontally

            if ((i + 1) % 4 == 0) { // Move to the next row after 4 buttons
                x = 30;
                y += 60;
            }
        }

        // Variables to store state
        final String[] operator = {""}; // Operator as a single element array for mutability
        final double[] num1 = {0}; // First number
        final boolean[] isNewOperation = {true}; // Tracks if the user starts a new operation

        // Add functionality to the buttons
        for (JButton button : buttonObjects) {
            button.addActionListener(new ActionListener() {
                @Override
                @SuppressWarnings("ConvertToStringSwitch")
                public void actionPerformed(ActionEvent e) {
                    String buttonText = button.getText();

                    // Clear the text field
                    if (buttonText.equals("C")) {
                        textField.setText("");
                        operator[0] = "";
                        num1[0] = 0;
                        isNewOperation[0] = true;
                    } 
                    // Perform calculation
                    else if (buttonText.equals("=")) {
                        if (!operator[0].isEmpty()) {
                            double num2 = Double.parseDouble(textField.getText());
                            double result = 0;

                            // Perform the correct operation
                            switch (operator[0]) {
                                case "+" -> result = num1[0] + num2;
                                case "-" -> result = num1[0] - num2;
                                case "*" -> result = num1[0] * num2;
                                case "/" -> result = num2 != 0 ? num1[0] / num2 : Double.NaN; // Avoid division by zero
                            }
                            textField.setText(String.valueOf(result));
                            isNewOperation[0] = true; // Reset for a new operation
                        }
                    } 
                    // Set operator
                    else if (buttonText.equals("+") || buttonText.equals("-") || buttonText.equals("*") || buttonText.equals("/")) {
                        num1[0] = Double.parseDouble(textField.getText());
                        operator[0] = buttonText;
                        isNewOperation[0] = true;
                    } 
                    // Append numbers
                    else {
                        if (isNewOperation[0]) {
                            textField.setText(buttonText); // Start fresh for a new input
                            isNewOperation[0] = false;
                        } else {
                            textField.setText(textField.getText() + buttonText);
                        }
                    }
                }
            });
        }

        // Set the frame visible
        frame.setVisible(true);
    }
}
