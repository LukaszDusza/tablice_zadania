package tables;

public class Zadanie9 {

    public static void main(String[] args) {

        Zadanie9 zad = new Zadanie9();
        zad.revereseTable(new int[] {1,2,3,4,5,6,7,8,9});

    }

    //Napisz metodę, która odwraca daną tablicę liczb całkowitych.

    public int[] revereseTable(int[] tab) {
        int[] result = new int[tab.length];

        for(int i = 0; i < tab.length; i++) {
            result[(tab.length - i) -1] = tab[i];
        }

        for (int i: result) {
            //result[i];
            System.out.print(i + ",");
        }
      return result;
    }
}
