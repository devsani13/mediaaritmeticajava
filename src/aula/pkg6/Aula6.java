package aula.pkg6;

import javax.swing.JOptionPane;

public class Aula6 {

    public static void main(String[] args) {
        double n1,n2,n3,m;
        n1=Double.parseDouble(JOptionPane.showInputDialog
        ("Digite o 1� n�mero: "));
        n2=Double.parseDouble(JOptionPane.showInputDialog
        ("Digite o 2� n�mero: "));
        n3=Double.parseDouble(JOptionPane.showInputDialog
        ("Digite o 3� n�mero: "));
        m = (n1+n2+n3)/3;
        JOptionPane.showMessageDialog(null,String.format("M�dia: %.2f",m));
    }
    
}
