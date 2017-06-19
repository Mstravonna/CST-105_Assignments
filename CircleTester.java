import javafx.scene.shape.Circle;

public class CircleTester {

	public static void main(String[] args) {
		 //These two line will create two circle objects with the specified radius
        Circle cir1=new Circle(5.1);
        Circle cir2=new Circle(20.6);
        
        // these two line will store the radius of our circle objects in x and xx
        double x=cir1.getRadius();
        double xx=cir2.getRadius();
        
        System.out.println("The radius of circle 1 = "+ x);
        System.out.println("The radius of circle 2 = "+ xx);
        
        // we could also this code to print out the radius of each circle directly
        System.out.println("The radius of circle 1 = "+ Circle.class);
        System.out.println("The radius of circle 2 = "+ Circle.class);
       }
}
