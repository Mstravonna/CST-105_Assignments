
public class console {
	 public double radius; 
     //This is a State Variable...also called Instance //Field and Data Member. 
     //It is available to code
     
     //This part is called the constructor. It lets us create a circle object with a radius.
     public void Circle(double r)
     {
         radius = r; 
     }  
     // After you create this circle object you want to add some methods.
     //Here is a circumference method 
     public double circumference( ) //circumference method 
     {
         double c = 2 * Math.PI * radius;
         return c;  
     }
}
