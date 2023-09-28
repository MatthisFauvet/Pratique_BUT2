import java.sql.*;

public class Exercice1 {
    public static void main(String[] args){

        try{
            Class.forName("org.mariadb.jdbc.Driver");
        } catch(ClassNotFoundException e) {
            System.out.println("Tu as oublié le CP grosse nouille");
            System.exit(1);
        }

        try{
            Connection conx = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/fauvet", "fauvet", "94AmhmE8");
            try{ 
                PreparedStatement req = conx.prepareStatement("SELECT nomPays, pointsVote FROM PaysFa JOIN VoteFa ON PaysFa.idPays = VoteFa.Competiteur;");
                try {
                    ResultSet res = req.executeQuery();
                    System.out.println(res);
                    while(res.next()){
                        System.out.println(res.getString(1) + "  " + res.getInt(2));
                    }
                    conx.close();
                } catch(SQLException e){
                    System.out.println("Erreur de récupération");
                    conx.close();
                }
            } catch(SQLException e){
                System.out.println("Erreur de création, fermeture de la base");
                conx.close();
            }
        } catch(SQLException e) {
            System.out.println("Connexion non établie : " + e);
            System.exit(1);
        }
    }
}