/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worktime;

import java.util.*;
import java.io.*;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import java.util.logging.ConsoleHandler;

/**
 *
 * @author adasiko
 */
public class NewJFrame extends javax.swing.JFrame {

    static final String MY_DATE_FORMAT="yyyy-MM-dd HH:mm:ss";
    static final String MY_DOUBLE_FORMAT="%.2f";
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        Logger logger = Logger.getLogger(NewJFrame.class.getName());
        ConsoleHandler consoleHandler = new ConsoleHandler();
        logger.addHandler(consoleHandler);
 
        initComponents();
        initGuiData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Месяц");
        jLabel1.setToolTipText("");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь" }));

        jLabel2.setText("Год");

        jLabel3.setText("Дневная прибавка (минуты)");

        jTextField1.setText("10");

        jButton1.setLabel("Посчитать");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "День", "Часов"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("Итого часов");

        jTextField2.setEditable(false);

        jLabel5.setText("+");

        jTextField3.setEditable(false);

        jLabel6.setText("=");

        jTextField4.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        for(int ii=0; ii<jTable1.getRowCount(); ii++) {
            for(int jj=0; jj<jTable1.getColumnModel().getColumnCount(); jj++) {
                jTable1.setValueAt("", ii, jj);
            }
        }
        
        int adding_time=0;
        jTextField1.setBackground(Color.WHITE);
        try {
            adding_time=Integer.parseInt(jTextField1.getText());
        } catch (NumberFormatException n) {
            jTextField1.setBackground(Color.RED);
        }
            
        int month=jComboBox1.getSelectedIndex();
        int year=Integer.parseInt(String.valueOf(jComboBox2.getSelectedItem()));
        Calendar dt1=new GregorianCalendar(year, month, 1);
        Calendar dt2=new GregorianCalendar(year, month, dt1.getActualMaximum(Calendar.DAY_OF_MONTH));
            
        SimpleDateFormat date_format = new SimpleDateFormat(MY_DATE_FORMAT);
        
        try {                                                  
            File tempFile = File.createTempFile("bootlog", ".csv");
            tempFile.deleteOnExit();
            
            String command=
            "Get-WinEvent -FilterHashTable @{LogName='system';"+
            "ProviderName='Microsoft-Windows-Kernel-General';id=12,13;"+
            "StartTime=[DateTime]::ParseExact('"+date_format.format(dt1.getTime())+"','"+MY_DATE_FORMAT+"',$null);"+
            "EndTime=[DateTime]::ParseExact('"+date_format.format(dt2.getTime())+"','"+MY_DATE_FORMAT+"',$null)} | "+
            "Select Id, @{label='TimeCreated';expression={$_.TimeCreated.ToString('"+MY_DATE_FORMAT+"')}} | "+
            "Export-Csv -NoTypeInformation "+tempFile.getAbsolutePath();
            
            ExecCommand(command);
            
            // read CSV file
            // "Id","TimeCreated"
            // "12","4/18/2015 1:59:31 PM"
            // "13","4/15/2015 9:44:03 PM"
            // "12","4/15/2015 9:16:45 PM"
            
            String s, s2;
            int i;
            Calendar cal = Calendar.getInstance();
            WorkMonth myMonth=new WorkMonth(dt1);
            FileReader fr=new FileReader(tempFile);
            BufferedReader br=new BufferedReader(fr);
            br.readLine(); // first string is header
            while((s=br.readLine())!=null) {
                i=s.indexOf(',');
                s2=s.substring(i+2, s.length()-1); // date
                try {
                    cal.setTime(date_format.parse(s2));
                    myMonth.putTime(cal);
                } catch (ParseException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            fr.close();
            
            int day_count=0;
            double w, total=0.0;
            for(i=0; i<myMonth.daylist.size(); i++) {
                if(myMonth.daylist.get(i).hasTimes()) {
                    w=myMonth.daylist.get(i).getWorkingHours();
                    day_count++;
                } else {
                    w=0.0;
                }
                jTable1.setValueAt(i+1, i, 0);
                jTable1.setValueAt(String.format(MY_DOUBLE_FORMAT, w), i, 1);
                total+=w;
            }
            jTextField2.setText(String.format(MY_DOUBLE_FORMAT, total));
            double extra=day_count*adding_time/60.0;
            jTextField3.setText(String.format(MY_DOUBLE_FORMAT, extra));
            total+=extra;
            jTextField4.setText(String.format(MY_DOUBLE_FORMAT, total));
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ExecCommand(String cmd) {
        ProcessBuilder pb=new ProcessBuilder("powershell", "-NoProfile", "-Command",
                "\""+cmd+"\"");
        pb.redirectErrorStream(true);
        try {
            Process process=pb.start();
            process.getOutputStream().close();
            process.waitFor();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void initGuiData() {
        Calendar MyCalendar; // for current date
        int i, j, year;
        final int YEARS=9; // count of years (odd)
        MyCalendar=Calendar.getInstance();
        jComboBox1.setSelectedIndex(MyCalendar.get(Calendar.MONTH));
        year=MyCalendar.get(Calendar.YEAR);
        i=year-YEARS/2;
        for(j=0; j<YEARS; j++) {
            jComboBox2.addItem(i);
            i++;
        }
        jComboBox2.setSelectedItem(year); 
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}