class PrintCategoryTest extends GroovyTestCase {

    def void testMap() {

        def map = [a: 1, b: 2]
        def map2 = [1: 1212, 2: 223]

        println map['a']

        println map2[1]

        println map2[1]

        map.compu


    }

    def fib(int n) {
        { map ->
            println "**** $n = " + map[n]
            if(map[n])
                return map[n]
            else {
                map[n] = fib(n - 1)(map) + fib(n - 2)(map)
                return map[n]
            }
        }
    }

    def void testFib() {

        def fibanacci = fib(25)([(1): 1, (2): 1]);

        println fibanacci

        //(4..10).collect({ fibanacci it }).each { println it }
    }
}