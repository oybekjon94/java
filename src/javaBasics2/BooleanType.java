package javaBasics2;

import java.util.Random;

public class BooleanType {
    public static void main(String[] args){
        String name = "";
        Random r = new Random();
        boolean male = r.nextBoolean();

        if (male == true)
        {
            name = "Robert";
        }
        if (male == false){
            name = "Victoria";
        }

        System.out.format("we will use name %s%n", name);

        System.out.println(9 > 8);
    }
}
