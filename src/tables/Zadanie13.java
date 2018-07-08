package tables;

public class Zadanie13 {

    public static void main(String[] args) {

        Zadanie13 zad = new Zadanie13();

        String[] tab = {"ania","lukasz","basia","wlodek","jolka"};
        zad.fiveLetters(tab);

    }

    //Napisz metodę, która jako argument przyjmuje tablicę Stringów. Jako wynik ma
    //zwracać tablice wszystkich słów, które zawierają słowa 5-literowe.
    public String[] fiveLetters(String[] tab){
        String[] result = new String[tab.length];
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i].length() == 5) {
                result[counter] = tab[i];
                counter++;
            }
        }

        String[] names = new String[counter];

        for (String i:result) {

            if(i != null){
                System.out.println(i);
            }
        }
        return result;
    }

}
