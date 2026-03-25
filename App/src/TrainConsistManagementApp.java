import java.util.LinkedHashSet;



public class TrainConsistManagementApp {


        public static void main(String[] args) {


            System.out.println("====================================");
            System.out.println("=== UC5 - Preserve Insertion Order of Bogies ===");
            System.out.println("====================================");


            LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

            trainFormation.add("Engine");
            trainFormation.add("Sleeper");
            trainFormation.add("Cargo");
            trainFormation.add("Guard");


            trainFormation.add("Sleeper");


            System.out.println();
            System.out.println("Train Formation After Insertions:");
            System.out.println(trainFormation);


            System.out.println();
            System.out.println("UC5 insertion order preserved successfully...");
        }

    }


