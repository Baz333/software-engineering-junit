import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private Account account;

    @BeforeEach
    void setup() {
        account = new Account(20097397, "password", false, 3, "Waterford - Cork Road", "Science and Computing", "Applied Computing");
    }

    @AfterEach
    void teardown() {
        account = null;
    }

    @Nested
    class Getters {

        @Test
        void getStudentNo() {
            assertEquals(20097397, account.getStudentNo());
        }

        @Test
        void getPassword() {
            assertEquals("password", account.getPassword());
        }

        @Test
        void isStudentUnionMember() {
            assertEquals(false, account.isStudentUnionMember());
        }

        @Test
        void getYear() {
            assertEquals(3, account.getYear());
        }
        @Test
        void getCampus() {
            assertEquals("Waterford - Cork Road", account.getCampus());
        }
        @Test
        void getSchool() {
            assertEquals("Science and Computing", account.getSchool());
        }
        @Test
        void getCourse() {
            assertEquals("Applied Computing", account.getCourse());
        }

    }

    @Nested
    class Setters {

        @Test
        void setStudentNo() {
            account.setStudentNo(20095924);
            assertEquals(20095924, account.getStudentNo());
        }

        @Test
        void setPassword() {
            account.setPassword("12345678");
            assertEquals("12345678", account.getPassword());
        }

        @Test
        void setStudentUnionMember() {
            account.setStudentUnionMember(true);
            assertTrue(account.isStudentUnionMember());
        }

        @Test
        void setYear() {
            account.setYear(6);
            assertEquals(6, account.getYear());
        }

        @Test
        void setCampus() {
            account.setCampus("Carlow");
            assertEquals("Carlow", account.getCampus());
        }

        @Test
        void setSchool() {
            account.setSchool("Humanities");
            assertEquals("Humanities", account.getSchool());
        }

        @Test
        void setCourse() {
            account.setCourse("Arts");
            assertEquals("Arts", account.getCourse());
        }

        @Test
        void studentNoTooLongDoesntUpdate() {
            account.setStudentNo(200975829);
            assertEquals(20097397, account.getStudentNo());
        }

        @Test
        void invalidStudentNoDoesntUpdate() {
            account.setStudentNo(22824563);
            assertEquals(20097397, account.getStudentNo());
        }

        @Test
        void negativeYearDoesntUpdate() {
            account.setYear(-1);
            assertEquals(3, account.getYear());
        }

        @Test
        void invalidYearDoesntUpdate() {
            account.setYear(13);
            assertEquals(3, account.getYear());
        }

        @Test
        void invalidCampusDoesntUpdate() {
            account.setCampus("Waterford");
            assertEquals("All campuses", account.getCampus());
        }

        @Test
        void incorrectSchool() {
            account.setSchool("Law");
            assertEquals("Science and Computing", account.getSchool());
        }
    }
}
