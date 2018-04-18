import javax.swing.JOptionPane;

public class mainly {

    public static void main(String[] args) {

        double a = Integer.parseInt(JOptionPane.showInputDialog("Podaj długość boku a."));
        double b = Integer.parseInt(JOptionPane.showInputDialog("Podaj długość boku b."));
        double c = Integer.parseInt(JOptionPane.showInputDialog("Podaj długość boku c."));


        if ( PoleTrojkataa.sprawdzenie(a,b,c)) { JOptionPane.showMessageDialog(null, PoleTrojkataa.poleTrojkata(a,b,c));}
        else { JOptionPane.showMessageDialog(null, "Z tych wartości nie można zrobić trójkąta.");}

    }

}





