//Class name: Sandwich
//Purpose: use data fields to include methods to get and set values
//Programmer: Judy Marie Delos Reyes on February 2, 2022

public class Sandwich {

	private String ingredient;
	private String bread;
	private double price;
	
	public Sandwich(String ing, String bread, double price) {
		ingredient = ing;
	}
	
//	public void setIngredient(String ing) {
//		this.ingredient = ing;
//	}
//	public void setBread(String bread) {
//		this.bread = bread;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
	
	public String getIngredient() {
		return ingredient;
	}
	public String getBread() {
		return bread;
	}
	public double getPrice() {
		return price;
	}

}
