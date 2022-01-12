import java.util.*;

public class javaCollections {
    public static void main(String[] args){
        // to Sort a Map By Values
        Map<Integer, String> SMap = new HashMap<>();
        SMap.put(2,"Two");
        SMap.put(1,"One");
        SMap.put(4,"Four");
        SMap.put(3,"Three");
        SMap.put(6,"Six");
        SMap.put(5,"Five");

        ArrayList<String> values = new ArrayList<>();
        values.addAll(SMap.values());
        values.stream().sorted();
        System.out.print("Sorted map values: ");
        for(String element : values){
            System.out.println(element);
        }

        LinkedList<String> listLinked = new LinkedList<>();

        listLinked.add("java");
        listLinked.add("python");
        listLinked.add("C++");
        listLinked.add("C");
        listLinked.add("Ruby");
        listLinked.add("Sql");

        System.out.println("linked list is: "+ listLinked);
        System.out.print("linked list: ");
        for(String element: listLinked){
            System.out.print(element+" ");
        }
    }
}