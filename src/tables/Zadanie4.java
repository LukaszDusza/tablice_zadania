package tables;

public class Zadanie4 {

    public static void main(String[] args) {

        Zadanie4 zad4 = new Zadanie4();
        System.out.println(zad4.sumFirstLastElem(new int[]{1,2,3,4,5}));

    }

    //Napisz metodę, która dla danej tablicy zwraca sumę pierwszego i ostatniego
    //elementu tablicy.
    public int sumFirstLastElem(int[] tab){
        return tab[0] + tab[tab.length-1];
    }

}
