package tables;

public class Zadanie5 {

    public static void main(String[] args) {

        Zadanie5 zad = new Zadanie5();
        System.out.println(zad.middleElem(new int[]{1,2,3,4}));

    }

    //Napisz metodę, która zwraca element środkowy tablicy.
    public int middleElem(int[] tab){
         int i = (tab.length -1) / 2;
        System.out.println("i: " + i);
        return tab[i];
    }
    //przy int gdzie 3/2 = 1.5 -> obetnie miejsca po przecinku i zwroci 1.
}

