import groovy.xml.MarkupBuilder

def xml = new MarkupBuilder()

// assert "a" == "aa"

def x = [1, 2, 3, 4, 5]

assert (x<<6) == [1, 2, 3, 4, 5]


