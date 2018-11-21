
class ScopeDemo {
   def outerClosure = {
      println "o1 " << this.class.name
      println "o2 " << owner.class.name
      println "o3 " << delegate.class.name

      def nextedClosure = {
         println this.class.name
         println owner.class.name
         println delegate.class.name
      }

      nextedClosure()
     
   }
}

def demo = new ScopeDemo()
demo.outerClosure()
