import javax.swing.*;

public class MainView {

    private JFrame frame;

    public MainView(MainModele modele){

        this.frame = new JFrame();
        this.frame.setLocation(512, 512);
        this.frame.setSize(1000, 1000);

        ViewControler controler = new ViewControler(this, modele);
        this.frame.addMouseListener(controler);

        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.frame.setVisible(true);
    }

    public void setNewPict(JLabel last, JLabel niou){
        this.frame.remove(last);
        this.frame.add(niou);
        this.frame.revalidate();
    }

    public void setFirst(JLabel label){
        this.frame.add(label);
        this.frame.revalidate();
    }
}