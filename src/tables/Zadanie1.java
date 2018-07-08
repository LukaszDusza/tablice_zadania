package tables;

public class Zadanie1 {

    public static void main(String[] args) {

       Zadanie1 zadanie1 = new Zadanie1();

       int[] tab = {1,2,3,4,5,6};
       int result = zadanie1.first(tab);
        System.out.println(result);
    }


    //Zadanie 1.
    // Napisz metodę, która dla danej tablicy liczb całkowitych zwraca pierwszy element tablicy.
    public  int first(int[] tab){
        return tab[0];
    }




}
