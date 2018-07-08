package tables;

public class Zadanie6 {

    public static void main(String[] args) {

        Zadanie6 zad = new Zadanie6();
      zad.concatTables(new int[] {1,2,3,4}, new int[]{5,6,7,8,9});

    }

    //Zakładamy, że mamy 2 tablice 2 elementowe. Nasza metoda powinna zwrócić
    //nową tablicę, która jest połączona z dwóch tablic.
    public int[] concatTables(int[] tab1, int[]tab2){
        int[] tab3 = new int[tab1.length + tab2.length];

        int couter = 0;

        for(int i = 0; i < tab1.length; i++){
            tab3[i] = tab1[i];
            couter++;
        }

        for(int i = 0; i < tab2.length; i++) {
         //   tab3[couter + i] = tab2[i];
            tab3[tab1.length + i] = tab2[i];
        }

        for(int i = 0; i < tab3.length; i++) {
            System.out.println(tab3[i]);
        }
        return tab3;
    }
}
