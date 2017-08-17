package za.co.awesomatic.tdd.kata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void return_fizz_if_the_number_is_divisible_by_3() {
        assertEquals(fizzBuzz.getResult(3), "fizz");
        assertEquals(fizzBuzz.getResult(6), "fizz");
    }

    @Test
    public void return_buzz_if_the_number_is_divisible_by_5() throws Exception {
        assertEquals(fizzBuzz.getResult(5), "buzz");
        assertEquals(fizzBuzz.getResult(10), "buzz");
    }

    @Test
    public void return_fizzbuzz_if_the_number_is_divisible_by_15() throws Exception {
        assertEquals(fizzBuzz.getResult(15), "fizzbuzz");
        assertEquals(fizzBuzz.getResult(30), "fizzbuzz");
    }

    @Test
    public void return_the_same_number_if_no_other_requirement_is_fulfilled() throws Exception {
        assertEquals(fizzBuzz.getResult(8), "8");
        assertEquals(fizzBuzz.getResult(17), "17");
    }

    @Test(expected = IllegalArgumentException.class)
    public void error_condition_when_0_is_passed_an_argument() throws Exception {
        fizzBuzz.getResult(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void error_condition_when_a_negative_number_is_passed_as_an_argument() throws Exception {
        fizzBuzz.getResult(-15);
    }
}
