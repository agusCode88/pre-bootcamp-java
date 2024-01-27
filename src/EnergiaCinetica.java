public class EnergiaCinetica {

    public static void main(String[] args) {

     int masaCuerpo = 12;
     int velocidadCuerpo = 3;
     double energiaCineticaCuerpo = 0;

     energiaCineticaCuerpo = ((double) (masaCuerpo) / 2) * Math.pow(velocidadCuerpo,2);

     System.out.println(String.format("El valor de la energia cinetica es: %,.4f" , energiaCineticaCuerpo));

    }
}
