package Soldado;

public class Principal {
    public static void main(String[] args) {
        Soldado s1 = new Soldado("soldadinho 01");
        Soldado s2 = new Soldado("soldadinho 02");
        Soldado s3 = new Soldado("soldadinho 03");

        s1.movimentar();
        s3.movimentar(5);
        s2.atacar("baioneta");
        s3.atacar();

    }
}