package tables;

public class Zadanie17 {

    public static void main(String[] args) {

        Zadanie17 zad = new Zadanie17();
        System.out.println(zad.howManyOneDigit(new int[]{1,1,1,1,2,3,4,4,5,6,7,8,9},2));

    }




    //Napisz metodę, która wyznaczy liczbę wystąpień liczby k w danym ciągu.
    public int howManyOneDigit(int[] tab, int k){
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            if (k == tab[i]){
                counter++;
            }
        }
        return counter;
    }

}
