package methods;

public class Zadanie10 {

    public static void main(String[] args) {

        System.out.println(wordSum("ala ma kota" , "ala ma psa"));
    }



    //Napisz metodę, która zwraca maksymalną długość 2 stringów.
     public static int wordSum(String a, String b) {
        int counter = 0;

         for (int i = 0; i < a.length(); i++) {
             counter++;
         }

         for (int i = 0; i < b.length(); i++) {
             counter++;
         }

         return counter;
        // return a.length() + b.length();
     }

}
