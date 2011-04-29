package somepackage

import groovy.util.GroovyTestCase

public class SomeClassTest extends GroovyTestCase
{
   void testDefaultConstructor()
   {
      SomeClass someClass = new SomeClass()
      assertEquals(0, someClass.someInt)
      assertEquals(0.0, someClass.someDouble)
      assertEquals("", someClass.someString)
      
   }//end testDefaultConstructor
   
   void testConstructor()
   {
      SomeClass someClass = new SomeClass(1, 2.0, "three")
      assertEquals(1, someClass.someInt)
      assertEquals(2.0, someClass.someDouble)
      assertEquals("three", someClass.someString)
      
   }//end testConstructor
   
   void testInit()
   {
      SomeClass someClass = new SomeClass()
      someClass.init 1, 2.0, "three"
      assertEquals(1, someClass.someInt)
      assertEquals(2.0, someClass.someDouble)
      assertEquals("three", someClass.someString)
      
   }//end testInit
   
   void testToString()
   {
      SomeClass someClass = new SomeClass(1, 2.0, "three")
      String someClassString = someClass.toString()
      assertEquals("1, 2.0, three", someClassString)
      
   }//end testToString
   
}//end class SomeClassTest
