/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ConnectSQL.DataValidator;
import ConnectSQL.MessagaDialog;
import Model.LichKham;
import Model.QuanLyBenhAn;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qlba.DAO.BenhAnDao;
import qlba.DAO.LichKhamDao;

/**
 *
 * @author Quang Huy
 */
public class DatLichKhamPanel extends javax.swing.JPanel {

    private Menu parentForm;
    private DefaultTableModel tblModel;

    /**
     * Creates new form QuanLyKhoaPanel
     */
    public DatLichKhamPanel() {
        initComponents();

        initTable();

        loadDataToTable();

        txtMaSoKhamBenh.setText(Random() + "");
        
    }

    int Random() {
        Random rd = new Random();
        int random = 10000 + rd.nextInt(89999);
        return random;
    }

    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã Số Khám Bệnh", "Họ Tên ", "Ngày Sinh", "Giới Tính", "Số Điện Thoại", "Nghề Nghiệp", "Email", "Địa Chỉ", "Ngày Khám", "Mô Tả Triệu Chứng"});
        tblLichKham.setModel(tblModel);
    }

    private void loadDataToTable() {
        try {
            LichKhamDao dao = new LichKhamDao();
            List<LichKham> list = dao.findAll();
            tblModel.setRowCount(0);
            for (LichKham it : list) {
                tblModel.addRow(new Object[]{
                    it.getMaSoKhamBenh(), it.getHoTen(), it.getNgaySinh(), it.getGioiTinh() == 1 ? "Nam" : "Nữ", it.getSDT(), it.getNgheNghiep(), it.getEmail(), it.getDiaChi(), it.getNgayKham(), it.getMotaTrieuChung()
                });
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
            MessagaDialog.showErrorDialog(parentForm, e.getMessage(), " Lỗi");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtNgheNghiep = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtMoTa = new javax.swing.JTextField();
        txtNgayKham = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jlbGioiTinh = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jlbNgayKham = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLichKham = new javax.swing.JTable();
        jlbHoten = new javax.swing.JLabel();
        jlbNgaySinh = new javax.swing.JLabel();
        jlbSDT = new javax.swing.JLabel();
        jlbNgheNghiep = new javax.swing.JLabel();
        jlbEmail = new javax.swing.JLabel();
        jlbDiaChi = new javax.swing.JLabel();
        jlbMoTa = new javax.swing.JLabel();
        jbtNew = new javax.swing.JButton();
        jbtChinhSua = new javax.swing.JButton();
        jbtSave = new javax.swing.JButton();
        jbtXoa = new javax.swing.JButton();
        jbtIn = new javax.swing.JButton();
        txtNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtMaSoKhamBenh = new javax.swing.JTextField();
        jbtSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1871, 10));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Đặt Lịch Khám");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setText("Thông Tin Bệnh Nhân ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtHoTen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 213, 383, 30));

        txtSDT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 326, 148, 30));

        txtNgheNghiep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txtNgheNghiep, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 376, 383, 30));

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 431, 383, 30));

        txtDiaChi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 489, 383, 30));

        txtMoTa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txtMoTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 675, 297, 88));

        txtNgayKham.setDateFormatString("yyyy-MM-dd");
        txtNgayKham.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtNgayKham, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 615, 297, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setText("Thông Tin Đặt Hẹn");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 564, -1, -1));

        jlbGioiTinh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbGioiTinh.setText("Giới Tính");
        jPanel1.add(jlbGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 328, -1, -1));

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");
        jPanel1.add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 330, -1, -1));

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");
        jPanel1.add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 330, -1, -1));

        jlbNgayKham.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbNgayKham.setText("Ngày Khám");
        jPanel1.add(jlbNgayKham, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 615, -1, -1));

        tblLichKham.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblLichKham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblLichKham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLichKhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLichKham);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 211, 1297, 400));

        jlbHoten.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbHoten.setText("Họ tên");
        jPanel1.add(jlbHoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 215, -1, -1));

        jlbNgaySinh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbNgaySinh.setText("Ngày sinh");
        jPanel1.add(jlbNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 269, -1, -1));

        jlbSDT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbSDT.setText("SDT");
        jPanel1.add(jlbSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 328, -1, -1));

        jlbNgheNghiep.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbNgheNghiep.setText("Nghề Nghiệp");
        jPanel1.add(jlbNgheNghiep, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 379, -1, -1));

        jlbEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbEmail.setText("Email");
        jPanel1.add(jlbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 433, -1, -1));

        jlbDiaChi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbDiaChi.setText("Địa chỉ");
        jPanel1.add(jlbDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 491, -1, -1));

        jlbMoTa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbMoTa.setText("Mô tả triệu chứng");
        jPanel1.add(jlbMoTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 675, -1, -1));

        jbtNew.setBackground(new java.awt.Color(255, 255, 255));
        jbtNew.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new-icon-16.png"))); // NOI18N
        jbtNew.setText("Tạo mới");
        jbtNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNewActionPerformed(evt);
            }
        });
        jPanel1.add(jbtNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 650, 120, 30));

        jbtChinhSua.setBackground(new java.awt.Color(255, 255, 255));
        jbtChinhSua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtChinhSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ChinhSua.png"))); // NOI18N
        jbtChinhSua.setText("Cập Nhật");
        jbtChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtChinhSuaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtChinhSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 650, 120, 30));

        jbtSave.setBackground(new java.awt.Color(255, 255, 255));
        jbtSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Save-icon.png"))); // NOI18N
        jbtSave.setText("Lưu ");
        jbtSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSaveActionPerformed(evt);
            }
        });
        jPanel1.add(jbtSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 650, 120, 30));

        jbtXoa.setBackground(new java.awt.Color(255, 255, 255));
        jbtXoa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        jbtXoa.setText("Xóa");
        jbtXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 650, 120, 30));

        jbtIn.setBackground(new java.awt.Color(255, 255, 255));
        jbtIn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtIn.setText("In");
        jbtIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInActionPerformed(evt);
            }
        });
        jPanel1.add(jbtIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 650, 170, 30));

        txtNgaySinh.setDateFormatString("yyyy-MM-dd");
        txtNgaySinh.setFocusCycleRoot(true);
        jPanel1.add(txtNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 269, 383, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Mã Số Khám Bệnh");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 146, -1, -1));

        txtMaSoKhamBenh.setEnabled(false);
        txtMaSoKhamBenh.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaSoKhamBenhFocusLost(evt);
            }
        });
        jPanel1.add(txtMaSoKhamBenh, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 144, 342, 30));

        jbtSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search-icon-24.png"))); // NOI18N
        jbtSearch.setText("Tìm Kiếm");
        jbtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSearchActionPerformed(evt);
            }
        });
        jPanel1.add(jbtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 140, -1, 35));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Reload.png"))); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 140, -1, 35));

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Số Khám Bệnh", "Tên", "Giới Tinh", "Ngày Sinh", "Ngày Khám", " " }));
        jComboBox.setSelectedIndex(-1);
        jPanel1.add(jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 180, 35));

        txtSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 220, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSaveActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtMaSoKhamBenh, sb, "Mã Số Khám Bệnh không được để trống !");
        DataValidator.validateEmpty(txtHoTen, sb, "Tên Bệnh Nhân không được để trống !");

        if (sb.length() > 0) {
            MessagaDialog.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        if (MessagaDialog.showConfirmDialog(parentForm, "Bạn có muốn Lưu dữ liệu Lịch Khám không ? ", "Hỏi") == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            LichKham lc = new LichKham();

            lc.setMaSoKhamBenh(txtMaSoKhamBenh.getText());
            lc.setHoTen(txtHoTen.getText());

            Date ns = txtNgaySinh.getDate();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String Date1 = dateFormat.format(ns);
            lc.setNgaySinh(Date1);

            lc.setGioiTinh(rdoNam.isSelected() ? 1 : 0);
            lc.setSDT(txtSDT.getText());
            lc.setNgheNghiep(txtNgheNghiep.getText());
            lc.setEmail(txtEmail.getText());
            lc.setDiaChi(txtDiaChi.getText());

            Date ms = txtNgayKham.getDate();
            DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            String Date2 = dateformat.format(ms);
            lc.setNgayKham(Date2);

            lc.setMotaTrieuChung(txtMoTa.getText());

            LichKhamDao dao = new LichKhamDao();
            if (dao.insert(lc)) {
                MessagaDialog.showMessageDialog(parentForm, "Đã đặt Lịch Khám thành công !", "Thông báo");
                loadDataToTable();
            } else {
                MessagaDialog.showConfirmDialog(parentForm, "Chưa thể đặt Lịch Khám ", "Lỗi");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessagaDialog.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_jbtSaveActionPerformed

    private void jbtNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNewActionPerformed
        txtHoTen.setText("");
        txtSDT.setText("");
        jbtSave.setEnabled(true);
        txtMaSoKhamBenh.setText(Random() + "");
        txtDiaChi.setText("");
        txtEmail.setText("");
        txtMoTa.setText("");
        txtNgayKham.setCalendar(null);
        txtNgaySinh.setCalendar(null);
        txtNgheNghiep.setText("");
        txtMoTa.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_jbtNewActionPerformed

    private void jbtChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtChinhSuaActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtMaSoKhamBenh, sb, "Mã Số Khám Bệnh không được để trống !");
        DataValidator.validateEmpty(txtHoTen, sb, "Tên Bệnh Nhân không được để trống !");

        if (sb.length() > 0) {
            MessagaDialog.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        if (MessagaDialog.showConfirmDialog(parentForm, "Bạn có muốn chỉnh sửa dữ liệu Lịch Khám không ? ", "Hỏi") == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            LichKham lc = new LichKham();

            lc.setMaSoKhamBenh(txtMaSoKhamBenh.getText());
            lc.setHoTen(txtHoTen.getText());

            Date ns = txtNgaySinh.getDate();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String Date1 = dateFormat.format(ns);
            lc.setNgaySinh(Date1);

            lc.setGioiTinh(rdoNam.isSelected() ? 1 : 0);
            lc.setSDT(txtSDT.getText());
            lc.setNgheNghiep(txtNgheNghiep.getText());
            lc.setEmail(txtEmail.getText());
            lc.setDiaChi(txtDiaChi.getText());

            Date ms = txtNgayKham.getDate();
            DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            String Date2 = dateformat.format(ms);
            lc.setNgayKham(Date2);

            lc.setMotaTrieuChung(txtMoTa.getText());

            LichKhamDao dao = new LichKhamDao();
            if (dao.update(lc)) {
                MessagaDialog.showMessageDialog(parentForm, "Bệnh Án đã chỉnh sửa thành công !", "Thông báo");
                loadDataToTable();
            } else {
                MessagaDialog.showConfirmDialog(parentForm, "Chưa thể chỉnh sửa Bệnh Án", "Lỗi");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessagaDialog.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_jbtChinhSuaActionPerformed

    private void jbtXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtMaSoKhamBenh, sb, "Mã Số Khám Bệnh không được để trống !");

        if (sb.length() > 0) {
            MessagaDialog.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        if (MessagaDialog.showConfirmDialog(parentForm, "Bạn có muốn xóa thông tin Khám Bệnh không ? ", "Hỏi") == JOptionPane.NO_OPTION) {
            return;
        }

        try {

            LichKhamDao dao = new LichKhamDao();
            if (dao.deleteByMaKhamBenh(txtMaSoKhamBenh.getText())) {
                MessagaDialog.showMessageDialog(parentForm, "Lịch Khám đã xóa thành công !", "Thông báo");
                jbtNewActionPerformed(evt);
                loadDataToTable();
            } else {
                MessagaDialog.showConfirmDialog(parentForm, "Không thể xóa thông tin Lịch Khám hoặc không có Lịch Khám phù hợp được lưu !", "Lỗi");
            }

        } catch (Exception e) {
            e.printStackTrace();
            MessagaDialog.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_jbtXoaActionPerformed

    private void tblLichKhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLichKhamMouseClicked
        try {
            int row = tblLichKham.getSelectedRow();
            jbtSave.setEnabled(false);

            if (row >= 0) {
                String id = (String) tblLichKham.getValueAt(row, 0);
                LichKhamDao dao = new LichKhamDao();
                LichKham lc = dao.findByMaKhambenh(id);

                if (lc != null) {
                    txtMaSoKhamBenh.setText(lc.getMaSoKhamBenh());
                    txtHoTen.setText(lc.getHoTen());

                    Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(lc.getNgaySinh());
                    txtNgaySinh.setDate(date1);

                    if ((lc.getGioiTinh() + "").equals("1")) {
                        rdoNam.setSelected(true);
                        rdoNu.setSelected(false);
                    } else {
                        rdoNam.setSelected(false);
                        rdoNu.setSelected(true);
                    }

                    txtSDT.setText(lc.getSDT());
                    txtNgheNghiep.setText(lc.getNgheNghiep());
                    txtEmail.setText(lc.getEmail());
                    txtDiaChi.setText(lc.getDiaChi());

                    Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(lc.getNgayKham());
                    txtNgayKham.setDate(date2);

                    txtMoTa.setText(lc.getMotaTrieuChung());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessagaDialog.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tblLichKhamMouseClicked

    private void jbtInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInActionPerformed
        try {
            MessagaDialog.showMessageDialog(parentForm, "Chưa Hỗ trợ máy in của bạn !", "Lỗi");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jbtInActionPerformed

    private void txtMaSoKhamBenhFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaSoKhamBenhFocusLost
        try {
            LichKhamDao dao = new LichKhamDao();
            LichKham lc = dao.findByMaKhambenh(txtMaSoKhamBenh.getText());
            if (lc != null) {
                txtMaSoKhamBenh.setText(lc.getMaSoKhamBenh());
                txtHoTen.setText(lc.getHoTen());

                Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(lc.getNgaySinh());
                txtNgaySinh.setDate(date1);

                txtSDT.setText(lc.getSDT());
                txtNgheNghiep.setText(lc.getNgheNghiep());
                txtEmail.setText(lc.getEmail());
                txtDiaChi.setText(lc.getDiaChi());

                Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(lc.getNgayKham());
                txtNgayKham.setDate(date2);

                txtMoTa.setText(lc.getMotaTrieuChung());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtMaSoKhamBenhFocusLost

    private void jbtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSearchActionPerformed
        try {
            LichKhamDao dao = new LichKhamDao();
            String a;
            if (jComboBox.getSelectedIndex() == 0) {
                a = "MaSoKhamBenh";
            } else if (jComboBox.getSelectedIndex() == 1) {
                a = "HoTen";
            } else if (jComboBox.getSelectedIndex() == 2) {
                a = "GioiTinh";
            } else if (jComboBox.getSelectedIndex() == 3) {
                a = "NgaySinh";
            } else {
                a = "NgayKham";
            }
            String b = txtSearch.getText();
            List<LichKham> list = new LichKhamDao().findBy(a, b);
            System.out.println("list size = " + list.size());

            if (list.size() != 0) {
                MessagaDialog.showMessageDialog(parentForm, " Đã tìm thấy thông tin phù hợp !", "Thông Báo ");
                try {

                    tblModel.setRowCount(0);

                    for (LichKham it : list) {
                        tblModel.addRow(new Object[]{
                            it.getMaSoKhamBenh(), it.getHoTen(), it.getNgaySinh(), it.getGioiTinh() == 1 ? "Nam" : "Nữ", it.getSDT(), it.getNgheNghiep(),
                            it.getEmail(), it.getDiaChi(), it.getNgayKham(), it.getMotaTrieuChung()
                        });
                    }
                    tblModel.fireTableDataChanged();
                } catch (Exception e) {
                    e.printStackTrace();
                    MessagaDialog.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
                }

                txtMaSoKhamBenhFocusLost(null);
            } else {
                MessagaDialog.showMessageDialog(parentForm, " Không tìm thấy bệnh nhân phù hợp !", "Thông Báo ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessagaDialog.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }

    }//GEN-LAST:event_jbtSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtSearch.setText("");
        loadDataToTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtChinhSua;
    private javax.swing.JButton jbtIn;
    private javax.swing.JButton jbtNew;
    private javax.swing.JButton jbtSave;
    private javax.swing.JButton jbtSearch;
    private javax.swing.JButton jbtXoa;
    private javax.swing.JLabel jlbDiaChi;
    private javax.swing.JLabel jlbEmail;
    private javax.swing.JLabel jlbGioiTinh;
    private javax.swing.JLabel jlbHoten;
    private javax.swing.JLabel jlbMoTa;
    private javax.swing.JLabel jlbNgayKham;
    private javax.swing.JLabel jlbNgaySinh;
    private javax.swing.JLabel jlbNgheNghiep;
    private javax.swing.JLabel jlbSDT;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblLichKham;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSoKhamBenh;
    private javax.swing.JTextField txtMoTa;
    private com.toedter.calendar.JDateChooser txtNgayKham;
    private com.toedter.calendar.JDateChooser txtNgaySinh;
    private javax.swing.JTextField txtNgheNghiep;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
