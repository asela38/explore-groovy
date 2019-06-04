import pluralsight.InterestService

class BankAccount {

    def balance;

    BankAccount(openingBalance) {
        balance = openingBalance
    }

    def void deposit(amount) {
        balance += amount
    }

    def accureInterest() {
        def service = new InterestService();
        def rate =  service.getInterestRate();

        deposit(balance * rate)
    }
}
