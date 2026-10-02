package org.lecture;

/**
 * Nachrichten aus einem alten Funksystem treffen ein.
 * Gleiche Buchstaben sollen zusammengefasst werden.
 * <p>
 * Aus AAABBCCCCDAA soll A3B2C4D1A2 werden.
 * <p>
 * Die Nachrichten enthalten ausschließlich die Buchstaben von A - Z.
 * Ist der übergebene Text leer oder null, gib einen leeren String zurück.
 * Kann der String nicht verarbeitet werden gib UNGUELTIG zurück.
 */
public class FunkCode {
    static void main() {
        String text = "AAABBCCCCDAA";
        String text2 = "";
        String text3 = null;
        String text4 ="abCDe1!";
        System.out.println(encoder(text));
        System.out.println(encoder(text2));
        System.out.println(encoder(text3));
        System.out.println(encoder(text4));
    }

    public static String encoder(String text) {
        StringBuilder sb = new StringBuilder();

        if (text == null || text.isEmpty()) {
            return "";
        }
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) < 'A' || text.charAt(i) > 'Z') {
                return "UNGUELTIG";
            }
        }
        char letter = text.charAt(0);
        sb.append(letter);

        int count = 1;

        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                count++;
            }

            if (text.charAt(i) != text.charAt(i + 1)) {
                sb.append(count);
                letter = text.charAt(i + 1);
                sb.append(letter);
                count = 1;
            }

        }
        sb.append(count);

        return sb.toString();
    }
}
