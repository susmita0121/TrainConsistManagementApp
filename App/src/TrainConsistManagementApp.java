import java.util.HashSet;
import java.util.Set;



public class TrainConsistManagementApp {

        public static void main(String[] args) {

            // Heading
            System.out.println("====================================");
            System.out.println("=== UC3 - Track Unique Bogie IDs ===");
            System.out.println("====================================");

            // Create HashSet for Bogie IDs
            Set<String> bogieIds = new HashSet<>();

            // Adding bogie IDs (including duplicates)
            bogieIds.add("BG104");
            bogieIds.add("BG103");
            bogieIds.add("BG102");
            bogieIds.add("BG101");
            bogieIds.add("BG101"); // duplicate
            bogieIds.add("BG102"); // duplicate

            // Display result
            System.out.println();
            System.out.println("Bogie IDs After Insertion:");
            System.out.println(bogieIds);

            // Note about duplicates
            System.out.println();
            System.out.println("Note:");
            System.out.println("Duplicates are automatically ignored by HashSet.");

            // Completion message
            System.out.println();
            System.out.println("UC3 uniqueness validation completed...");
        }
    }

