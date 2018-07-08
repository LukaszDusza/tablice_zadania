package tables;

public class Zadanie12 {
    public static void main(String[] args) {

        Zadanie12 zad = new Zadanie12();

       zad.middle(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13});
     //   System.out.println(a[0]+ "," + a[1]);
    }

    //Napisz metodę, która zwraca tablice elementów środkowych.
    //Zakładamy, że długość tablicy jest zawsze podzielna przez 2.
    public int[] middle(int[] tab){
        if(tab.length % 2 == 0) {
            int[] result = {tab.length / 2, (tab.length / 2) +1}; //new int[2] -> {1,2};
            for (int i: result) {
                System.out.println(i);
            }
            return result;
        }
        System.out.println("tablica nie jest parzysta!!!");
        return null;
    }

}
