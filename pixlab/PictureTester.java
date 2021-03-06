/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.keepOnlyBlue();
      beach.explore();
  }
  
  /** Method to test Negate */
  public static void testNegate()
  {
      Picture beach = new Picture ("beach.jpg");
      beach.explore();
      beach.Negate();
      beach.explore();
  }
  
  /** Method to test Grayscale */
  public static void testGrayscale()
  {
      Picture beach = new Picture ("beach.jpg");
      beach.explore();
      beach.Grayscale();
      beach.explore();
  }
  
  /** Method to test FixUnderwater */
  public static void testFixUnderwater()
  {
      Picture water = new Picture ("water.jpg");
      water.explore();
      water.FixUnderwater();
      water.explore();
  }
  
  public static void testCopy()
  {
      Picture ocean = new Picture ("beach.jpg");
      //Picture daddy = new Picture ("flower1.jpg");
      Picture daddy2 = new Picture ("snowman.jpg");
      //ocean.copy(daddy, 100, 200);
      ocean.copy(daddy2, 10, 10, 60, 160, 100, 230);
      ocean.explore();
  }
  
  /** Method to test mirrorVerticalLefttoRight */
  public static void testMirrorVerticalLefttoRight()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorVerticalLefttoRight();
    temple.explore();
  }
  
  /** Method to test mirrorVeritcalRighttoLeft */
  public static void testMirrorVerticalRighttoLeft()
  {
      Picture temple = new Picture("temple.jpg");
      temple.explore();
      temple.mirrorVerticalRighttoLeft();
      temple.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    testFixUnderwater();
    testMirrorVerticalLefttoRight();
    testMirrorVerticalRighttoLeft();
    //testMirrorHorizontalToptoBottom();
    //testMirrorHorizontalBottomtoTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}