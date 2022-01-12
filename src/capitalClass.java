import java.util.Locale;

public class capitalClass {
    public static void main(String[] args){
        String name = "telangana";
        char a = name.charAt(0);
        char aa = Character.toUpperCase(a);
        String result = aa + name.substring(1);
        System.out.println(result);

//        String string = "every one wants jab.";
//        char[] c = string.toCharArray();
//        for(char element : c){
//            char first = string.charAt(0);
//            char ac = Character.toUpperCase(first);
//            String ReOf = "";
//            int i = string.indexOf(element);
//            if(element == ' '){
//                char is = string.charAt(i+1);
//                String va = String.valueOf(is).toUpperCase();
//            }

            String nameOf = "Programiz is good learning platform!";
            char[] charArray = nameOf.toCharArray();
            System.out.print("characters are: ");
            for(char elements: charArray){
                System.out.print(elements);
                System.out.print(", ");
            }

            //Differentiate String == operator and equals() method
            String first = new String("Programmer");
            String second = new String("Programmer");
            System.out.println();
            System.out.print("String double equals to: ");
            System.out.print(first==second);
            System.out.println();
            System.out.println("String equals: "+ first.equals(second) );
        }
    }
