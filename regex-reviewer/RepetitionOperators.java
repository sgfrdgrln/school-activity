import java.util.*;
 
// pre-final

public class RepetitionOperators {
    
    public static void main(String[] args) {
        
        // Zero or More Times (*):

        // Matches the preceding element zero or more times.

        String str1 = "ah";
        String str2 = "aah";
        boolean matches1 = str1.matches("a*h"); // true (zero 'a's followed by 'h')
        boolean matches2 = str2.matches("a*h"); // true (two 'a's followed by 'h')

        // One or More Times (+):

        // Matches the preceding element one or more times.

        String str3 = "ah";
        String str4 = "aah";
        boolean matches3 = str3.matches("a+h"); // false (zero 'a's followed by 'h')
        boolean matches4 = str4.matches("a+h"); // true (one or more 'a's followed by 'h')

        // Zero or One Time (?):

        // Matches the preceding element zero or one time.

        String str5 = "ah";
        String str6 = "aah";
        boolean matches5 = str5.matches("a?h"); // true (zero 'a's followed by 'h')
        boolean matches6 = str6.matches("a?h"); // false (two 'a's followed by 'h')


        // Exactly n Times ({n}):

        // Matches the preceding element exactly n times.

        String str7 = "aaaaabbb";
        boolean matches7 = str7.matches("a{5}b{3}"); // true (exactly 5 'a's followed by exactly 3 'b's)

        // At Least n Times ({n,}):

        // Matches the preceding element at least n times.

        String str8 = "aaaaabbb";
        boolean matches8 = str8.matches("a{5,}b{3,}"); // true (at least 5 'a's followed by at least 3 'b's)


        // Between n and m Times ({n,m}):

        // Matches the preceding element between n and m times.

        String str9 = "aaabbb";
        String str10 = "aaaaabbb";
        String str11 = "aaaaaaaaaabbb";
        boolean matches9 = str9.matches("a{3,5}b{3,5}"); // true (between 3 and 5 'a's followed by between 3 and 5 'b's)
        boolean matches10 = str10.matches("a{3,5}b{3,5}"); // true (between 3 and 5 'a's followed by between 3 and 5 'b's)
        boolean matches11 = str11.matches("a{3,5}b{3,5}"); // false (more than 5 'a's)


    }

}
