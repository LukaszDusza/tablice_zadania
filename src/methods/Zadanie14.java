package methods;

import java.util.Scanner;

public class Zadanie14 {

    public static void main(String[] args) {


        System.out.println(maxDividers(2, 10000));


    }

//Skorzystaj z wcześniejszej funkcji (zad.11.) do znalezienia liczby od 2 do 10000,
//która ma największą liczbę dzielników.

public static void numberOfDivisors(int min, int max){


    int result = 0;
    int counter = 1;
    int temp = 0;
    int finalNumber = 0;


    /*for (int i = min; i <= max; i++) {
        if(min % counter == 0){
            if(temp > result ){
                result = temp;
                finalNumber = numberMin;
           }
        }
        numberMin++;
    }*/
    System.out.println("liczba, ktora ma najwieksza liczbe dzoelnikow: " + finalNumber + " wynosi: " + result);

}

    public static int maxAmountDividers(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static int maxDividers(int min, int max){
        int maxim = 0;
        for(int i = min; i <= max; i++) {

            if (maxim < maxAmountDividers(i)){
                maxim = maxAmountDividers(i);
                System.out.println(i + "ma dzielników: " + maxim);
            }
        }
        return maxim;
    }

}
