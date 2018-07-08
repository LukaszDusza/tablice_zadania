package tables;

public class Zadanie7 {

    public static void main(String[] args) {

        Zadanie7 zad = new Zadanie7();
        System.out.println(zad.sumTableElem(new int[] {234,654,789,2123}));

    }

    //Napisz metodę, która zwraca sumę elementów tablicy całkowitej.
    public int sumTableElem(int[] tab) {
        int result = 0;
        for(int i = 0; i < tab.length; i++){
            result += tab[i];
            //result = result + tab[i];
        }
        return result;
    }

}
