package tables;

public class Zadanie15 {
    public static void main(String[] args) {

        Zadanie15 zad = new Zadanie15();
        System.out.println(zad.maxWordLenth(new String[]{"poniedzialek", "wtorek", "sroda"}));

    }

    //Napisz metodę, która jako argument przyjmuje tablice Stringów. Jako wynik
    //metoda ma zwracać liczbę całkowitą, która oznacza najdłuższy wyraz w tablicy.

    public int maxWordLenth(String[] tab) {
        int maxValue = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i].length() > maxValue){
                maxValue = tab[i].length();
            }
        }
        return maxValue;
    }


}
