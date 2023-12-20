/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author hoanh
 */
public class Model_menu {
    String icon ;
    String name;
    MenuType type; 
    
    public  static enum MenuType{
        TITLE, MENU, EMPTY
    }
    
    public Icon  toIcon(){
        return new ImageIcon(getClass().getResource("/com/raven/icon/"+icon+".png"));
    }

    public Model_menu(String icon, String name, MenuType type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    public Model_menu() {
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }
    
}
