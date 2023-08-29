package practice.algorithms;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
NASA needs to have the unique coordinates of UFC sightings, coordinates will consist in two values which can be decimal
Show a list of all the unique values of all the UFOs.

you will recieve a list of coordinates as input. example {2.3,4.5,3.5}
 */
public class UfoCoordiantes {

    public static Set<Coordinates> showUniqueUfoCoordinates(ArrayList<Coordinates> coordinatesList){
       Set<Coordinates> uniqueCoordinates = new HashSet<Coordinates>();
        if (coordinatesList.size() !=0){
            for (int i=0; i < coordinatesList.size(); i++){
                uniqueCoordinates.add(coordinatesList.get(i));
            }
        }

        return uniqueCoordinates;
    }

    public static void main(String[] args) {
        ArrayList<Coordinates> coordinatesList = new ArrayList<Coordinates>();
        Coordinates coordinates = new Coordinates(22,3);
        Coordinates coordinates2 = new Coordinates(22,3);
        Coordinates coordinates5 = new Coordinates(11,3);
        Coordinates coordinates3 = new Coordinates(11,3);
        Coordinates coordinates4 = new Coordinates(25,8);

        coordinatesList.add(coordinates);
        coordinatesList.add(coordinates2);
        coordinatesList.add(coordinates3);
        coordinatesList.add(coordinates4);
        coordinatesList.add(coordinates5);
        System.out.println(showUniqueUfoCoordinates(coordinatesList));

    }
}
