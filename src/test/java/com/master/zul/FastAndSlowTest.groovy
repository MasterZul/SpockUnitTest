package com.master.zul

import spock.lang.Specification

class FastAndSlowTest extends Specification {

    def"pushing an element on the stack"(){

        setup:
        def stack = new Stack();
        def elem = "push me"

        when:
        stack.pop()

        then:
        EmptyStackException e = thrown()
        e.cause == null
    }




}
