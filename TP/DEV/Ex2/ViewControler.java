import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ViewControler implements ActionListener{

    MainVue view;
    
    public ViewControler(MainVue viewArgs) {
        this.view = viewArgs;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.view.refresh();

        ResultSet result = MainModele.getData();

        if(result!=null){
            try {
                result.next();
                view.setCountry(result.getString(1));
                view.setPoint(result.getInt(2));
                result.close();
            } catch(SQLException evt){
                System.out.println("Problème de base" + e);
            }
        }
    }    
}