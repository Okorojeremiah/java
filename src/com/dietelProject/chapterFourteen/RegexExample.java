package Chapter14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    Pattern p;
    Matcher m;
    public static void main(String[] args) {
        //firstPattern();
        validateFirstName();
        //passwordMatches();
    }

    private static void passwordMatches() {
        String password = "anu5aJam13@56#";
        //System.out.println(password.matches());
    }

    private static void validateFirstName() {
        Pattern p = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.[!@#&()–%|[{}]:;',?/*~$^+=<>]).{8,30}$");
        //Pattern p = Pattern.compile("^(?=.*\\d)+(?=.*[a-z])(?=.*[A-Z]).{8,30}$");
        Matcher m = p.matcher("a4James12&3");
        System.out.println(m.find());
    }

    private static void firstPattern() {
        Pattern p = Pattern.compile("[a-z].[a-z]+@semicolon.africa");
        Matcher m = p.matcher("j.aduloju@semicolon.africa");
        System.out.println(m.find());
    }

}
