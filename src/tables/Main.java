package tables;

import methods.ZadanieKostka;

public class Main {


    public static void main(String[] args) {



        //deklaracja tablicy z wartosciami
        int[] numbers = {1,2,3,4,5};

        //deklaracja wielkosci tablicy bez deklaracji wartosci
        int[] numbers2 = new int[6];

        //przypisanie wartosci do indeksu '0' tablicy.
        numbers2[0] = 2;

        //iteracja po wartosciach tablicy
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

}
