


def fib = {
    i -> (1..i-2).inject([0,1], {memo, x -> [memo[1], memo[0] + memo[1]]}).inject {a,b-> a+b}
}

// assert 1 == fib(1)
// assert 1 == fib(2)
assert 2 == fib(3)

assert 55 == fib(10)
