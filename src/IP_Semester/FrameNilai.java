/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IP_Semester;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Mas Syahrul
 */
public class FrameNilai extends javax.swing.JFrame {
    DefaultTableModel model;
    /**
     * Creates new form FrameNilai
     */
    public FrameNilai() {
        initComponents();
        setTable();
    }
    
    private void setTable(){
        Object[] field = {"Nama", "Mata Kuliah", "Kehadiran", "UTS", "Tugas", "UAS", "Nilai Quiz", "Nilai Akhir", "Nilai Huruf"};
        model = new DefaultTableModel(field, 0);
        tabel.setModel(model);
        JTableHeader th = tabel.getTableHeader();
        th.setReorderingAllowed(false);
        tabel.setRowHeight(30);
    }
    private String calculate(String... utm){    
        for (int i = 0; i < utm.length; i++){
                if(utm[i].isEmpty()){
                    utm[i] = "0";
                }
        }
        double t1=0,t2=0,t3=0,t4=0,t5=0;
        for (int i = 0; i < utm.length; i++) {
            double cv = Double.valueOf(utm[i]);
            switch (i) {
                case 0:
                    t1 = cv * 0.1;
                    break;
                case 1:
                    t2 = cv * 0.2;
                    break;
                case 2:
                    t3 = cv * 0.1;
                    break;
                case 3:
                    t4 = cv * 0.2;
                    break;
                case 4:
                    t5 = cv *0.4;
                    break;
                default:
                    break;
            }
        }
        double jumlah = t1+t2+t3+t4+t5;
        double as = Math.round(jumlah); //dibulatkan
        String cvJumlah = indexOF(as);
        return cvJumlah;
    }
    
    public String indexOF(double b){
        String hsl;
        if(b %1 == 0){
            hsl = String.valueOf(b).substring(0,String.valueOf(b).lastIndexOf("."));
        }else{
            hsl = String.valueOf(b);
        }
        
        
        return hsl;
    }
    
    private String calAbjad(String jumlah){
        String nilai = "";
        double b = Double.valueOf(jumlah);
        if(b <= 100 && b >= 80){
            nilai = "A";
        }else if(b <= 79 && b >= 60){
            nilai = "B";
        }else if(b <= 69 && b >= 40){
            nilai = "C";
        }else if(b <= 39){
            nilai = "D";
        }
        return nilai;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtMK = new javax.swing.JTextField();
        txtKehadiran = new javax.swing.JTextField();
        txtUts = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTugas = new javax.swing.JTextField();
        txtUas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHitungSimpan = new javax.swing.JButton();
        txtClearF = new javax.swing.JButton();
        txtClearR = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtQuiz = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penghitung Nilai Mahasiswa Sederhana ");

        jPanel1.setBackground(new java.awt.Color(110, 158, 181));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(930, 220));

        txtMK.setMinimumSize(new java.awt.Dimension(6, 15));
        txtMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMKActionPerformed(evt);
            }
        });

        txtUts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUtsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kehadiran : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mata Kuliah : ");

        txtTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTugasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nilai UTS :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Nilai UAS :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nilai Tugas :");

        txtHitungSimpan.setBackground(new java.awt.Color(0, 0, 0));
        txtHitungSimpan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtHitungSimpan.setForeground(new java.awt.Color(255, 255, 255));
        txtHitungSimpan.setText("SIMPAN DAN HITUNG");
        txtHitungSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHitungSimpanActionPerformed(evt);
            }
        });

        txtClearF.setBackground(new java.awt.Color(0, 0, 0));
        txtClearF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtClearF.setForeground(new java.awt.Color(255, 255, 255));
        txtClearF.setText("BATAL");
        txtClearF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClearFActionPerformed(evt);
            }
        });

        txtClearR.setBackground(new java.awt.Color(0, 0, 0));
        txtClearR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtClearR.setForeground(new java.awt.Color(255, 255, 255));
        txtClearR.setText("HAPUS BARIS");
        txtClearR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClearRActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nilai Quiz: ");

        txtQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuizActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("APLIKASI PENGHITUNG NILAI IP SEMESTER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKehadiran, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUts)
                                    .addComponent(txtTugas, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                            .addComponent(txtnama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuiz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtHitungSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addComponent(txtClearR, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addComponent(txtClearF, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtUas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(txtTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtKehadiran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtClearF, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtClearR, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtHitungSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(453, 203));

        tabel.setForeground(new java.awt.Color(0, 102, 102));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabel.setOpaque(false);
        tabel.setPreferredSize(new java.awt.Dimension(375, 90));
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHitungSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHitungSimpanActionPerformed
        String Nama = txtnama.getText();
        String MK = txtMK.getText();
        String hadir = txtKehadiran.getText();
        String uts = txtUts.getText();
        String tugas = txtTugas.getText();
        String uas = txtUas.getText();
        String quiz = txtQuiz.getText();
        
        if(Nama.isEmpty()){
            JOptionPane.showMessageDialog(this, "Masukan Nama Terlebih Dahulu");
            txtnama.requestFocus();
        }else{
            String[] data = {hadir, uts, tugas, uas, quiz};
            
            String jml = calculate(data);
            Object[] data2 = {Nama, MK, hadir, uts, tugas, uas,quiz, jml, calAbjad(jml)};
            model.addRow(data2);
        }
    }//GEN-LAST:event_txtHitungSimpanActionPerformed

    private void txtClearFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClearFActionPerformed
        txtnama.setText("");
        txtMK.setText("");
        txtKehadiran.setText("");
        txtUts.setText("");
        txtTugas.setText("");
        txtUas.setText("");
        txtQuiz.setText("");
    }//GEN-LAST:event_txtClearFActionPerformed

    private void txtClearRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClearRActionPerformed
        int[] pilih = tabel.getSelectedRows();
        if(pilih.length > 0){
            for(int i = pilih.length-1; i >= 0; i--){
                model.removeRow(pilih[i]);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Pilih row yang ingin dihapus");
        }
    }//GEN-LAST:event_txtClearRActionPerformed

    private void txtTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTugasActionPerformed

    private void txtMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKActionPerformed

    private void txtUtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUtsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUtsActionPerformed

    private void txtQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuizActionPerformed

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
            java.util.logging.Logger.getLogger(FrameNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            FrameNilai awl = new FrameNilai();
//            awl.setExtendedState(Frame.MAXIMIZED_BOTH);
            awl.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    private javax.swing.JButton txtClearF;
    private javax.swing.JButton txtClearR;
    private javax.swing.JButton txtHitungSimpan;
    private javax.swing.JTextField txtKehadiran;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtQuiz;
    private javax.swing.JTextField txtTugas;
    private javax.swing.JTextField txtUas;
    private javax.swing.JTextField txtUts;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
