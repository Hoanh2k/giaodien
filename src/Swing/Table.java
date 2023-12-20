/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.statusType;

public class Table extends  JTable{

    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230,230,200));
        setRowHeight(30);// chiều cao của dòng 
        //setBorder(new EmptyBorder(10,5,10,5));
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o+" ");
                if (i1 == 4) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
            
        });
        
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if(column !=4){
                    Component com =   super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
                setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
//                    if(isSelected){
//                        com.setBackground(new Color(13,113,182));
//                    }else{
//                        com.setBackground(new Color(102,102,102));
//                    }
                return com;
                }else{
                    statusType type = (statusType) value;
                    cellStatus cell = new cellStatus(type);
                    return cell;
                }
            }
           
        });
    }
    
    public void addRow(Object[] row){
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }
    
}
