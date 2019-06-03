


System.out.println("Hello, World")


println "Hello, World!!!!"

def beatles = [ "John", "Paul", "George", "Ringo"]

beatles.each { name -> println "Hello, $name"}


// non parameter closure
def closureFirst = { println "This is closure"}

closureFirst()


(1..10).findAll({i -> i%2 == 0}).each {i -> print "$i"}

println "--"

(1..10).findAll( {it%2 == 0}).each { print "$it"}
