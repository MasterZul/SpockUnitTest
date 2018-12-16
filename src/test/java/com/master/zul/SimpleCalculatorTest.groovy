package com.master.zul

import spock.lang.FailsWith
import spock.lang.Specification
import spock.lang.Unroll

class SimpleCalculatorTest extends Specification {


    def "Calculate given,expect"() {
        given:
        def calc = new SimpleCalculator()
        calc.rate = 2

        expect:
        5 == calc.calculate(5,2)
    }

    def "Showing Off given,expect,where"(){
        given:
        def calc = new SimpleCalculator()
        calc.rate = 2

        expect:
        result == calc.calculate(amt,multi)

        where:
        result = 5
        amt = 5
        multi = 2
    }

@Unroll("int: #result amt: #amt multi: #multi")
    def"Show Of expect, where"(){
        def calc = new SimpleCalculator()
        calc.rate = 2;

       expect:
       result == calc.calculate(amt, multi)

       where:
       result << [5, 10]
       amt << [5,5]
       multi << [2,4]

    }

    def"show off data"(){
        given:
        def calc = new SimpleCalculator()
        calc.rate = 2

        expect:
        result == calc.calculate(amt,multi)

        where:
        result | amt | multi
        5      | 5   | 2         //get 5 back
        10     | 5   | 4         //get 10 back
    }

    def value(){
        10 * 10
    }

    @FailsWith(ArithmeticException)
    @Unroll("int: #result")
    def "failure IllegalArgumentException"(){

        given:
        def calc = new SimpleCalculator()
        calc.rate = 2

        expect:

        result == calc.calculateFloat(100,-2)

        where:
        result = 5
        }

    def "Using Array List and old spock class method"(){
        def list = [1,2,3]

        when:
        list << 4

        then:
        list.size() == 4
        old(list.size()) == 3
    }

    def "Using old spock class method to find old key"(){
        def map = [:]
        map.example = "test"
        map.example2 = "test2"

        when:
        map.example = "new"
        map.example2 = "new2"

        then:
        map.example == "new"
        map.example2 == "new2"
        old(map.example) == "test"
        map.example != old(map.example)
    }
}
