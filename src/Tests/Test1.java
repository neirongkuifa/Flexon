package Tests;


import java.io.Console;

public class Test1 {
    public static void main(String[] args){
        System.out.println("Test1");

        String greeting="Exercise";
        String s=greeting.substring(0,5);
        boolean result="Exercise".equalsIgnoreCase("hello");
        System.out.println(greeting.length()==0);
        String x="\uD834\uDF15";
        int[] codePoints=x.codePoints().toArray();
        System.out.println(x.codePointCount(0,2));
        System.out.println(codePoints[0]);
        System.out.println(x);
        System.out.println(x.codePointAt(0));
        System.out.println(Character.isSupplementaryCodePoint(x.codePointAt(1)));

        Console cons=System.console();
        String username=cons.readLine("Username: ");
        char [] passwd=cons.readPassword("Password: ");
        System.out.println(username);
    }
}
