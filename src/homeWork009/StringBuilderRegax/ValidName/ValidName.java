package homeWork009.StringBuilderRegax.ValidName;
import java.util.regex.*;

public class ValidName {

    public void name(String text) {
        String pattern = "^.{3,15}$";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.matches()) {
            System.out.println("The name is valid!");
        } else {
            System.out.println("The name is Not valid!");
        }

    }
}
