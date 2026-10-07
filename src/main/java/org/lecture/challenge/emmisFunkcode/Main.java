package org.lecture.challenge.emmisFunkcode;

public class Main {
    static void main() {
        //Task 1
        String text = "AAABBCCCCDAA";
        System.out.println(Funkcode.komprimiere(text));

        //Task 2
        String text1 = "111AAA!!!??"; // -> "13|A3|!3|?2"
        String text2 = "AA11BB"; // -> "A2|12|B2"
        String text3 = "AAAAAAAAAAAA"; // -> "A12"
        String text4 = "111111111111"; // ->"112"

        System.out.println(Funkcode.komprimiere2(text1));
        System.out.println(Funkcode.komprimiere2(text2));
        System.out.println(Funkcode.komprimiere2(text3));
        System.out.println(Funkcode.komprimiere2(text4));
    }
}

class Funkcode {
    public static String komprimiere(String text) {
        if (text == null || text.length() == 0) {
            return "";
        }
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) < 'A' || text.charAt(i) > 'Z') {
                return "UNGUELTIG";
            }
        }

        int count = 1;

        StringBuilder sb = new StringBuilder();
        sb.append(text.charAt(0));

        for (int i = 0; i < text.length() - 1; i++) {

            if (text.charAt(i) == text.charAt(i + 1)) {
                count++;
            }
            if (text.charAt(i) != text.charAt(i + 1)) {
                sb.append(count);
                count = 1;
                sb.append(text.charAt(i + 1));
            }
        }
        sb.append(count);
        return sb.toString();
    }

    public static String komprimiere2(String text) {
        if (text == null || text.length() == 0) {
            return "";
        }

        int count = 1;

        StringBuilder sb = new StringBuilder();
        sb.append(text.charAt(0));

        for (int i = 0; i < text.length() - 1; i++) {

            if (text.charAt(i) == text.charAt(i + 1)) {
                count++;
            }
            if (text.charAt(i) != text.charAt(i + 1)) {
                sb.append(count);
                sb.append("|");
                count = 1;
                sb.append(text.charAt(i + 1));
            }
        }
        sb.append(count);
        return sb.toString();
    }


}