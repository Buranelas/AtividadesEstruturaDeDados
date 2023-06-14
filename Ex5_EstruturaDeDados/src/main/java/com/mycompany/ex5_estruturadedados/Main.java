package com.mycompany.ex5_estruturadedados;

import javax.swing.JOptionPane;
import models.Fibonacci;

public class Main {

    public static void main(String[] args) {
        int fibonacci;
        
        String input = JOptionPane.showInputDialog("Informe até qual digito deseja ver?");
        fibonacci = Integer.parseInt(input);
        
        Fibonacci f1 = new Fibonacci();
        System.out.println(f1.fibonacci(fibonacci));
    }
}
