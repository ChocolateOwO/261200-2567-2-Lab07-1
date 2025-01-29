import java.awt.*;
import java.util.*;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!" + args[2] + " " + args[3]);


        List<String> alist = new ArrayList<>();
        for (int i = 0; i < args.length; i++)
            alist.add(args[i]);
        System.out.println(alist);
        Collections.shuffle(alist, new Random());
        System.out.println(alist);


        Set<String> hSet = new HashSet<>();
        hSet.add("OOP");
        hSet.add("GG");
        hSet.add("EZ");
        hSet.add("F");
        hSet.add("not");
        hSet.add("drop");
        hSet.add("GG");
        hSet.add("GG");
        hSet.add("GG");
        hSet.remove("GG");

        System.out.println(hSet);


        SortedSet<String> sSet = new TreeSet<>();
        sSet.add("OOP");
        sSet.add("GG");
        sSet.add("EZ");
        sSet.add("F");
        sSet.add("not");
        sSet.add("drop");
        sSet.add("GG");
        sSet.add("ZZZ");
        sSet.add("123");
        System.out.println(sSet);

        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println("Stack: " + stack);
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        Map<String, Color> favoriteColors = new HashMap<String, Color>();
        favoriteColors.put("Juliet", Color.BLUE);
        favoriteColors.put("Romeo", Color.GREEN);
        favoriteColors.put("Adam", Color.RED);
        favoriteColors.put("Eve", Color.BLUE);
        favoriteColors.put("Robert", Color.BLACK);
        favoriteColors.put("Mark", Color.WHITE);
        favoriteColors.put("Pedro", Color.YELLOW);
        favoriteColors.put("Cloe", Color.BLUE);

        // Print all keys and values in the map

        Set<String> keySet = favoriteColors.keySet();
        for (String key : keySet){

            Color value = favoriteColors.get(key);
        System.out.println(key + " : " + value);
        }

        Map<String, Color> Mycolor = new TreeMap<String, Color>();
       Mycolor.put("Juliet", Color.BLUE);
       Mycolor.put("Romeo", Color.GREEN);
       Mycolor.put("Adam", Color.RED);
       Mycolor.put("Eve", Color.BLUE);
       Mycolor.put("Robert", Color.BLACK);
       Mycolor.put("Mark", Color.WHITE);
       Mycolor.put("Pedro", Color.YELLOW);
       Mycolor.put("Cloe", Color.BLUE);

        Set<String> color = Mycolor.keySet();
        for (String key : color){

            Color value = Mycolor.get(key);
            System.out.println(key + " : " + value);
        }




    }
}