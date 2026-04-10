
import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {
    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        public String toString() {
            return type + " - Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        List<PassengerBogie> bogies = Arrays.asList(
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC Chair", 56),
                new PassengerBogie("First Class", 24),
                new PassengerBogie("General", 90),
                new PassengerBogie("Luxury", 60)
        );

        System.out.println("========================================");
        System.out.println("UC8 - Filter Passenger Bogies");
        System.out.println("========================================\n");

        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        List<PassengerBogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filtered.forEach(System.out::println);

        System.out.println("\nUC8 processing completed...");
    }
}

