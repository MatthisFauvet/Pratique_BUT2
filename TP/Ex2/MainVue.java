import javax.swing.*;
import java.awt.*;

public class MainVue {
    private JLabel labelCountry;
    private JLabel labelPoints;

    private JPanel pannelTop;
    private JPanel pannelCenter;
    private JPanel pannelBottom;
    
    public MainVue(){
        JFrame view = new JFrame("Points");
        view.setSize(500, 500);
        view.setLocation(710, 290);

        GridLayout layout = new GridLayout(4, 1);
        view.setLayout(layout);

        this.pannelTop = new JPanel();
        this.pannelCenter = new JPanel();
        this.pannelBottom = new JPanel();

        this.labelCountry = new JLabel("Italie");
        this.labelPoints = new JLabel("0");

        JButton button = new JButton("Refresh");
        
        ViewControler viewController = new ViewControler(this); 
        button.addActionListener(viewController);
        
        this.pannelTop.add(this.labelCountry);
        view.add(pannelTop);
        view.add(pannelCenter);
        view.add(pannelBottom);
        view.add(button);

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        view.setVisible(true);
    }

    public void setPoint(int points){
        //TODO
        this.labelPoints.setText(Integer.toString(points));
        this.pannelCenter.add(this.labelPoints);
    }

    public void setCountry(String country){
        //TODO
        this.labelCountry.setText(country);
        this.pannelCenter.add(this.labelPoints);
    }

    public void refresh(){
        this.labelCountry.revalidate();
        this.labelPoints.revalidate();
    }
}
