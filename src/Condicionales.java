import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {

        int duration = 16;
        int cantidadEpisodios = 1;

      if( cantidadEpisodios >= 15 && duration <=15 ){
          System.out.println("Es una MiniSerie");

      }  else  {

            if(cantidadEpisodios == 1){
                System.out.println("Es una película");
            } else {
                System.out.println("Es una Serie de pocos capitulos");
            }
      }

        Scanner datoPorPantalla = new Scanner(System.in);
        System.out.println("Ingrese el día de la semana para ver su programacion: ");

      String diaSemana =  datoPorPantalla.next();

      if( Integer.parseInt(diaSemana) == 0 ){
          System.out.println("Es lunes");
      } else if ( Integer.parseInt(diaSemana) == 2 ) {
          System.out.println("Es martes");
      } else if (Integer.parseInt(diaSemana) == 3) {
          System.out.println("Es miércoles");
      }else if (Integer.parseInt(diaSemana) == 4) {
          System.out.println("Es jueves");
      }else if (Integer.parseInt(diaSemana) == 5) {
          System.out.println("Es viernes");
      }else if (Integer.parseInt(diaSemana) == 6) {
          System.out.println("Es sabado");
      }else if (Integer.parseInt(diaSemana) == 7) {
          System.out.println("Es domingo");
      }

      switch( Integer.parseInt(diaSemana) ){
          case 1:
              System.out.println("Es lunes");
              break;
          case 2:
              System.out.println("Es martes");
              break;
          case 3:
              System.out.println("Es miercoles");

              break;
          case 4:
              System.out.println("Es jueves");
              break;
          case 5:
              System.out.println("Es viernes");
              break;
          case 6:
              System.out.println("Es sabado");
              break;
          case 7:
              System.out.println("Es domingo");
              break;
          default :
              System.out.println("Error en la programacion de contenido");
      }

    }

}
