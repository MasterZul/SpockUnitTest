package com.master.zul

import spock.lang.Requires
import spock.lang.Specification

class AccountTest extends Specification {

    def "working with account"(){
        def account = new Account ("123",50.0)
        def account1 = new Account ("321")

        def accountlist = [new Account("1"), new Account("2")]
        def makes = accountlist*.accountNo //masukkan semua nilai dari accountlist.accountNo ke makes

        expect:
        with(account){
            accountNo == "123"
            balance == 50.0
            account.type == "checking"
        }

        with(account1){
            accountNo == "321"
        }

        with(makes){
            makes == ["1","2"]
        }
    }


    @Requires ({ jvm.java8 })
    def "java 8 feature" (){
        def friends = ["Zul", "Zul"]
        def firstString = friends.stream().findFirst().get()
        def friends2 = ["Brian", "Brian"]
        def secondString = friends2.stream().findFirst().get()

        expect:
        assert (firstString == "Zul" && secondString == "Brian" ) == true
    }
}
