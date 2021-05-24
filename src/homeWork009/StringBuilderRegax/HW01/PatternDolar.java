package homeWork009.StringBuilderRegax.HW01;

import java.util.regex.*;
import java.util.regex.Pattern;

public class PatternDolar {
    public void dollar(String text) {
        String pattern = "\\$\\d*\\.\\d{2}";
        // String pattern = "^\\$(\\d+)(\\.\\d{2}$)";

        Pattern pt = Pattern.compile(pattern);
        Matcher m = pt.matcher(text);

        if (m.matches()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

