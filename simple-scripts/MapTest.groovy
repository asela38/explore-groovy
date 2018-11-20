// http://docs.groovy-lang.org/latest/html/groovy-jdk/java/util/Map.html
def map = [:]
println map
println map.getClass().getName()

def person = [ first:"Dan", last:"Vegas", email:"a@b.com"]
println person
println person.first

person.twitter= "@test"

println person

def twitter = [name: "@testone", 'email address': "a@c.com"]

println twitter

println person.size()
println person.sort()

for(entry in person) 
    println entry
    
  