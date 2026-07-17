package cl.duoc.llanquihuetour.model;

public class Rut {
    private int numero;
    private char dv;

    public Rut(int numero, char dv) {
        if (!validar(numero, dv)) {
            throw new IllegalArgumentException("El RUT " + numero + "-" + dv + " no es valido.");
        }
        this.numero = numero;
        this.dv = Character.toUpperCase(dv);
    }

    public static boolean validar(int rut, char dv) {
        int m = 0, s = 1;
        for (; rut != 0; rut /= 10) {
            s = (s + rut % 10 * (9 - m++ % 6)) % 11;
        }
        return Character.toUpperCase(dv) == (char) (s != 0 ? s + 47 : 75);
    }

    @Override
    public String toString() {
        return String.format("%,d-%s", numero, dv).replace(',', '.');
    }
}