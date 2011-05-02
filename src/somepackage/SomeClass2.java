/**
 * 
 */
package somepackage;

public class SomeClass2
{
   int someInt       = 0;
   double someDouble = 0.0;
   String someString = "";
   
   SomeClass2()
   {
      this.init(0, 0.0, "");
      
   }//end default constructor
   
   public SomeClass2(int someInt, double someDouble, String someString)
   {
      this.init(someInt, someDouble, someString);
      
   }//end constructor
   
   private void init(int someInt, double someDouble, String someString)
   {
      this.someInt    = someInt;
      this.someDouble = someDouble;
      this.someString = someString;
      
   }//end private proceedure init
   
   @Override
   public String toString()
   {
      return "" + this.someInt + ", " + this.someDouble + ", " + this.someString;
      
   }//end method toString
   
}//end class SomeClass2

