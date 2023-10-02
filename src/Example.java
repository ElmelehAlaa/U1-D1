import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        System.out.println("hello");

        moltiplicazione(6,5);
        concatenazione("ciao sono Alaa ed ho", 24  );
        String[] nomi = new String[]{"Luca", "Mario", "Giuseppe", "Andrea", "Fabio"};





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




        input.close();
    }






}