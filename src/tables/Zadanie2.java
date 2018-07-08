package tables;

public class Zadanie2 {

    public static void main(String[] args) {

        Zadanie2 zad2 = new Zadanie2();
        int result = zad2.lastElement(new int[] {1,2,3,4,5,6,7,8,9});
        System.out.println(result);

    }

    //Napisz metodę, która dla danej tablicy liczb całkowitych zwraca ostatni element
    //tablicy.

    public int lastElement(int[] tab) {
        return tab[tab.length-1];
    }


}
