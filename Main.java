import java.util.*;


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


    }
}