package form;

public class Form_BanHang extends javax.swing.JPanel {

    public Form_BanHang() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new Swing.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        panelWebcam = new Swing.PanelBorder();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHoaDon = new Swing.Table();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelBorder2 = new Swing.PanelBorder();
        jLabel3 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblGioHang = new Swing.Table();
        panelBorder4 = new Swing.PanelBorder();
        jLabel5 = new javax.swing.JLabel();
        textField1 = new Swing.TextField();
        textField2 = new Swing.TextField();
        textField3 = new Swing.TextField();
        textField4 = new Swing.TextField();
        textField5 = new Swing.TextField();
        lblAddKH = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTienKhachDua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblTienThua = new javax.swing.JLabel();
        cboHinhThucThanhToan = new Swing.Combobox();
        bntThanhToan = new javax.swing.JButton();
        btnTaoHoaDon = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        panelBorder3 = new Swing.PanelBorder();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblSanPham = new Swing.Table();
        cboKichThuoc = new Swing.Combobox();
        cboMauSac = new Swing.Combobox();
        cboChatLieu = new Swing.Combobox();
        txtTimKiem = new Swing.TextField();
        lblReset = new javax.swing.JLabel();

        setBackground(new java.awt.Color(232, 232, 232));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Hóa đơn");

        panelWebcam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout panelWebcamLayout = new javax.swing.GroupLayout(panelWebcam);
        panelWebcam.setLayout(panelWebcamLayout);
        panelWebcamLayout.setHorizontalGroup(
            panelWebcamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelWebcamLayout.setVerticalGroup(
            panelWebcamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblHoaDon);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelWebcam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelWebcam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(280, 280, 280))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Bán Hàng");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Giỏ Hàng");

        btnSua.setText("Sửa");

        btnXoa.setText("Xóa");

        tblGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblGioHang);

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa)
                    .addComponent(btnSua))
                .addGap(17, 17, 17))
        );

        panelBorder2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSua, btnXoa});

        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnSua)
                        .addGap(40, 40, 40)
                        .addComponent(btnXoa)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelBorder2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSua, btnXoa});

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("Thông tin hóa đơn");

        textField1.setEnabled(false);
        textField1.setLabelText("Mã hóa đơn");

        textField2.setEnabled(false);
        textField2.setLabelText("Tên nhân viên");

        textField3.setEnabled(false);
        textField3.setLabelText("Ngày mua ");

        textField4.setLabelText("Số điện thoại khách hàng");

        textField5.setEnabled(false);
        textField5.setLabelText("Tên khánh hàng");

        lblAddKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/add.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Tổng tiền:");

        lblTongTien.setText("-");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tiền khách đưa :");

        txtTienKhachDua.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Tiền thừa :");

        lblTienThua.setText("-");

        cboHinhThucThanhToan.setLabeText("Hình thức thanh toán");

        bntThanhToan.setBackground(new java.awt.Color(0, 255, 51));
        bntThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bntThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        bntThanhToan.setText("Thanh Toán");

        btnTaoHoaDon.setBackground(new java.awt.Color(0, 153, 255));
        btnTaoHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTaoHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoHoaDon.setText("Tạo hóa đơn");

        btnHuy.setBackground(new java.awt.Color(255, 0, 0));
        btnHuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy");

        javax.swing.GroupLayout panelBorder4Layout = new javax.swing.GroupLayout(panelBorder4);
        panelBorder4.setLayout(panelBorder4Layout);
        panelBorder4Layout.setHorizontalGroup(
            panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(panelBorder4Layout.createSequentialGroup()
                        .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder4Layout.createSequentialGroup()
                        .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bntThanhToan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelBorder4Layout.createSequentialGroup()
                                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder4Layout.createSequentialGroup()
                                        .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addComponent(lblAddKH))
                                    .addComponent(cboHinhThucThanhToan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder4Layout.createSequentialGroup()
                                        .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTienThua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtTienKhachDua))))
                                .addGap(23, 23, 23)))
                        .addGap(20, 20, 20))))
            .addGroup(panelBorder4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnTaoHoaDon)
                .addGap(63, 63, 63)
                .addComponent(btnHuy)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelBorder4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnHuy, btnTaoHoaDon});

        panelBorder4Layout.setVerticalGroup(
            panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddKH, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblTongTien))
                .addGap(18, 18, 18)
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblTienThua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboHinhThucThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(bntThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTaoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        panelBorder4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnHuy, btnTaoHoaDon});

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Sản Phẩm");

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tblSanPham);

        cboKichThuoc.setLabeText("Kích thước");

        cboMauSac.setLabeText("Màu sắc");

        cboChatLieu.setLabeText("Chất liệu");

        txtTimKiem.setLabelText("Tìm kiếm");

        lblReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Fatcow-Farm-Fresh-Arrow-refresh.32.png"))); // NOI18N

        javax.swing.GroupLayout panelBorder3Layout = new javax.swing.GroupLayout(panelBorder3);
        panelBorder3.setLayout(panelBorder3Layout);
        panelBorder3Layout.setHorizontalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(panelBorder3Layout.createSequentialGroup()
                        .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(panelBorder3Layout.createSequentialGroup()
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboKichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblReset)))
                        .addGap(0, 85, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelBorder3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cboChatLieu, cboKichThuoc, cboMauSac});

        panelBorder3Layout.setVerticalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboKichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );

        panelBorder3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboChatLieu, cboKichThuoc, cboMauSac});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelBorder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBorder4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, Short.MAX_VALUE))
                    .addComponent(panelBorder4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntThanhToan;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaoHoaDon;
    private javax.swing.JButton btnXoa;
    private Swing.Combobox cboChatLieu;
    private Swing.Combobox cboHinhThucThanhToan;
    private Swing.Combobox cboKichThuoc;
    private Swing.Combobox cboMauSac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddKH;
    private javax.swing.JLabel lblReset;
    private javax.swing.JLabel lblTienThua;
    private javax.swing.JLabel lblTongTien;
    private Swing.PanelBorder panelBorder1;
    private Swing.PanelBorder panelBorder2;
    private Swing.PanelBorder panelBorder3;
    private Swing.PanelBorder panelBorder4;
    private Swing.PanelBorder panelWebcam;
    private Swing.Table tblGioHang;
    private Swing.Table tblHoaDon;
    private Swing.Table tblSanPham;
    private Swing.TextField textField1;
    private Swing.TextField textField2;
    private Swing.TextField textField3;
    private Swing.TextField textField4;
    private Swing.TextField textField5;
    private javax.swing.JTextField txtTienKhachDua;
    private Swing.TextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
