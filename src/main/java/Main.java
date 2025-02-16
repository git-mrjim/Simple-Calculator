
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JButton;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main extends javax.swing.JFrame {
    private double value;
    private String op;
    
    /**
     * Creates new form Main
     */
    public Main() {
        
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize FlatLaf");
        }
        
         initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Display = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 250));
        setMaximumSize(new java.awt.Dimension(500, 2147483647));
        setName("MainFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(100, 100));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        Display.setEditable(false);
        Display.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        Display.setForeground(new java.awt.Color(0, 0, 0));
        Display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Display.setText("0");
        Display.setName("Display"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(Display, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(79, 70, 229));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText(" +/- ");
        jButton1.setName("+/-"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setBackground(new java.awt.Color(79, 70, 229));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText(" AC ");
        jButton2.setName("AC"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton2, gridBagConstraints);

        jButton3.setBackground(new java.awt.Color(79, 70, 229));
        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DEL");
        jButton3.setName("DEL"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton3, gridBagConstraints);

        jButton4.setBackground(new java.awt.Color(79, 70, 229));
        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("  ÷  ");
        jButton4.setName("/"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton4, gridBagConstraints);

        jButton5.setBackground(new java.awt.Color(238, 242, 255));
        jButton5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("7");
        jButton5.setName("7"); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumberActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton5, gridBagConstraints);

        jButton6.setBackground(new java.awt.Color(238, 242, 255));
        jButton6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("8");
        jButton6.setName("8"); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumberActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton6, gridBagConstraints);

        jButton7.setBackground(new java.awt.Color(238, 242, 255));
        jButton7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("9");
        jButton7.setName("9"); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumberActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton7, gridBagConstraints);

        jButton8.setBackground(new java.awt.Color(79, 70, 229));
        jButton8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("x");
        jButton8.setName("*"); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton8, gridBagConstraints);

        jButton9.setBackground(new java.awt.Color(238, 242, 255));
        jButton9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("4");
        jButton9.setName("4"); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumberActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton9, gridBagConstraints);

        jButton10.setBackground(new java.awt.Color(238, 242, 255));
        jButton10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setText("5");
        jButton10.setName("5"); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumberActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton10, gridBagConstraints);

        jButton11.setBackground(new java.awt.Color(238, 242, 255));
        jButton11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.setText("6");
        jButton11.setName("6"); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumberActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton11, gridBagConstraints);

        jButton12.setBackground(new java.awt.Color(79, 70, 229));
        jButton12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("-");
        jButton12.setName("-"); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton12, gridBagConstraints);

        jButton13.setBackground(new java.awt.Color(238, 242, 255));
        jButton13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 0, 0));
        jButton13.setText("1");
        jButton13.setName("1"); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumberActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton13, gridBagConstraints);

        jButton14.setBackground(new java.awt.Color(238, 242, 255));
        jButton14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 0, 0));
        jButton14.setText("2");
        jButton14.setName("2"); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumberActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton14, gridBagConstraints);

        jButton15.setBackground(new java.awt.Color(238, 242, 255));
        jButton15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 0, 0));
        jButton15.setText("3");
        jButton15.setName("3"); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumberActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton15, gridBagConstraints);

        jButton16.setBackground(new java.awt.Color(79, 70, 229));
        jButton16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("+");
        jButton16.setName("+"); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton16, gridBagConstraints);

        jButton17.setBackground(new java.awt.Color(238, 242, 255));
        jButton17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 0, 0));
        jButton17.setText("0");
        jButton17.setName("0"); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumberActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton17, gridBagConstraints);

        jButton18.setBackground(new java.awt.Color(238, 242, 255));
        jButton18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 0, 0));
        jButton18.setText(".");
        jButton18.setName("."); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton18, gridBagConstraints);

        jButton19.setBackground(new java.awt.Color(79, 70, 229));
        jButton19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("=");
        jButton19.setName("="); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 2, 2);
        getContentPane().add(jButton19, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperationActionPerformed
        JButton btn = (JButton) evt.getSource();
        double newValue = Double.parseDouble(Display.getText());
        
        switch (btn.getName()) {
            case "*":
            case "/":
            case "+":
            case "-":
                value = newValue;
                op = btn.getName();
                Display.setText("0");
                break;
            case "=":
                switch (op) {
                    case "*": value *= newValue; break;
                    case "/": value /= newValue; break;
                    case "+": value += newValue; break;
                    case "-": value -= newValue; break;
                }
                Display.setText(new java.text.DecimalFormat("0.###").format(value));
                break;
            case "AC":
                value = 0;
                op = "";
                Display.setText("0");
                break;
            case "DEL":
                String currentText = Display.getText();
                if (currentText.length() == 1) {
                    Display.setText("0");
                } else {
                    Display.setText(currentText.substring(0, currentText.length() - 1));
                }
                break;
            case ".":
                if (!Display.getText().contains(".")) {
                    Display.setText(String.format("%s.", Display.getText()));
                }
                break;
            case "+/-":
                if (!(Integer.parseInt(Display.getText()) > -1 && Integer.parseInt(Display.getText()) < 1)) {
                     Display.setText(String.valueOf(-newValue));
                }
                break;
        }
    }//GEN-LAST:event_btnOperationActionPerformed

    private void btnNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumberActionPerformed
        JButton btn = (JButton) evt.getSource();
        
        if (Display.getText().equalsIgnoreCase("0")) {
            Display.setText(btn.getText());
        } else {
            Display.setText(String.format("%s%s", Display.getText(), btn.getText()));
        }
    }//GEN-LAST:event_btnNumberActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Display;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton10;
    public javax.swing.JButton jButton11;
    public javax.swing.JButton jButton12;
    public javax.swing.JButton jButton13;
    public javax.swing.JButton jButton14;
    public javax.swing.JButton jButton15;
    public javax.swing.JButton jButton16;
    public javax.swing.JButton jButton17;
    public javax.swing.JButton jButton18;
    public javax.swing.JButton jButton19;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
