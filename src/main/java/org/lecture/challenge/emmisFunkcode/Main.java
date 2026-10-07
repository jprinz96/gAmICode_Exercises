package org.lecture.challenge.emmisFunkcode;

public class Main {
    static void main() {
        String text = "AAABBCCCCDAA";
        System.out.println(Funkcode.komprimiere(text));
    }
}
class Funkcode{
    public static String komprimiere(String text){
        if(text == null || text.length() == 0){
            return "";
        }
        for(int i = 0; i < text.length()-1; i++){
            if (text.charAt(i) < 'A' || text.charAt(i) > 'Z'){
                return "UNGUELTIG";
            }
        }

        int count = 1;

        StringBuilder sb = new StringBuilder();
        sb.append(text.charAt(0));

        for(int i = 0; i < text.length()-1; i++){

            if(text.charAt(i) == text.charAt(i+1)){
                count++;
            }
            if(text.charAt(i) != text.charAt(i+1)){
                sb.append(count);
                count = 1;
                sb.append(text.charAt(i+1));
            }
        }
        sb.append(count);
        return sb.toString();
    }
}