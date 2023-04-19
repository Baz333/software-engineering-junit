import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EventTest {

    private Event event;

    @BeforeEach
    void setup() {
        event = new Event("Science & Computing Ball", "31st March", "18:00", "School of Science and Computing", "Dinners + afters", "Tower Hotel");
    }

    @AfterEach
    void teardown() {
        event = null;
    }

    @Nested
    class Getters {

        @Test
        void getName() {
            assertEquals("Science & Computing Ball", event.getName());
        }

        @Test
        void getStartDate() {
            assertEquals("31st March", event.getStartDate());
        }

        @Test
        void getStartTime() {
            assertEquals("18:00", event.getStartTime());
        }

        @Test
        void getAssociatedClubOrDepartment() {
            assertEquals("School of Science and Computing", event.getAssociatedClubOrDepartment());
        }

        @Test
        void getDescription() {
            assertEquals("Dinners + afters", event.getDescription());
        }

        @Test
        void getPlace() {
            assertEquals("Tower Hotel", event.getPlace());
        }
    }

    @Nested
    class Setters {

        @Test
        void setName() {
            event.setName("Games Night");
            assertEquals("Games Night", event.getName());
        }

        @Test
        void setStartDate() {
            event.setStartDate("19th April");
            assertEquals("19th April", event.getStartDate());
        }

        @Test
        void setStartTime() {
            event.setStartTime("20:30");
            assertEquals("20:30", event.getStartTime());
        }

        @Test
        void setAssociatedClubOrDepartment() {
            event.setAssociatedClubOrDepartment("Grá Society");
            assertEquals("Grá Society", event.getAssociatedClubOrDepartment());
        }

        @Test
        void setDescription() {
            event.setDescription("Board games and social deduction games");
            assertEquals("Board games and social deduction games", event.getDescription());
        }

        @Test
        void setPlace() {
            event.setPlace("C35");
            assertEquals("C35", event.getPlace());
        }

    }

}