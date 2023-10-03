import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ViewControler implements ActionListener{

    MainVue view;
    MainModele model;
    
    public ViewControler(MainVue viewArgs, MainModele argModel) {
        this.view = viewArgs;
        this.model = argModel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.view.refresh();

        ResultSet result = this.model.getData();

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