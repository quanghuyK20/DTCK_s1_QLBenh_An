/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialog;

/**
 *
 * @author Quang Huy
 */
public class DieuKhoanJDialog extends javax.swing.JDialog {

    /**
     * Creates new form DieuKhoanJDialog
     */
    public DieuKhoanJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setLocationRelativeTo(this);
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
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("ĐIỀU 1. QUY ĐỊNH VỀ ĐẶT TÊN TÀI KHOẢN\n1 . Không được đặt tên tài khoản theo tên của danh nhân, tên của các vị lãnh đạo, \ntên của trùm khủng bố, phát xít, tội phạm, và tên của những cá nhân, \ntổ chức chống lại Nhà nước Cộng hòa xã hội chủ nghĩa Việt Nam, \nmà gây phương hại đến an ninh quốc gia, trật tự an toàn xã hội.\n\n2. Không được đặt tên tài khoản trùng hoặc tương tự gây nhầm lẫn với tên viết tắt, \ntên đầy đủ của cơ quan nhà nước, tổ chức chính trị, tổ chức chính trị - xã hội,\n tổ chức chính trị xã hội - nghề nghiệp, tổ chức xã hội, tổ chức xã hội - nghề nghiệp của Việt Nam \nvà tổ chức quốc tế nếu không được cơ quan, tổ chức đó cho phép.\n\n3. Không được đặt tên tài khoản trùng hoặc gây nhầm lẫn để giả mạo các cá nhân, tổ chức khác \nnhằm mục đích đưa thông tin sai sự thật, xuyên tạc, vu khống, xúc phạm uy tín của tổ chức, danh\n dự và nhân phẩm của cá nhân khác.\n\nĐIỀU 2. QUY ĐỊNH VỀ BẢO MẬT\n1. Trưởng khoa chịu trách nhiệm việc trao đổi các thông tin và bảo mật tất cả các kết\nquả xét nghiệm, chỉ giao kết quả xét nghiệm cho chính nguời yêu cầu xét nghiệm.\nKhông cung cấp số liệu, kết quả xét nghiệm cho các đối tƣợng khác khi chưa có chỉ thị\ncủa Giám đốc Bệnh viện.\n\n2. Nhân viên Khoa Xét nghiệm đƣợc phép tiếp cận và sử dụng file dữ liệu của bệnh\nnh n (file điện tử hay sổ ghi chép) với mục đích thực hiện xét nghiệm. Với các mục\nđích khác nhƣ nghiên cứu, báo cáo cần có sự đồng ý của Lãnh đạo.\n\n3. Nhân viên Khoa Xét nghiệm không tự ý cho bất kỳ cá nhân hoặc đơn vị khác xem\nkết quả xét nghiệm và các tài liệu liên quan đến hoạt động của Khoa Xét nghiệm.\n\n4.Khi trả kết quả mật đƣợc coi là thông tin mật của khách hàng/bệnh nhân cần phải\ntrả cho cán bộ y tế. Trả kết quả xét nghiệm HIV dƣơng tính tuân thủ theo Thông tƣ số\n01/2010/TT-BYT quy định.\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DieuKhoanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DieuKhoanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DieuKhoanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DieuKhoanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DieuKhoanJDialog dialog = new DieuKhoanJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
