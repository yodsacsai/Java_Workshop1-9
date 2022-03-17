
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IT309pc
 */
public class FrmWorkshop9 extends javax.swing.JFrame {
    //ประกาศชื่อโมเดล
    DefaultTableModel modelBook;
    
    /**
     * Creates new form FrmWorkshop9
     */
    public FrmWorkshop9() {
        initComponents();
        setLocationRelativeTo(getRootPane());
        setTitle("Book Management");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/start.png")));
        
        //เอาชื่อที่ประกาศมาผูกกับ table tbBook
        modelBook = (DefaultTableModel)tbBook.getModel();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbBook = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfBook = new javax.swing.JTextField();
        tfQuan = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbPriceSum = new javax.swing.JLabel();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDel = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btShowSelect = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbBook = new javax.swing.JLabel();
        lbQuan = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbListTotal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btShowListTotal = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lbQuanTotal = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btShowQuanTotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ชื่อหนังสือ", "จำนวน(เล่ม)", "ราคา(บาท)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbBook);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("โปรแกรม Book management");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ชื่อหนังสือ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("จำนวน(เล่ม)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("ราคา(บาท)");

        tfBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBookKeyTyped(evt);
            }
        });

        tfQuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfQuanKeyTyped(evt);
            }
        });

        tfPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPriceKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("ราคารวม");

        lbPriceSum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPriceSum.setForeground(new java.awt.Color(255, 0, 51));
        lbPriceSum.setText("00.00");

        btAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        btAdd.setText("เพิ่ม");
        btAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btEdit.setText("แก้ไข");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btDel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N
        btDel.setText("ลบ");
        btDel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btDel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });

        btShowSelect.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btShowSelect.setText("แสดงรายการที่เลือก");
        btShowSelect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btShowSelect.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btShowSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShowSelectActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("ชื่อหนังสือ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("จำนวน(เล่ม)");

        lbBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbBook.setForeground(new java.awt.Color(255, 0, 51));
        lbBook.setText("XXXX");

        lbQuan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbQuan.setForeground(new java.awt.Color(255, 0, 51));
        lbQuan.setText("XXXX");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("มีจำนวนทั้งหมด");

        lbListTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbListTotal.setForeground(new java.awt.Color(255, 0, 51));
        lbListTotal.setText("XXXX");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("รายการ");

        btShowListTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btShowListTotal.setText("แสดงรายการที่เลือกทั้งหมด");
        btShowListTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShowListTotalActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("มีจำนวนทั้งหมด");

        lbQuanTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbQuanTotal.setForeground(new java.awt.Color(255, 0, 51));
        lbQuanTotal.setText("XXXX");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("เล่ม");

        btShowQuanTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btShowQuanTotal.setText("แสดงจำนวนเล่มทั้งหมด");
        btShowQuanTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShowQuanTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(223, 223, 223))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(jLabel5)
                                        .addGap(122, 122, 122)
                                        .addComponent(lbPriceSum))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(tfBook, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(tfQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(btDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btShowQuanTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btShowSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btShowListTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel11)
                                        .addGap(43, 43, 43)
                                        .addComponent(lbListTotal)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbQuan)
                                            .addComponent(lbBook)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel12)
                                        .addGap(40, 40, 40)
                                        .addComponent(lbQuanTotal)
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel16)))))
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbPriceSum))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lbBook))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lbQuan)))
                    .addComponent(btShowSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btShowListTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(lbListTotal))
                .addGap(13, 13, 13)
                .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btShowQuanTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(lbQuanTotal)
                    .addComponent(jLabel12))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        if(tfBook.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "ป้อนชื่อหนังสือ", "คำเตือน", JOptionPane.WARNING_MESSAGE);
        }else if(tfQuan.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "ป้อนจำนวนหนังสือ", "คำเตือน", JOptionPane.WARNING_MESSAGE);
        }else if(tfPrice.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "ป้อนราคา", "คำเตือน", JOptionPane.WARNING_MESSAGE);
        }else{
            //ใส่ข้อมูลไปในตาราง
            modelBook.insertRow(
                    tbBook.getRowCount(),
                    new Object[]{
                        tfBook.getText().trim(),
                        tfQuan.getText().trim(),
                        tfPrice.getText().trim()
                    }
            );
            //คำนวณเงิน
            int quan = Integer.parseInt(tfQuan.getText().trim());
            double price = Double.parseDouble(tfPrice.getText().trim());
            double priceSum = Double.parseDouble(lbPriceSum.getText().trim());
            double priceSumNew = (quan * price) + priceSum;
            lbPriceSum.setText(String.valueOf(priceSumNew));
            
            
            
            //เคลียร์ช่อง
            tfBook.setText("");
            tfQuan.setText("");
            tfPrice.setText("");
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void btDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelActionPerformed
        // TODO add your handling code here:
        //if(tbBook.getSelectedRowCount()==0)
        if(tbBook.getSelectedRow()<0){
            JOptionPane.showMessageDialog(this, "เลือกรายการหนังสือที่จะลบ", "คำเตือน", JOptionPane.WARNING_MESSAGE);
        }else{
            //เอาข้อมูลที่จะลบไปหักล้างก่อน
            int quan = Integer.parseInt(String.valueOf(modelBook.getValueAt(tbBook.getSelectedRow(), 1)));
            double price = Double.parseDouble(String.valueOf(modelBook.getValueAt(tbBook.getSelectedRow(), 2)));
            double priceSum = Double.parseDouble(lbPriceSum.getText().trim());
            double priceSumNew = priceSum - (quan * price);
            lbPriceSum.setText(String.valueOf(priceSumNew));
            //ลบทิ้ง
            modelBook.removeRow(tbBook.getSelectedRow());
            
        }
    }//GEN-LAST:event_btDelActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // TODO add your handling code here:
        if(tbBook.getSelectedRow()<0){
            JOptionPane.showMessageDialog(this, "เลือกรายการหนังสือที่จะแก้ไข", "คำเตือน", JOptionPane.WARNING_MESSAGE);
        }else{
            //เอาข้อมูลที่จะแก้ไขไปใส่ข้างบน
            tfBook.setText(String.valueOf(modelBook.getValueAt(tbBook.getSelectedRow(), 0)));
            tfQuan.setText(String.valueOf(modelBook.getValueAt(tbBook.getSelectedRow(), 1)));
            tfPrice.setText(String.valueOf(modelBook.getValueAt(tbBook.getSelectedRow(), 2)));
            
            //เอาข้อมูลที่จะแก้ไขไปหักล้างก่อน
            int quan = Integer.parseInt(String.valueOf(modelBook.getValueAt(tbBook.getSelectedRow(), 1)));
            double price = Double.parseDouble(String.valueOf(modelBook.getValueAt(tbBook.getSelectedRow(), 2)));
            double priceSum = Double.parseDouble(lbPriceSum.getText().trim());
            double priceSumNew = priceSum - (quan * price);
            lbPriceSum.setText(String.valueOf(priceSumNew));
            //ลบทิ้ง
            modelBook.removeRow(tbBook.getSelectedRow());
        }
    }//GEN-LAST:event_btEditActionPerformed

    private void btShowSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShowSelectActionPerformed
        // TODO add your handling code here:
        if(tbBook.getSelectedRow()<0){
            JOptionPane.showMessageDialog(this, "เลือกรายการที่จะแสดง", "คำเตือน", JOptionPane.WARNING_MESSAGE);
        }else{
            lbBook.setText(String.valueOf(modelBook.getValueAt(tbBook.getSelectedRow(), 0)));
            lbQuan.setText(String.valueOf(modelBook.getValueAt(tbBook.getSelectedRow(), 1)));
        }
        
    }//GEN-LAST:event_btShowSelectActionPerformed

    private void btShowListTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShowListTotalActionPerformed
        // TODO add your handling code here:
        lbListTotal.setText(String.valueOf(tbBook.getRowCount()));
    }//GEN-LAST:event_btShowListTotalActionPerformed

    private void btShowQuanTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShowQuanTotalActionPerformed
        // TODO add your handling code here:
        int quantotal = 0;
        int totalrow = tbBook.getRowCount();
        //นับจำนวนหนังสือจาก colum ที่ 1 ในทุกๆแถว
        for(int i = 0 ; i < totalrow ; i++){
            int numbook = Integer.parseInt(String.valueOf(modelBook.getValueAt(i, 1)));
            quantotal = quantotal + numbook;
        }
        lbQuanTotal.setText(String.valueOf(quantotal));
        
    }//GEN-LAST:event_btShowQuanTotalActionPerformed

    private void tfBookKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBookKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfBookKeyTyped

    private void tfQuanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuanKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(!Character.isDigit(ch)){
            evt.consume();
        }
    }//GEN-LAST:event_tfQuanKeyTyped

    private void tfPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPriceKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(tfPrice.getText().contains(".")){
            if(!Character.isDigit(ch)){
                evt.consume();
            }
        }
        if(!Character.isDigit(ch) && ch != '.'){
            evt.consume();
        }
    }//GEN-LAST:event_tfPriceKeyTyped

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
            java.util.logging.Logger.getLogger(FrmWorkshop9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmWorkshop9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmWorkshop9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmWorkshop9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmWorkshop9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btShowListTotal;
    private javax.swing.JButton btShowQuanTotal;
    private javax.swing.JButton btShowSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbBook;
    private javax.swing.JLabel lbListTotal;
    private javax.swing.JLabel lbPriceSum;
    private javax.swing.JLabel lbQuan;
    private javax.swing.JLabel lbQuanTotal;
    private javax.swing.JTable tbBook;
    private javax.swing.JTextField tfBook;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfQuan;
    // End of variables declaration//GEN-END:variables
}
