import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

    public class TrainConsistManagementAppTest {

        static class PassengerBogie {
            String type;
            int capacity;

            PassengerBogie(String type, int capacity) {
                this.type = type;
                this.capacity = capacity;
            }
        }

        List<PassengerBogie> filterBogies(List<PassengerBogie> bogies) {
            return bogies.stream()
                    .filter(b -> b.capacity > 60)
                    .collect(Collectors.toList());
        }

        @Test
        void testFilter_MultipleMatchingBogies() {
            List<PassengerBogie> bogies = Arrays.asList(
                    new PassengerBogie("Sleeper", 72),
                    new PassengerBogie("General", 90),
                    new PassengerBogie("AC Chair", 56)
            );

            List<PassengerBogie> result = filterBogies(bogies);

            assertEquals(2, result.size());
        }

        @Test
        void testFilter_NoMatchingBogies() {
            List<PassengerBogie> bogies = Arrays.asList(
                    new PassengerBogie("AC Chair", 50),
                    new PassengerBogie("First Class", 40)
            );

            List<PassengerBogie> result = filterBogies(bogies);

            assertTrue(result.isEmpty());
        }

        @Test
        void testFilter_OriginalListUnchanged() {
            List<PassengerBogie> bogies = new ArrayList<>(Arrays.asList(
                    new PassengerBogie("Sleeper", 72),
                    new PassengerBogie("AC Chair", 56)
            ));

            filterBogies(bogies);

            assertEquals(2, bogies.size());
        }

        @Test
        void testFilter_AllMatchingBogies() {
            List<PassengerBogie> bogies = Arrays.asList(
                    new PassengerBogie("Sleeper", 80),
                    new PassengerBogie("General", 90)
            );

            List<PassengerBogie> result = filterBogies(bogies);

            assertEquals(2, result.size());
        }

        @Test
        void testFilter_SingleElement() {
            List<PassengerBogie> bogies = Arrays.asList(
                    new PassengerBogie("Sleeper", 72)
            );

            List<PassengerBogie> result = filterBogies(bogies);

            assertEquals(1, result.size());
        }
    }



