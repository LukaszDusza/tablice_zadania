package tables;

public class Zadanie16 {

    public static void main(String[] args) {

        Zadanie16 zad = new Zadanie16();
        zad.howManyBoolean(new boolean[] {true, false,true,true,true,false});
    }

//Napisz metodę, która jako argument zawiera tablicę elementów typu boolean.
//Metoda ma zwrócić nową tablicę, która zawiera tyle elementów true ile znajduje
//się w bazowej tablicy.


    public boolean[] howManyBoolean(boolean[] tab) {
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i]){
                counter++;
            }
        }
        boolean[] result = new boolean[counter];
        for (int i = 0; i < counter; i++) {
            result[i] = true;
        }

        for (boolean b: result
             ) {
            System.out.println(b);
        }
        return result;
    }

}




