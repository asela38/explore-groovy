Developer d = new Developer()

d.first = "Test"
d.setLast("Dan")

d.languages << "Groovy" << "Java"
println(d)


Tweet t = new Tweet("a", "simple");

t.likes = 10

t.comments << "Great" << "Keep the good word"

println(t)


String s = null

if (s)
    print s
else
    print "False S"


for ( num in [1, 2, 3, 4])
    println num


[1, 2, 3, 4].each { print it }