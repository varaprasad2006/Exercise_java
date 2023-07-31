package final_example;

public class Person {

	
	    private final String name;
	    private final String dateOfBirth;

	    public Person(String name, String dateOfBirth) {
	        this.name = name;
	        this.dateOfBirth = dateOfBirth;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getDateOfBirth() {
	        return dateOfBirth;
	    }

}

class CookingRecipe {
    private final String name;

    public CookingRecipe(String name) {
        this.name = name;
    }

    // Final method representing a step in the cooking recipe
    public final void addIngredient(String ingredient) {
        System.out.println("Adding " + ingredient + " to " + name);
    }

    // Final method representing another step in the cooking recipe
    public final void mixIngredients() {
        System.out.println("Mixing the ingredients for " + name);
    }

    // Final method representing the final step in the cooking recipe
    public final void bake() {
        System.out.println("Baking " + name);
    }
}

