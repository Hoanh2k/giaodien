package Swing;

import event.eventMenuSelected;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import model.Model_menu;

public class ListMenu<E extends Object> extends JList<E> {

    private final DefaultListModel model;
    private int selectedIndex = -1;
    private int overIndex = -1;
    private eventMenuSelected event;

    public void addeventMenuSelectted(eventMenuSelected event) {
        this.event = event;
    }

    public ListMenu() {
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    int index = locationToIndex(e.getPoint());
                    Object object = model.getElementAt(index);
                    if (object instanceof Model_menu) {
                        Model_menu menu = (Model_menu) object;
                        if (menu.getType() == Model_menu.MenuType.MENU) {
                            selectedIndex = index;
                            if(event != null){
                                event.selected(index);
                            }
                        }
                    } else {
                        selectedIndex = index;
                    }
                    repaint();
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                overIndex = -1;
                repaint();
                //  super.mouseExited(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }

        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int index = locationToIndex(e.getPoint());
                if (index != overIndex) {
                    Object o = model.getElementAt(index);
                    if (o instanceof Model_menu) {
                        Model_menu menu = (Model_menu) o;
                        if (menu.getType() == Model_menu.MenuType.MENU) {
                            overIndex = index;
                        } else {
                            overIndex = -1;
                        }
                        repaint();
                    }
                }

            }

        });
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int index, boolean selected, boolean focus) {
                Model_menu data;
                if (o instanceof Model_menu) {
                    data = (Model_menu) o;
                } else {
                    data = new Model_menu("", o + "", Model_menu.MenuType.EMPTY);
                }
                MenuItem item = new MenuItem(data);
                item.setSelected(selectedIndex == index);
                item.setOver(overIndex == index);
                return item;
            }

        };
    }

    public void addMenu(Model_menu data) {
        model.addElement(data);
    }
}
