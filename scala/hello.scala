object HelloWorld {
   /* This is my first java program.  
    * This will print 'Hello World' as the output
    */
   def main(args: Array[String]) {
      printHello("Arvin")
   }
   
   def printHello(name: String) {
      println("Hello, " + name)
   }
}
