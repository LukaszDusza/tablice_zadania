package methods;

public class Zadanie16 {

    public static void main(String[] args) {


       // ZadanieKostka kostka = new ZadanieKostka();
        ZadanieKostka.throwDice(4);

       isPesel("8709768A321");

    }
    // int -> Integer
    //Long -> Long
    // char-> Character - klasa opakowaniowa inaczej wraper)

    //Napisz metodę, która sprawdza czy wyraz jest peselem.
    // Dla uproszczenia sprawdzamy czy każdy znak jest cyfrą
    // i czy wyraz ma 11 znaków.

    public static boolean isPesel(String pesel) {
        char[] c = pesel.toCharArray();
        //"87090127436" -> |8|7|0|9|.... -> lenth;
        int counter = 0;
        for (int i = 0; i < pesel.length(); i++) {
            if(pesel.length() == 11) {
                if(Character.isDigit(c[i])) {
                    System.out.println(c[i] + " digit");
                } else {
                    System.out.println(c[i] + " not digit!");
                    counter++;
                }
            }
        }
        if(counter >0){
            System.out.println("false");
            return false;
        }
        System.out.println("true");
        return true;
    }

}
