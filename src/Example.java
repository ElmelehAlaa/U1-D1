
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Example {
    public static void main(String[] args) {
        System.out.println("hello");

        moltiplicazione(6,5);
        concatenazione("ciao sono Alaa ed ho", 24  );
        String[] nomi;
        nomi = new String[]{"Luca", "Mario", "Giuseppe", "Andrea", "Fabio"};
        System.out.println(Arrays.toString(nomi));


    }



    public static void  moltiplicazione(int n1,int n2){

        System.out.println("il risultato è :"+ (n1 * n2));

    }
    public static void concatenazione(String string , int n3){
        System.out.println(string + " " + n3 + " "+ "anni");

        Scanner input = new Scanner(System.in);

        System.out.println("inserisci il nome del tuo cane");
        String name =   input.nextLine();
        System.out.println("hai inserito" + " "+ name);


        System.out.println("Inserisci La Razza del tuo cane");
        String razza= input.nextLine();
        System.out.println("hai inserito" + " " + razza);

        System.out.println("Inserisci taglia del tuo cane");
        String taglia = input.nextLine();
        System.out.println("hai inserito" + " " + taglia);

        System.out.println(taglia+ razza + name);


        System.out.println("inserisci base del rettangolo");
        int base =   input.nextInt();
        System.out.println("hai inserito" + " "+ base);

        System.out.println("inserisci altezza del rettangolo");
        int altezza =   input.nextInt();
        System.out.println("hai inserito" + " "+ altezza);

        System.out.println("il perimetro del rettangolo é : " + (base * altezza) );

        System.out.println("inserisci un numero intero");
        int num4 =   input.nextInt();
        System.out.println("hai inserito" + " "+ num4);
        System.out.println("il modulo di"+ num4+ "è"+num4 %2);

        System.out.println("inserisci lato A del triangolo");
        double LatoA =   input.nextDouble();
        System.out.println("hai inserito" + " "+ LatoA);

        System.out.println("inserisci Lato B del triangolo");
        double LatoB =   input.nextDouble();
        System.out.println("hai inserito" + " "+ LatoB);

        System.out.println("inserisci Lato C del triangolo");
        double LatoC =   input.nextDouble();
        System.out.println("hai inserito" + " "+ LatoC);

        double P = (LatoA+ LatoB + LatoC)/2;

        double AreaTriangolo = sqrt((P * (P-LatoA)* (P-LatoB) * (P-LatoC)));

        System.out.println("L'area del triangolo è " + AreaTriangolo);











        input.close();

    }






}