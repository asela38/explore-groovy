package pluralsight

class PrintCategory {

    def static void print(s) {
        println s
    }
}

class PrintCategoryTest extends GroovyTestCase {

    def void testPrint() {

        use(PrintCategory) {

            1.print()

            (1..10).print()
        }
    }
}
