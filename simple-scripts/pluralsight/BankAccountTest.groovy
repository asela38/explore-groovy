import groovy.mock.interceptor.*
import pluralsight.InterestService

class BankAccountTest extends GroovyTestCase{

    def void testDepositMoney() {
        def account = new BankAccount(25)
        account.deposit(5)
        assert 30 == account.balance
    }


    def void testAccure() {
        def account = new BankAccount(10)

        def stub = new StubFor(InterestService)
        stub.demand.getInterestRate() {
            return 0.1
        }
        stub.use {
            account.accureInterest()
            assert 11 == account.balance

        }
    }
}
