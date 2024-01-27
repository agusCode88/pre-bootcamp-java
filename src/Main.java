//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Variable del tipo entero, acepta numeros no taaaan gigantes
        int edadPersona = 5;
        // Tipo float, permite datos numéricos pero con decimales
        float alturaPersona = 1.75f;
        // Similar al float , érp acepta mayor cantidad de decimales
        double valorDePi = 3.1416858549589585985;
        // Sinmilar a int pero permite numeros de mayor tamaño
        long distanciaAlSol = 485858585854444444L;
        // Dato que acepta un caracter
        char unaLetra = 'A';
        // Dato de tipo lógica , puede ser verdadero o falso
        boolean esVerdad = true;

        String edadDeLaPersona = "La edad de la persona es: ";
        int contadorDeCaracteres = edadDeLaPersona.length();
        boolean estaVacioTexto = edadDeLaPersona.isEmpty();
        boolean existePalabraEdad = edadDeLaPersona.contains("edad");
        String nuevoTextoEdad =  edadDeLaPersona.replace("e","3");

       /*

        System.out.println( edadDeLaPersona + edadPersona );
        System.out.println(" La altura de la persona es: " + alturaPersona );
        System.out.println(" El número PI es: " + valorDePi );
        System.out.println(" La distancia al sol es: " + distanciaAlSol );
        System.out.println(" La letra es: " + unaLetra );
        System.out.println(" ¿ Es verdad esto ?: " + esVerdad );

        */

        System.out.println("El largo de la cadena es : " + contadorDeCaracteres );
        System.out.println("Esta vació el texto : " + estaVacioTexto );
        System.out.println("Existe edad en la frase : " + existePalabraEdad );
        System.out.println(" Este es el nuevo Texto : " + nuevoTextoEdad );


        /*
          Perimetro de un rectangulo: (base + altura) + ( base + altura)   ||  2A+2B
          Area : ladoA * LadoB
         */
        int ladoA = 15;
        int ladoB = 8;
        int perimetroRectangulo = 0;
        float areaRectangulo = 0;

        perimetroRectangulo = ( ladoA + ladoB ) + ( ladoA + ladoB );
        areaRectangulo = ( ladoA * ladoB );

        System.out.println("El perimetro es :" + perimetroRectangulo);
        System.out.println("El area es :" + areaRectangulo);


        /*
           Area de un circulo es pi * radio al cuadrad
                      a = pi * r¨¨
         */

        int radioCirculo = 60;
        double areaDelCirculo = 0;
        double numeroPi = 3.1416;

        areaDelCirculo = numeroPi * Math.pow( radioCirculo , 2 );
        System.out.println("El area del circulo es :" + areaDelCirculo);



    }
}