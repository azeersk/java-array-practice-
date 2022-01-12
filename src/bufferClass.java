public class bufferClass {
    public static void main(String[] args){

        StringBuffer Sb = new StringBuffer();
        Sb.append("Java ");
        Sb.append(" Python");
        Sb.append(" C++");
        Sb.append(" Ruby");
        Sb.append(" JavaScript ");
        Sb.append(123978);

        System.out.println("String Buffer: "+ Sb);
        System.out.println("String Buffer length: "+ Sb.length());

        Sb.reverse();
        System.out.println("String Buffer reverse: "+ Sb);
        System.out.println("String Buffer SubString: "+ Sb.substring(2));
        System.out.println("String Buffer Index: "+ Sb.indexOf("Ruby"));
        System.out.println("String Buffer of Delete: "+ Sb.delete(1,3));
        System.out.println("String Buffer Clear all: "+ Sb.delete(0,Sb.length()));
        System.out.println("String Buffer Empty check: "+ Sb.isEmpty());

        Sb.replace(0,1,"Name");
        System.out.println("String Buffer final: "+ Sb);
        System.out.println("String: "+ Sb.reverse());

        String language = "Java";
        switch (language){
            case "CSS":
                System.out.println(language+ " is famous for enterprise applications.");
                break;

            case "HTML":
                System.out.println(language+ " is famous for enterprise applications.");
                break;

            case "Java":
                System.out.println(language+ " is famous for enterprise applications.");
                break;

            case "JavaScript":
                System.out.println(language+ " is famous for enterprise applications.");
                break;

            case "python":
                System.out.println(language+ " is famous for enterprise applications.");
                break;

            default:
                System.out.println(language+ " is not much famous for enterprise applications.");
                break;
        }
    }
}
