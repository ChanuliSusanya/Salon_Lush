package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PaymentManagementFrame extends JFrame {

    // Components
    private JLabel totalAmountLabel, discountLabel, tipLabel, finalAmountLabel;
    private JComboBox<String> paymentMethodComboBox;
    private JTextField cardNumberField, expiryDateField;
    private JPasswordField cvvField;
    private JButton processPaymentButton, printReceiptButton;
    
    public PaymentManagementFrame() {
        // Set frame properties
        setTitle("Payment Management");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(7, 2, 10, 10));

        // Transaction Summary Display
        totalAmountLabel = new JLabel("Total Amount: $0.00");
        discountLabel = new JLabel("Discount: $0.00");
        tipLabel = new JLabel("Tip: $0.00");
        finalAmountLabel = new JLabel("Final Amount: $0.00");

        // Payment Method Dropdown
        paymentMethodComboBox = new JComboBox<>(new String[]{"Cash", "Credit Card", "Mobile Payment"});
        paymentMethodComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatePaymentMethodFields();
            }
        });

        // Card Details Section (if payment method is Credit Card)
        cardNumberField = new JTextField();
        cardNumberField.setEnabled(false);

        // Expiry Date Field using JFormattedTextField for date input
        expiryDateField = new JTextField();
        expiryDateField.setEnabled(false);
        expiryDateField.setText("MM/YY");

        cvvField = new JPasswordField();
        cvvField.setEnabled(false);

        // Buttons
        processPaymentButton = new JButton("Process Payment");
        printReceiptButton = new JButton("Print Receipt");

        // Add components to the frame
        add(totalAmountLabel);
        add(discountLabel);
        add(tipLabel);
        add(finalAmountLabel);
        add(new JLabel("Payment Method:"));
        add(paymentMethodComboBox);
        add(new JLabel("Card Number:"));
        add(cardNumberField);
        add(new JLabel("Expiry Date:"));
        add(expiryDateField);
        add(new JLabel("CVV:"));
        add(cvvField);
        add(processPaymentButton);
        add(printReceiptButton);
        
        // Make frame visible
        setVisible(true);
    }

    private void updatePaymentMethodFields() {
        String selectedMethod = (String) paymentMethodComboBox.getSelectedItem();
        boolean isCreditCard = "Credit Card".equals(selectedMethod);

        // Enable or disable card fields based on payment method
        cardNumberField.setEnabled(isCreditCard);
        expiryDateField.setEnabled(isCreditCard);
        cvvField.setEnabled(isCreditCard);
    }

    public static void main(String[] args) {
        new PaymentManagementFrame();
    }
}
