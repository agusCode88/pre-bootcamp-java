package menuapp;

import java.awt.*;

public class MenuPrincipal {
    public static void main(String[] args) {

        MenuPrincipal menuPP = new MenuPrincipal();
        //welcomeScreen( 17 );
        //menuPP.welcomeScreen( 17 );
        welcomeScreen(17 );
        //getFilterUserByAge()
        //showProgramation()
    }

    static void welcomeScreen( int ageUser ){
        //return "Bienvenido a la aplicacion de contenido multimedia";
        System.out.println("Bienvenido a la aplicacion de contenido multimedia");
        if( ageUser >= 18 ){
            System.out.println("Programación adulto");
        } else{
            System.out.println("Programación infantil");
        }
    }
}
