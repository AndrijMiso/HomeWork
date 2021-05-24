package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Zirka {
    public static void main(String[] args) {

        String pattern = "[a-zIA]+";
        String text = "I am a Andrej";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if(m.matches()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        m.reset();
        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + " ");
        }




    }
}