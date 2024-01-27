public class CiclosRepetitivos {

    public static void main(String[] args) {

        int aEvaluar = 10;
        int i = 0 ;

        System.out.println("**************** WHILE **********************");
        while ( i <= aEvaluar ) {

            System.out.println("Se repite :" + i );

            // i = i +1;
            i++;
        }

        int j=0;

        do{
            System.out.println("**************** DO-WHILE **********************");
            System.out.println("Se repite :" + j );
            // i = i +1;
            j++;
        } while ( j <= aEvaluar);


        for( int k=0  ; k <= aEvaluar; k++ ){
            System.out.println("****************** FOR ********************");
            System.out.println("Se repite :" + k );
        }

    }
}
