package com.mycompany.ex4_estruturadedados;

import javax.swing.JOptionPane;
import models.Metodos;

public class Main {

    public static void main(String[] args) {
     int fatorial;
     
     String input = JOptionPane.showInputDialog("Informe o número para ser feito o fatorial:");
     fatorial = Integer.parseInt(input);
     
        Metodos m1 = new Metodos();
        
        JOptionPane.showMessageDialog(null, m1.fatorial(fatorial));
     
     
    }
}
