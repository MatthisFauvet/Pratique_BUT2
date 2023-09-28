import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewControler implements ActionListener{

    MainVue view;
    
    public ViewControler(MainVue viewArgs) {
        this.view = viewArgs;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.view.refresh();
        System.out.println("Test");
    }    
}