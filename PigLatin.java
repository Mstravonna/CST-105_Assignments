//Travonna Wilson
//CST-105
//07/02/17
//This is my own work

public class PigLatin {

	public static void main(String[] args) {
		System.out.println("It was a stormy night");
		
		  String format = "|%1$-10s|%2$-10s|\n";
		    System.out.format(format, "It", "ITWAY");
		    System.out.format(format, "was", "ASWAY");
		    System.out.format (format, "a", "AWAY");
		    System.out.format(format, "stormy", "ORMYSTAY");
		    String ex[] = { "night", "IGHTNAY"};

		    System.out.format(String.format(format, (Object[]) ex));
		  }

	}


