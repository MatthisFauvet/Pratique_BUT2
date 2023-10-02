import java.sql.*;

public class Main {
    public static void main(String[] Args){
        ResultSet result = MainModele.getData();
        MainVue view = new MainVue();

        if(result!=null){
            try {
                result.next();
                view.setCountry(result.getString(1));
                view.setPoint(result.getInt(2));
                result.close();
            } catch(SQLException e){
                System.out.println("Problème de base" + e);
            }
        }      
    }
}