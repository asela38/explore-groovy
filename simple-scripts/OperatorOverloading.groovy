def a = 1
def b = 3

println 1 + 2
println a.plus(b)

def s1="Hello"
def s2=", World!"

println s1 + s2
println s1.plus(s2)


class Account {
   BigDecimal balance
   
   Account plus(Account other) {
     return new Account(balance: this.balance + other.balance)
   }
   
   String toString() {
     "Account Balance : $balance"
   }
}

Account saving = new Account(balance:100.00)
Account checking = new Account(balance:50.00)


println saving + checking