
char c = 'c'
println c.class

String str = "Test"
println str.class

def c2='c'
def str2 = "Test"

println c2.class
println str2.class

String name = "Dan"
String msg = "Hell " + name +  "..."

println msg

String msg2 = "Hello ${name}"
println msg2


String msg3 = 'Hello ${name}'
println msg3

String msg4 = 'Hello ${1 + 2 + 3}'
println msg4

def msgM = """
This is a message
which is multiline
"""

println msgM


def folder = $/C:\groovy\dan\foo\bar/$
println folder



