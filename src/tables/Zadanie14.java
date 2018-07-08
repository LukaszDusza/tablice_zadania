package tables;

public class Zadanie14 {
    public static void main(String[] args) {

        Zadanie14 zad = new Zadanie14();
        zad.toLower(new String[]{"DOM", "SAMOCHOD"});


    }

    //Napisz metodę, która jako argument przyjmuje tablicę Stringów. Jako wynik ma
    //zwracać tablice tej samej długości, w której wyrazy są napisane małymi literami(
    //duże litery zamieniamy na małe).
    public String[] toLower(String[] tab) {
        String[] result = new String[tab.length];
        for (int i = 0; i < tab.length; i++) {
            result[i] = tab[i].toLowerCase();
        }

        for (String i : result) {
            System.out.println(i);
        }
        return result;
    }

}