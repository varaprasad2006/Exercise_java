package final_example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		    Person person = new Person("John Doe", "15-06-1990");
		    System.out.println("Name:"+person.getName()+"Date Of Birth:"+person.getDateOfBirth());


		    
		    CookingRecipe recipe = new CookingRecipe("Chocolate Cake");

	        // Perform the cooking steps according to the recipe
	        recipe.addIngredient("flour");
	        recipe.addIngredient("sugar");
	        recipe.addIngredient("cocoa powder");
	        recipe.mixIngredients();
	        recipe.bake();
	}

}



