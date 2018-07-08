package tables;

public class Zadanie3 {

    public static void main(String[] args) {

        Zadanie3 zad3 = new Zadanie3();

        System.out.println(zad3.sumElements(new int[] {1,2}));

    }

   //Napisz metodę, która jako argument przyjmuje zawsze tablice składającą się z
   // dwóch elementów liczb całkowitych. Metoda ma zwróci sumę elementów tablicy.

    public int sumElements(int[] tab) {
        if(tab.length == 2) {
            return tab[0] + tab[1];
        }
        return -1;
    }
}
