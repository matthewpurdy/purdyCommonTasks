package somepackage



public class SomeClass
{
   int someInt       = 0
   double someDouble = 0.0
   String someString = ""
   
   SomeClass()
   {
      this.init(0, 0.0, "")
      
   }//end default constructor
   
   SomeClass(int someInt, double someDouble, String someString)
   {
      this.init(someInt, someDouble, someString)
      
   }//end constructor
   
   private void init(int someInt, double someDouble, String someString)
   {
      this.someInt    = someInt
      this.someDouble = someDouble
      this.someString = someString
      
   }//end private proceedure init
   
   @Override
   String toString()
   {
      "${this.someInt}, ${this.someDouble}, ${this.someString}"
      
   }//end method toString
   
}//end class SomeClass
