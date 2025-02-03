package aula.pkg6;

import javax.swing.JOptionPane;

public class Aula6 {

    public static void main(String[] args) {
        double n1,n2,n3,m;
        n1=Double.parseDouble(JOptionPane.showInputDialog
        ("Digite o 1º número: "));
        n2=Double.parseDouble(JOptionPane.showInputDialog
        ("Digite o 2º número: "));
        n3=Double.parseDouble(JOptionPane.showInputDialog
        ("Digite o 3º número: "));
        m = (n1+n2+n3)/3;
        JOptionPane.showMessageDialog(null,String.format("Média: %.2f",m));
    }
    
}
