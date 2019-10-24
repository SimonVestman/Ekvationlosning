import javax.swing.*;

/*
Skapat 2019-10-24
Av Simon Vestman
*/

public class ekvationlosning {
    public static void main(String[] args) {

        //Är det en linjär ekvation eller en andragrads ekvation
        String p =  JOptionPane.showInputDialog(null,"Är det" + "\n" +
                "1. En linjär ekvation" + "\n" +
                "2. En andragrads ekvation");
        int et = Integer.parseInt(p);
        //lösning till linjär ekvation
            if ( et = 1) {
                String K = JOptionPane.showInputDialog(null, "Skriv den linjära ekvationens K värde.");
                String Y = JOptionPane.showInputDialog(null, "Skriv den linjära ekvationens Y värde.");
                String M = JOptionPane.showInputDialog(null, "Skriv den linjära ekvationens M värde.");

            } else if ( et = 2) {

            }
    }
}

