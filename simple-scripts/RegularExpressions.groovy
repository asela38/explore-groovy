// Java

import java.util.regex.*;

Pattern pattern = Pattern.compile("a\\\\b")

println pattern
println pattern.class


// Groovy

String slashy = /a\b/
println slashy

def pattern1 = ~/a\b/
println pattern1.class

def text = "This is the simple text for checking a and "
def finder = text =~ pattern1
def matcher = text ==~ pattern1
println finder
println finder.size()

println matcher

println text.replaceFirst(~/\bis\b/, "xx")