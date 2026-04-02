import java.util.*;
import java.util.stream.*;

public class TrainConsistMangementApp {


        String name;
        int capacity;

        public TrainConsistManagementApp(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        public void display() {
            System.out.println(name + " - Capacity: " + capacity);
        }
    }

    public class TrainConsistManagementApp {
        public static void main(String[] args) {
            List<Bogie> bogieList = new ArrayList<>();

            bogieList.add(new Bogie("Sleeper", 72));
            bogieList.add(new Bogie("AC Chair", 56));
            bogieList.add(new Bogie("First Class", 24));
            bogieList.add(new Bogie("Luxury", 80));

            List<Bogie> filteredList = bogieList
                    .stream()
                    .filter(b -> b.getCapacity() > 60)
                    .collect(Collectors.toList());

            System.out.println("Filtered Bogies (Capacity > 60):");
            for (Bogie b : filteredList) {
                b.display();
            }
        }
    }