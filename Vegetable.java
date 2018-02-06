public class Vegetable {

   private String color;
   private String name;
   private double weight;

   public void Vegetable() {
      color = "";
      name = "";
      weight = 0;
   }

   public void Vegetable(String color, String name, double weight) {
		this.color = color;	//this means the current object, needed because parameter is same name 
		this.name = name;
		this.weight = weight;
   }

   public void Vegetable(String color) {
		this.color = color;
   }

   public void Vegetable(double weight) {
		this.weight = weight;
   }

   public void setColor(String color) {
		this.color = color;

   }

   public void setName(String name) {
		this.name = name;
   }

   public void setWeight(double weight) {
		this.weight = weight;
   }

   public String getColor() {
      return this.color;	//could use this.color, but there is no other color in the method
   }

   public double getWeight() {
      return weight;
   }

   public String getName() {
      return name;
   }

}