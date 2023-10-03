import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class ViewControler implements MouseListener{

    private MainModele model;
    private MainView view;

    public ViewControler(MainView cview, MainModele modele) {
        this.view = cview;
        this.model = modele;        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel[] temp = this.model.next();
        this.view.setNewPict(temp[0], temp[1]);
        System.out.println("Hello World");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
    
}
