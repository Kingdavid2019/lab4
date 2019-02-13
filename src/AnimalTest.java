/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    
        
    public void fullConstructorTest() throws AssertException
    {
    	// Use the full constructor 
    	Animal animal2 = new Animal("blue", "cat", 1.0, 2.1);
    	
    	// The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("blue", animal2.getColor());
        Assert.assertEquals("cat", animal2.getName());
        Assert.assertEquals(1.0, animal2.getWeight());
        Assert.assertEquals(2.1, animal2.getHeight());
      }
    
}

