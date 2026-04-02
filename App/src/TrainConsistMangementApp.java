import java.util.*;

public class TrainConsistMangementApp {


        static class Bogie {
            String name;
            int capacity;

            public Bogie(String name, int capacity) {
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

        public static void main(String[] args) {
            List<Bogie> bogieList = new ArrayList<>();

            bogieList.add(new Bogie("Sleeper", 72));
            bogieList.add(new Bogie("AC Chair", 56));
            bogieList.add(new Bogie("First Class", 24));

            bogieList.sort(Comparator.comparingInt(Bogie::getCapacity));

            for (Bogie b : bogieList) {
                b.display();
            }
        }
    }

