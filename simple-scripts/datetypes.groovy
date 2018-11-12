byte b =1;

b.getClass().getName()

short s = 100

s.class

float f = 1.25

f.class

1.class // Integer
1111111111111.class // Long
11111111111111111111111.class // BigInteger
1.4.class // Big Decimal


assert 2 == 2.5.toInteger()
assert 2 == 2.5 as Integer // coercion
assert 2 == (int) 2.5 //cast

assert '12.4'.isNumber()

20.times {
    print '-'
}

1.upto(10) { num -> 
    println num
}


10.downto(1) { num -> 
    println num
}

0.step(1, 0.1) { num ->
    println num
}

