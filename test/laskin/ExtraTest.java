package laskin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExtraTest extends AbstractParent {

        @BeforeAll
        public static void setUpClass() {
            System.out.println("Before all");

        }

        @AfterAll
        public static void tearDownClass() {
            System.out.println("After all");
        }

        @BeforeEach
        public void setUp() {
            System.out.println("Before each");
        }

        @Test
        @DisplayName("Test 1")
        public void test1() {
            System.out.println("Test 1");
        }

        @Test
        @DisplayName("Test 2")
        public void test2() {
            System.out.println("Test 2");
        }

        @Test
        @DisplayName("Test 3")
        public void test3() {
            System.out.println("Test 3");
        }

        @Test
        @DisplayName("Test 4")
        public void test4() {
            System.out.println("Test 4");
        }


        @Test
        @DisplayName("Test 5")
        public void test5() {
            System.out.println("Test 5");
        }


}
