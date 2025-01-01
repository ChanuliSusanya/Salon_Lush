package gui;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.MySQL2;

public class AppoinmentBooking extends javax.swing.JFrame {

    private static HashMap<String, String> customerMap = new HashMap<>();
    private static HashMap<String, String> serviceMap = new HashMap<>();
    private static HashMap<String, String> staffMap = new HashMap<>();
    private static HashMap<String, String> branchMap = new HashMap<>();
    private static HashMap<String, String> dateMap = new HashMap<>();
    private static HashMap<String, String> timeMap = new HashMap<>();

    public AppoinmentBooking() {
        initComponents();
        loadCustomer();
        loadServices();
        loadStaff();
        loadBranches();
        loadDates();
        loadTimeSlots();
    }

    private void loadCustomer() {
        try {

            ResultSet resultSet = MySQL2.executeSearch("SELECT * FROM `customer`");

            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                String fullName = resultSet.getString("first_name") + " " + resultSet.getString("last_name");
                vector.add(fullName);
                customerMap.put(fullName, resultSet.getString("id"));

                DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
                jComboBox1.setModel(model);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadServices() {
        try {

            ResultSet resultSet = MySQL2.executeSearch("SELECT * FROM `service`");

            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("name"));
                serviceMap.put(resultSet.getString("name"), resultSet.getString("id"));

                DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
                jComboBox2.setModel(model);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadStaff() {
        try {

            ResultSet resultSet = MySQL2.executeSearch("SELECT * FROM `staff`");

            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                String fullName = resultSet.getString("first_name") + " " + resultSet.getString("last_name");

                vector.add(fullName);
                staffMap.put(fullName, resultSet.getString("email"));

                DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
                jComboBox3.setModel(model);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadBranches() {
        try {

            ResultSet resultSet = MySQL2.executeSearch("SELECT * FROM `branch`");

            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {

                vector.add(resultSet.getString("name"));
                branchMap.put(resultSet.getString("name"), resultSet.getString("id"));
            }
            
            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
                jComboBox6.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadDates() {
        try {

            ResultSet resultSet = MySQL2.executeSearch("SELECT * FROM `dates`");

            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {

                String dateString = resultSet.getDate("date").toString();
                vector.add(dateString);

                dateMap.put(dateString, resultSet.getString("id"));

                DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
                jComboBox4.setModel(model);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadTimeSlots() {
        try {

            ResultSet resultSet = MySQL2.executeSearch("SELECT * FROM `time_slots`");

            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {

                String timeString = resultSet.getTime("time_slot").toString();
                vector.add(timeString);

                timeMap.put(timeString, resultSet.getString("id"));

                DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
                jComboBox5.setModel(model);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Appointment Booking");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Customer");

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Service");

        jComboBox2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Staff");

        jComboBox3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Date");

        jComboBox4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Time");

        jComboBox5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Branch");

        jComboBox6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setText("Schedule an Appoinment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton4.setText("View Appoinments");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton5.setText("Clear All");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox3, 0, 191, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        reset();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        try {

            String customer = String.valueOf(jComboBox1.getSelectedItem());
            String service = String.valueOf(jComboBox2.getSelectedItem());
            String staff = String.valueOf(jComboBox3.getSelectedItem());
            String branch = String.valueOf(jComboBox6.getSelectedItem());
            String date = String.valueOf(jComboBox4.getSelectedItem());
            String time = String.valueOf(jComboBox5.getSelectedItem());
            
           

            if (customer.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please select a Customer", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (service.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please select a Service", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (staff.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please select the Staff", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (branch.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please select a Branch", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (date.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please select a Date", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (time.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please select a Time", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {

                ResultSet resultSet = MySQL2.executeSearch("SELECT * FROM `appoinment` WHERE `time_slots_time_slot` = '" + time + "' AND `dates_id` = '" + date + "' ");

                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(this, "This Time slot is already Booked.", "Warning", JOptionPane.WARNING_MESSAGE);
                    
                }else{
                    MySQL2.executeIUD("INSERT INTO `appoinment` (`staff_email`,`branch_id`,`customer_id`,`service_id`,`dates_id`,`time_slots_time_slot`) "
                            + "VALUES('" + staffMap.get(staff) + "','" + branchMap.get(branch) + "','" + customerMap.get(customer) + "','" + serviceMap.get(service) + "','" + dateMap.get(date) + "','" + timeMap.get(time) + "')");

                    
                    reset(); 
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatGitHubIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppoinmentBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void reset() {

        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jComboBox5.setSelectedIndex(0);
        jComboBox6.setSelectedIndex(0);

    }
}
