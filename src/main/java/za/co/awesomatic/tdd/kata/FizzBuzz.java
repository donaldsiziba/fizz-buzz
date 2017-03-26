package za.co.awesomatic.tdd.kata;

/**
 * Created by donald on 2016/04/15.
 */
public class FizzBuzz {

    public String getResult(int number) {
        if(number <= 0) throw new IllegalArgumentException("The number should be a natural number greater than zero i.e. a whole, non-negative number");
        return number % 15 == 0 ? "fizzbuzz" : number % 3 == 0 ? "fizz" : number % 5 == 0 ? "buzz" : Integer.toString(number);
    }
}
