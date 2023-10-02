public class Example {
    public static void main(String[] args) {
        System.out.println("hello");

        moltiplicazione(6,5);
        concatenazione("ciao sono Alaa ed ho", 24  );




    }

    public static void  moltiplicazione(int n1,int n2){

        System.out.println("il risultato è :"+ (n1 * n2));

    }
    public static void concatenazione(String string , int n3){
        System.out.println(string + " " + n3 + " "+ "anni");

    }

    public static void arrayInser (String[] nomi){

        nomi = new String[]{"Luca", "Mario", "Giuseppe", "Andrea", "Fabio"};
        System.out.println(nomi);

    }



}