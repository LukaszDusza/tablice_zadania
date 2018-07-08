package tables;

public class Zadanie11 {

    public static void main(String[] args) {

        Zadanie11 zad = new Zadanie11();
        zad.sortBubble(new int[] {6,5,9,1,6,3,21,6,5,3,56,11,68,3,2,21,4,6,70,-12,-98});

        }

        //Napisz metodę, która zwraca posortowaną tablicę liczb.
    public int[] sortBubble(int[] tab){
        int temp;
        int zm = 1;

        while (zm > 0) {
            zm = 0;
            for(int i = 0; i < tab.length - 1; i++){
                //jezeli drugi element jest wiekszy od piwrwszego:
                if(tab[i] > tab[i + 1]) {
                    //to drugi elem. wrzucam do temp.
                    temp = tab[i + 1];
                    //drugi elem. przesatwiam na pierwsza pozycje
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    zm++;
                }
            }
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ", ");
        }
        return tab;
    }
}
