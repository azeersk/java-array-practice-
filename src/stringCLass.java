import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class stringCLass {
    public static void main(String[] args){
        String date = "May 20 2020";

        DateTimeFormatter farm = DateTimeFormatter.ofPattern("MMMM dd yyyy", Locale.CANADA);
        LocalDate day = LocalDate.parse(date, farm);
        String string = "2021-02-12";
        LocalDate dayOf = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
        System.out.println("Date time formatter: "+ day);
        System.out.println("direct method: "+dayOf);
        char character = '2';
        System.out.println("isDigit: "+Character.isDigit(character));

        // Check if two strings are anagram
        String name1 = "Race";
        String name2 = "Cara";

        name1 = name1.toLowerCase();
        name2 = name2.toLowerCase();

        // check the length is same
        if(name1.length() == name2.length()){

            // changing to lower case
            char[] NameC1 = name1.toCharArray();
            char[] NameC2 = name2.toCharArray();

            Arrays.sort(NameC1);
            Arrays.sort(NameC2);
            boolean result = Arrays.equals(NameC1, NameC2);

            if(result){
                System.out.println(name1 +", "+ name2 + " Strings are anagram");
            }
            else {
                System.out.println(name1 +", "+ name2 + " Strings are not anagram");
            }
        }
        else {
            System.out.println(name1 +", "+ name2 + " String are not anagram");
        }

        String aa = "Something that i am not think!";
        String result = "";
        for(int i=0; i<aa.length(); i++){
            char c = aa.charAt((aa.length()-1)-i);
            result = result + c;
        }
        System.out.println(result);

    }
}
