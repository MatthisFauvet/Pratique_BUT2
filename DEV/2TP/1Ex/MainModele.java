import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MainModele {
    
    private JLabel image;
    private JLabel image2;
    private JLabel image3;
    private int curseur;
    private JLabel[] table = {null, null};

    public MainModele() {
        this.image = new JLabel(new ImageIcon("images/01.jpg"));
        this.image2 = new JLabel(new ImageIcon("images/02.jpg"));
        this.image3 = new JLabel(new ImageIcon("images/03.png"));
        this.curseur = 0;
    }

    public JLabel getData(int x){
        JLabel[] dossier = {this.image, this.image2, this.image3};
        return dossier[x];
    }

    public JLabel[] next(){
        this.table[0]=this.getData(this.curseur);
        if(this.curseur != 2){
            this.curseur = this.curseur + 1;
        }else {
            this.curseur = 0;
        }
        this.table[1]=this.getData(this.curseur);

        System.out.println(this.curseur);

        return(this.table);
    }
}
