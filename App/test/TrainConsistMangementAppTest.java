
import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistMangementAppTest {

        static class Bogie {
            String type;
            int capacity;

            Bogie(String type, int capacity) {
                this.type = type;
                this.capacity = capacity;
            }
        }

        Map<String, List<Bogie>> group(List<Bogie> bogies) {
            return bogies.stream()
                    .collect(Collectors.groupingBy(b -> b.type));
        }

        @Test
        void testGrouping_BogiesGroupedByType() {
            List<Bogie> bogies = Arrays.asList(
                    new Bogie("Sleeper", 72),
                    new Bogie("Sleeper", 70),
                    new Bogie("AC Chair", 56)
            );

            Map<String, List<Bogie>> result = group(bogies);

            assertTrue(result.containsKey("Sleeper"));
        }

        @Test
        void testGrouping_MultipleBogiesInSameGroup() {
            List<Bogie> bogies = Arrays.asList(
                    new Bogie("General", 90),
                    new Bogie("General", 85)
            );

            Map<String, List<Bogie>> result = group(bogies);

            assertEquals(2, result.get("General").size());
        }

        @Test
        void testGrouping_DifferentBogieTypes() {
            List<Bogie> bogies = Arrays.asList(
                    new Bogie("Sleeper", 72),
                    new Bogie("AC Chair", 56),
                    new Bogie("First Class", 24)
            );

            Map<String, List<Bogie>> result = group(bogies);

            assertEquals(3, result.size());
        }

        @Test
        void testGrouping_EmptyBogieList() {
            List<Bogie> bogies = new ArrayList<>();

            Map<String, List<Bogie>> result = group(bogies);

            assertTrue(result.isEmpty());
        }

        @Test
        void testGrouping_SingleBogieCategory() {
            List<Bogie> bogies = Arrays.asList(
                    new Bogie("Sleeper", 72),
                    new Bogie("Sleeper", 68)
            );

            Map<String, List<Bogie>> result = group(bogies);

            assertEquals(1, result.size());
        }

        @Test
        void testGrouping_MapContainsCorrectKeys() {
            List<Bogie> bogies = Arrays.asList(
                    new Bogie("Sleeper", 72),
                    new Bogie("AC Chair", 56),
                    new Bogie("First Class", 24)
            );

            Map<String, List<Bogie>> result = group(bogies);

            assertTrue(result.containsKey("Sleeper"));
            assertTrue(result.containsKey("AC Chair"));
            assertTrue(result.containsKey("First Class"));
        }

        @Test
        void testGrouping_GroupSizeValidation() {
            List<Bogie> bogies = Arrays.asList(
                    new Bogie("Sleeper", 72),
                    new Bogie("Sleeper", 70),
                    new Bogie("AC Chair", 56)
            );

            Map<String, List<Bogie>> result = group(bogies);

            assertEquals(2, result.get("Sleeper").size());
            assertEquals(1, result.get("AC Chair").size());
        }

        @Test
        void testGrouping_OriginalListUnchanged() {
            List<Bogie> bogies = new ArrayList<>(Arrays.asList(
                    new Bogie("Sleeper", 72),
                    new Bogie("AC Chair", 56)
            ));

            group(bogies);

            assertEquals(2, bogies.size());
        }
    }

