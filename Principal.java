package batalhao;

public class Principal {
    public static void main(String[] args) {
        Soldado s1 = new Soldado("soldadinho 01");
        Soldado s2 = new Soldado("soldadinho 02");
        Soldado s3 = new Soldado("soldadinho 03");

        System.out.println(Soldado.getQuantidadeSoldados());

        s1.movimentar();
        s3.movimentar(5);
        s2.atacar("baioneta");
        s3.atacar();

    }
}