package za.co.awesomatic.tdd.kata

import spock.lang.Specification


/**
 * Created by donald on 2016/04/15.
 */
class FizzBuzzTestCase extends Specification {
    FizzBuzz fizzBuzz

    def setup() {
        fizzBuzz = new FizzBuzz()
    }

    def "return fizz if the number is divisible by 3"() {
        expect: "3 divided by 3 to return fizz"
            fizzBuzz.getResult(3) == "fizz"

        and: "6 divided by 6 to return fizz"
            fizzBuzz.getResult(6) == "fizz"
    }

    def "return buzz if the number is divisible by 5"() {
        expect: "5 divided by 5 to return buzz"
            fizzBuzz.getResult(5) == "buzz"

        and: "10 divided by 5 to return buzz"
            fizzBuzz.getResult(10) == "buzz"
    }

    def "return fizzbuzz if the number is divisible by 15"() {
        expect: "15 divided by 15 to return fizzbuzz"
            fizzBuzz.getResult(15) == "fizzbuzz"

        and: "30 divided by 15 to return fizzbuzz"
            fizzBuzz.getResult(30)
    }

    def "return the same number if no other requirement is fulfilled"() {
        expect: "8 divided by either 3, 5 or 15 to return 8"
            fizzBuzz.getResult(8) == "8"

        and: "17 divided by either 3, 5 or 15 should return 17"
            fizzBuzz.getResult(17) == "17"
    }

    def "error condition when 0 is passed in as a parameter"() {
        when: "0 is passed in as the parameter"
            fizzBuzz.getResult(0)

        then: "an exception should be thrown"
            thrown(IllegalArgumentException)
    }

    def "error condition when a negative number is passed in as a parameter"() {
        when: "a negative number is passed in as the parameter"
            fizzBuzz.getResult(-15)

        then: "an exception should be thrown"
            thrown(IllegalArgumentException)
    }
}