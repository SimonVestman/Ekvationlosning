import javax.swing.*;
import java.lang.String;

/*
Skapat 2019-10-24
Av Simon Vestman
*/

public class ekvationlosning {
    public static void main(String[] args) {

        //Är det en linjär ekvation eller en andragrads ekvation
        String p = JOptionPane.showInputDialog(null, "Är det" + "\n" +
                "1. En linjär ekvation" + "\n" +
                "2. En andragrads ekvation");
        int et = Integer.parseInt(p);
        //lösning till linjär ekvation
        if (et == 1) {
           String k = JOptionPane.showInputDialog(null,"Skriv värdet på k");
           String m = JOptionPane.showInputDialog(null,"Skriv värdet på m");
           double K = Double.parseDouble(k);
           double M = Double.parseDouble(m);
                double x;
                    x= -M/K;
                    JOptionPane.showMessageDialog(null,"X är = " + x);

                } else if (et == 2) {
                        String l = JOptionPane.showInputDialog(null,"Skriv värdet på P");
                        String q = JOptionPane.showInputDialog(null,"Skriv värdet på Q ");
                        double P = Double.parseDouble(l);
                        double Q = Double.parseDouble(q);
                            double x1;
                            double x2;
                                x1= -P/2  + Math.sqrt((-P/2)*(-P/2)-Q);
                                x2= -P/2  - Math.sqrt((-P/2)*(-P/2)-Q);
                                JOptionPane.showMessageDialog(null,"x1 och x2 är" + "\n" +
                                        "x1 = " + x1 + "\n" +
                                        "x2 = " + x2);

             }
    }
}

