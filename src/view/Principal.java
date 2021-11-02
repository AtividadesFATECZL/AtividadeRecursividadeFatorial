package view;

import controller.FatorialController;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        int entrada;
        FatorialController dc = new FatorialController();

        do {
            entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre um número entre 1 e 12", JOptionPane.QUESTION_MESSAGE));
        } while (entrada <= 0 || entrada > 12);


        int fat = dc.fat(entrada);
        System.out.println(fat);
    }

}
