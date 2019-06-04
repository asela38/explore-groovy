// https://mvnrepository.com/artifact/org.codehaus.groovy.modules.http-builder/http-builder
@Grapes(
        @Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')
)


import groovyx.net.http.RESTClient

def google = new RESTClient('https://jsonplaceholder.typicode.com/todos/1')
def response = google.get([:])

println response.status


response.data.with {
    print userId
    print title

}
