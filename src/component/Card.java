/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import model.Model_Card;

/**
 *
 * @author hoanh
 */
public class Card extends javax.swing.JPanel {

    Color color1;
    Color color2;

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public Card() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
    }

    public void setData(Model_Card data) {
        lblIcon.setIcon(data.getIcon());
        lblTitle.setText(data.getTitle());
        lblValues.setText(data.getValues());
        lblDescription.setText(data.getDescription());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblValues = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Add to basket.png"))); // NOI18N

        lblDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setText("Description");

        lblValues.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValues.setForeground(new java.awt.Color(255, 255, 255));
        lblValues.setText("Values");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Title");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(lblValues)
                    .addComponent(lblDescription)
                    .addComponent(lblIcon))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValues)
                .addGap(18, 18, 18)
                .addComponent(lblDescription)
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gradientPaint = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(gradientPaint);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        // g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getWidth(), getHeight());
       // g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getWidth(), getHeight());
       g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getWidth(), getHeight());
        super.paintComponent(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValues;
    // End of variables declaration//GEN-END:variables
}
