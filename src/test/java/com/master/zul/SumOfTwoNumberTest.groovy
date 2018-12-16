package com.master.zul

import spock.lang.Specification

class SumOfTwoNumberTest extends Specification {



    def "AddNumber"() {

        given:
//        def obj = new SumOfTwoNumber()
//
//        when:
//        def sum = obj.addNumber(5,6)
//
//        then:
//        sum == 11

        expect:
        Math.max(a,b) == 5

        where:
        a << [5,3]
        b << [1,5]
        c << [5,2]
    }

    def "interest rats calcs with Simple Calculator"(){

    }

}
