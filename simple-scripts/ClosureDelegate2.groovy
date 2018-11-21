
def writer = {
   append 'Dan'
   append ' lives in cleveland'
}

def append(String s){

   println "append() called with argment $s"

}

StringBuffer sb = new StringBuffer()
// Defult is this first
// this -> owner -> delegate
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb

println writer()

