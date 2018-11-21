

def c = { }

println c.class.name
println c instanceof Closure

def sayHello = { name ->
    println "Hello $name"
}

sayHello('Dan')

List nums = ((Range)(1..10)).step(1)

nums.each {
    println it
}

// Closure are objects & last parameters

def timesTen(num , closure) {
    closure(num*10)
}

timesTen(10, {println it})
timesTen(2) { println it }


10.times {
    println it
}

import java.util.Random

Random rand = new Random()

3.times {
    println rand.nextInt()
}


// no parameters

def noparams = { ->
    println "no params"
}

noparams()


def sayHello2 = { first, last -> 
      println "hello, $first, $last"
}

sayHello2("Dan", "one");


def greeting = { name, greeting = "Howdy" -> 
      println "$greeting, $name"
}

greeting("Dan", "Hello");

greeting("Dan");

// var args


def concat = { String...args ->
    args.join(',')
}

println concat("a", "b", "c")


def someMethod( c) {
    println ".."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

someMethod(greeting)

someMethod(concat)

