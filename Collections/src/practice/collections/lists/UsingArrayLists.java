package practice.collections.lists;

import java.util.ArrayList;

public class UsingArrayLists {

    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();

        people.add("Yovani");
        people.add("Lely");
        people.add("maela");
        people.add("gordo");



        if (people.contains("Yovani")){
            System.out.println("el yovis esta presente");
        }

        if(Character.isDigit(Integer.parseInt(String.valueOf(people.get(0).toString().charAt(0))))){
            System.out.println("es digito");
        }
    }
}
