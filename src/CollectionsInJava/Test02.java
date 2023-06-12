package CollectionsInJava;

// import java.util.Scanner;
// import java.util.*;
import java.util.regex.*;
public class Test02 {
    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("..m");//. represents single character
        Matcher m = p.matcher("alm");

        boolean b = m.matches();

        System.out.println(b);

    //2nd way

        boolean b2 = Pattern.compile(" .m").matcher("monica").matches () ;
        System.out.println(b2);

    //3rd way

        boolean b3 = Pattern.matches(".m", "am");

        System.out.println(b3) ;

    }
    void RegexExample2(){
        System.out.println(Pattern.matches( " [am] ", "acd") );
        System.out.println(Pattern.matches("[arm]", "a"));//(azuong a or m or n)
        System.out.println(Pattern.matches("[^amn]", "c"));//any character leaving a m and n
        System.out.println(Pattern.matches("[a-zA-S]", "I"));// any character which range between a to z and A to S
        System.out.println(Pattern.matches("[a-ds-u]", "b"));//any character that range between a-d or s-u
    }

    void RegexExample3(){
        
//if the regular expression accepts 6 character sequence, starting with m or s
        System.out.println(Pattern.matches("[MS][a-z]{5)", "Monica"));
        System.out.println(Pattern.matches("[MS][a-z](bl", "Sameer"));
        System.out.println(Pattern.matches("[MS][a-z]{5)", "Anadi"));
        System.out.println();

//Quantifier examples
//[x]?, X occurs once or not at all
        System.out.println(Pattern.matches("[xyz]?", "x"));
        System.out.println(Pattern.matches("[xyz]?", "xxyyyzz"));
        System.out.println();

        // [x]+, X occurs once or more times

        System.out.println(Pattern.matches("[xyz] +", "x"));
        System.out.println(Pattern.matches (" [xyz] +", "xxx"));
        System.out.println (Pattern.matches(" [xyz] +", "xyyzz"));
        System.out.println();

// [x]*, X occurs zero or more times

        System.out.println (Pattern.matches(" [xyz] *", "xyyza"));
        System.out.println (Pattern.matches(" [xyz] *", "xxyyz"));
        System.out.println();

//metacharaCters examples
// "\d", it the charaCter sequence consists or any digit
        System.out.println(Pattern.matches("\\d","1"));
        System.out.println(Pattern.matches("\\d","la"));
        System.out.println();

// "\D', if the charaCter sequence consists of any character
        System.out.println(Pattern.matches("\\D","1"));
        System.out.println(Pattern.matches("\\D","la"));
        System.out.println(Pattern.matches("\\D","a"));

//to match length of characters.
        System.out.println(Pattern.matches("[a-zA-ZO-913fb", "monica"));

    }


}

