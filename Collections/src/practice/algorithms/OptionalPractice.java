package practice.algorithms;

import java.util.Optional;

public class OptionalPractice {


    public static Optional<PojoCat> createByName(String name){
        PojoCat cat = new PojoCat(name, 3);

        return Optional.ofNullable(cat);
    }


    public static void main(String[] args) {
        Optional<PojoCat> optionalCat = createByName("Lia");// passing the object to the optional class.

        int catAge = optionalCat.map(PojoCat::getAge).orElse(0);// will try to get in the map method the age of the cat or else.. it will display 0

        System.out.println(catAge);
    }
}
