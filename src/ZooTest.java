public class ZooTest{
	
	/**
	 * test the default constructor 
	 */
	public void defaultConstructorTest() throws AssertException{
		
		Zoo okcZoo = new Zoo(2);
		
		// make an animal
		Animal animal3 = new Animal("blue", "cat", 1.0, 2.1);
		Animal tammy = new Animal("green", "snake", 5.0, 2.0);
		okcZoo.addAnimal(animal3);
		okcZoo.addAnimal(tammy);
		
		// test getters
		Assert.assertEquals(2, okcZoo.getCapacity());
		Assert.assertEquals(3, okcZoo.getAverageWeight());
		Assert.assertEquals(5, okcZoo.getAverageWeight("green"));
		Assert.assertEquals(4.1, okcZoo.getTotalHeight());
		
		//test toString
		Assert.assertEquals("These animals live in the zoo: \ncat, a blue-colored animal."
				+ " 1.0 pounds, 2.1 inches\nsnake, a green-colored animal. 5.0 pounds,"
				+ " 2.0 inches\n", okcZoo.toString());
	}
}