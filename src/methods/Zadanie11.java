package methods;

import java.util.Scanner;

public class Zadanie11 {

    public static void main(String[] args) {


      numberOfDivisors();

    }

    //Napisz funkcję, która odczytuje jako argument liczbę i wypisuje liczbę dzielników.

    public static void numberOfDivisors(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj liczbe: ");
        int number = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                result ++;
            }
        }
        System.out.println("liczba dzielnikow liczby " + number + " wynosi: " + result);
        scanner.close();
     }

}
