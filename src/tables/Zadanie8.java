package tables;

public class Zadanie8 {

    public static void main(String[] args) {

        Zadanie8 zad = new Zadanie8();
        System.out.println(zad.maxElem(new int[] {-12,-45,-43,-67,-87,-98,-32,-45,-32,-9,-25,-23,-76,-10}));

    }

    //Napisz metodę, która zwraca największy element tablicy całkowitej.
    public int maxElem(int[] tab) {
        int result = -8;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > result) {
                result = tab[i];
            }
        }
        return result;
    }

}
