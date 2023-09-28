import java.sql.*;

public class MainModele {
    final static int BADREQUEST = 0;
    
    public MainModele(){
        
    }

    public ResultSet getData(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
        } catch(ClassNotFoundException e) {
            System.out.println("Tu as oublié le CP grosse nouille");
            System.exit(1);
        }

        try{
            Connection conx = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/fauvet", "fauvet", "94AmhmE8");
            try{ 
                PreparedStatement req = conx.prepareStatement("SELECT nomPays, SUM(pointsVote) AS total_points FROM VoteFa JOIN PaysFa ON VoteFa.Competiteur = PaysFa.idPays GROUP BY Competiteur ORDER BY total_points DESC;");
                try {
                    ResultSet res = req.executeQuery();
                    conx.close();
                    return res;
                } catch(SQLException e){
                    System.out.println("Erreur de récupération");
                    conx.close();
                    return null;
                }
            } catch(SQLException e){
                System.out.println("Erreur de création, fermeture de la base");
                conx.close();
                return null;
            }
        } catch(SQLException e) {
            System.out.println("Connexion non établie : " + e);
            return null;
        }
    }
}
