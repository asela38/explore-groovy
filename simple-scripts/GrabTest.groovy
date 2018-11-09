
@Grapes(
@Grab(group='org.apache.commons', module='commons-lang3', version='3.8.1')
)


import org.apache.commons.lang3.time.StopWatch;

StopWatch sw = StopWatch.createStarted();
Thread.sleep(102)
println sw
