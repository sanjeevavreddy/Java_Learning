import java.util.*;
// Import the ArrayList class and the Iterator class
import java.util.Iterator;

public class Iterators {




        public static void main(String[] args) {

            // Make a collection
            List<String> cars = new ArrayList<>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");

            // Get the iterator
//            Iterator it = cars.iterator();

            for (String a:
                 cars) {
                System.out.println(a);
            }
            // Print the first item

            System.out.println(System.getProperty("user.dir"));

        }

}
