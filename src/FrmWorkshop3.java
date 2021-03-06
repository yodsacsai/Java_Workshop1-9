
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yodsa
 */
public class FrmWorkshop3 extends javax.swing.JFrame {

    /**
     * Creates new form FrmWorkshop3
     */
    public FrmWorkshop3() {
        initComponents();
        setLocationRelativeTo(getRootPane());
        setTitle("Guess Number");
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        tfNum1 = new javax.swing.JTextField();
        btnGuess = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnEnd = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblShow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/search.png"))
        );
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("โปรแกรม Guess Number");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ป้อนตัวเลข");

        tfNum1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNum1KeyTyped(evt);
            }
        });

        btnGuess.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guess.png"))); // NOI18N
        btnGuess.setText("ทาย");
        btnGuess.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuess.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessActionPerformed(evt);
            }
        });

        btnStart.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/start.png"))); // NOI18N
        btnStart.setText("เริ่มต้น");
        btnStart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStart.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnEnd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btnEnd.setText("จบการทำงาน");
        btnEnd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndActionPerformed(evt);
            }
        });

        lblShow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblShow.setForeground(new java.awt.Color(204, 0, 51));
        lblShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShow.setText("???");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnGuess)
                        .addGap(18, 18, 18)
                        .addComponent(btnStart)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnd)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblShow, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblShow)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessActionPerformed
        // TODO add your handling code here:
        if(tfNum1.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "ป้อนตัวเลข","คำเตือน",JOptionPane.WARNING_MESSAGE);
        }else{
            int guess = Integer.parseInt(tfNum1.getText().trim());
            if(guess > guessNum){
                lblShow.setText("ตัวเลขมากเกินไป");
            }else if(guess < guessNum){
                lblShow.setText("ตัวเลขน้อยเกินไป");
            }else{
                lblShow.setText("YOU ARE WINNER!!!");
            }
        }
    }//GEN-LAST:event_btnGuessActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        
        lblShow.setText("???");
        tfNum1.setText("");
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, 
                "ต้องการจบโปรแกรมใช่หรือไม่", 
                "ยืนยัน", 
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_btnEndActionPerformed
    int guessNum;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Random rd = new Random();
        guessNum = rd.nextInt(100)+1;
    }//GEN-LAST:event_formWindowOpened

    private void tfNum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNum1KeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        
        if(!Character.isDigit(ch)){
            evt.consume();
        }
    }//GEN-LAST:event_tfNum1KeyTyped

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
            java.util.logging.Logger.getLogger(FrmWorkshop3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmWorkshop3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmWorkshop3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmWorkshop3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmWorkshop3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnd;
    private javax.swing.JButton btnGuess;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblShow;
    private javax.swing.JTextField tfNum1;
    // End of variables declaration//GEN-END:variables
}
