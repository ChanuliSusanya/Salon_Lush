package gui;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class EmployeeScheduleFrame extends JFrame {
    
    private JTable scheduleTable;
    private JButton saveButton, cancelButton;
    private DefaultTableModel tableModel;
    
    public EmployeeScheduleFrame() {
        // Set frame properties
        setTitle("Employee Schedule");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create table model and set column names
        tableModel = new DefaultTableModel(new Object[]{"Employee", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}, 0);
        scheduleTable = new JTable(tableModel);
        
        // Scroll pane for table
        JScrollPane scrollPane = new JScrollPane(scheduleTable);
        
        // Add buttons
        saveButton = new JButton("Save Schedule");
        cancelButton = new JButton("Cancel");
        
        // Set layout
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        buttonPanel.add(cancelButton);
        add(buttonPanel, BorderLayout.SOUTH);
        
        // Load data (this could be fetched from a database in the future)
        loadEmployeeData();
        
        // Show frame
        setVisible(true);
    }
    
    private void loadEmployeeData() {
        // This is a placeholder for employee data; in a real system, data would come from a database.
        tableModel.addRow(new Object[]{"John Doe", "", "", "", "", "", "", ""});
        tableModel.addRow(new Object[]{"Jane Smith", "", "", "", "", "", "", ""});
        tableModel.addRow(new Object[]{"Alice Johnson", "", "", "", "", "", "", ""});
        tableModel.addRow(new Object[]{"Bob Brown", "", "", "", "", "", "", ""});
    }

    public static void main(String[] args) {
        new EmployeeScheduleFrame();
    }
}
