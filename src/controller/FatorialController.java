package controller;

public class FatorialController {
    public FatorialController() {
        super();
    }

    public int fat(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero * fat(numero - 1);
        }
    }
}
