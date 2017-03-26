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
        expect: "fizz when 3 is passed in as argument"
            fizzBuzz.getResult(3) == "fizz"

        and: " expect fizz when 6 is passed in as an argument"
            fizzBuzz.getResult(6) == "fizz"
    }

    def "return buzz if the number is divisible by 5"() {
        when: "a new FizzBuzz instance is created"
            FizzBuzz fizzBuzz = new FizzBuzz()

        then: "5 divided by 5 should return buzz"
            fizzBuzz.getResult(5) == "buzz"

        and: "10 divided by 5 should return buzz"
            fizzBuzz.getResult(10) == "buzz"
    }

    def "return fizzbuzz if the number is divisible by 15"() {
        when: "a new FizzBuzz instance is created"
            FizzBuzz fizzBuzz = new FizzBuzz()

        then: "15 divided by 15 should return fizzbuzz"
            fizzBuzz.getResult(15) == "fizzbuzz"

        and: "30 divided by 15 should return fizzbuzz"
            fizzBuzz.getResult(30)
    }

    def "return the same number if no other requirement is fulfilled"() {
        when: "a new FizzBuzz instance is created"
            FizzBuzz fizzBuzz = new FizzBuzz()

        then: "8 divided by either 3, 5 or 15 should return 8"
            fizzBuzz.getResult(8) == "8"

        and: "17 divided by either 3, 5 or 15 should return 17"
            fizzBuzz.getResult(17) == "17"

        and: "22 divided by either 3, 5 or 15 should return 22"
            fizzBuzz.getResult(22) == "22"
    }

    def "error condition when 0 is passed in as a parameter"() {
        when: "a new FizzBuzz instance is created"
            FizzBuzz fizzBuzz = new FizzBuzz()

        and: "a 0 is passed in as the parameter"
            fizzBuzz.getResult(0)

        then: "an exception should be thrown"
            thrown(IllegalArgumentException)
    }

    def "error condition when a negative number is passed in as a parameter"() {
        when: "a new FizzBuzz instance is created"
            FizzBuzz fizzBuzz = new FizzBuzz()

        and: "a negative is passed in as the parameter"
            fizzBuzz.getResult(-15)

        then: "an exception should be thrown"
            thrown(IllegalArgumentException)
    }
}