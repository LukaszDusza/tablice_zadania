package methods;

import java.util.Random;

public class ZadanieKostka {

    public static void main(String[] args) {

        int[] allThrows = throwDice(3);
    }



    //default
    static int[] throwDice(int numbersOfThrows) {

        //deklaracja wielkosci tablicy 'list'
        int[] list = new int[numbersOfThrows];

        //nowy obiekt klasy Random
        Random random = new Random();

        // wykonuje iteracje zgodna z iloscia rzutów kostką.
        for (int i = 0; i < numbersOfThrows; i++) {

            //inicjuje nowa zmienna, ktora przyjmuje wartosc z obiektu klasy Random.
            int newThrow  = random.nextInt(7); //{0, x < 7}

            //sprawdzam warunek, jezeli liczba oczek jest inne niz zero to zapisuje do tablicy 'list'.
            if( newThrow != 0) {
                list[i] = newThrow;
            } else {
                list[i] = 1;
            }
        }

        for (int i: list) {
            System.out.print(i + "|");
        }
        return list;
    }

}
