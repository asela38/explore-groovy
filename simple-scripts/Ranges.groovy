// http://docs.groovy-lang.org/latest/html/gapi/groovy/lang/Range.html

Range r = 1..10
println r.from
println r.to


Range r2 = 1..<10
println r2.from
println r2.to

assert (1..10).contains(5)

assert (1..10).contains(-1) == false


Date today = new Date();
Date onWeekFromToday = today + 7

println today + 1
println today + 2

Range week = (today..onWeekFromToday)

println week
println week.step(1)
Range alphabet = 'a'..'z'
println  alphabet.step(1)