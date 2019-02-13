public class EquipmentTest{
	
	/**
	 * test the Constructor and getters 
	 */
	
	public void contructorTest() throws AssertException{
		
		// call the constructor
		Equipment equip = new Equipment("broom/20,4600,200,sweep up trash");
		
		// test the getters
		Assert.assertEquals("broom", equip.getName());
		Assert.assertEquals(20, equip.getCount());
		Assert.assertEquals(4600.0, equip.getTotalWeight(), 0.01);
		Assert.assertEquals(200.0, equip.getTotalPrice(), 0.01);
		Assert.assertEquals("sweep up trash", equip.getDescription());
		
		// test toString method
		Assert.assertEquals("Name: broom, Number: 20, Weight: 4600.00 lbs, Price: $200.00 - sweep up trash", equip.toString());
		
	}
	
}
 