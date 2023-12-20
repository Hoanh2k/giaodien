/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import javax.swing.ImageIcon;
import model.Model_Card;
import model.statusType;

public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
        initComponents();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/Stop.png")), "Stock Total", "$200000", "Increased by 60%"));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/Stop.png")), "Stock Total", "$205000", "Increased by 25%"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/Stop.png")), "Stock Total", "$200600", "Increased by 70 %"));
        // add data to table
        
        
        Table.addRow(new Object[]{"abc","123","admin", "21/12/2000",statusType.APPROVED});
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card3 = new component.Card();
        card2 = new component.Card();
        card1 = new component.Card();
        panelBorder1 = new Swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new Swing.Table();

        setBackground(new java.awt.Color(232, 232, 232));

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card3.setToolTipText("0");
        card3.setColor1(new java.awt.Color(142, 142, 250));
        card3.setColor2(new java.awt.Color(123, 123, 245));
        panel.add(card3);

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(167, 94, 236));
        panel.add(card2);

        card1.setColor1(new java.awt.Color(241, 208, 62));
        card1.setColor2(new java.awt.Color(211, 184, 61));
        panel.add(card1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Table");

        jScrollPane1.setBorder(null);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "User type", "joined", "status"
            }
        ));
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 1129, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1187, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Table Table;
    private component.Card card1;
    private component.Card card2;
    private component.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane panel;
    private Swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
