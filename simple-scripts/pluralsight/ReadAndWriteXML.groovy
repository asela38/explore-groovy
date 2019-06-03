import groovy.xml.MarkupBuilder
import groovy.xml.StreamingMarkupBuilder

def pom = new XmlSlurper().parse(new File("./pom.xml"))

new StreamingMarkupBuilder().bind {
    dependents {
        pom.dependencies.dependency.each { d ->
            dependent(version: d.version.toString()) {
                group(d.groupId.toString())
                artifact(d.artifactId.toString())
            }
            println "G:${d.groupId}, M:${d.artifactId}, V: ${d.version}"
        }
    }
}.tap { new File("./dependents.xml").write(it.toString()) }