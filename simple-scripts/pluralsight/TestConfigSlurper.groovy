
new ConfigSlurper().parse(new File("test.properties").toURL()).with {
    println name
}