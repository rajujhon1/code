package code;

public class Longexample {

	public static void main(String[] args) {
		
		long distanceToMoon = 384400000L;  
		long population = 8000000000L;  
		
        long doubledDistance = distanceToMoon * 2;
        long halfPopulation = population / 2;

        System.out.println("Distance to the Moon: " + distanceToMoon + " meters");
        System.out.println("World Population: " + population);
        System.out.println("Doubled Distance: " + doubledDistance + " meters");
        System.out.println("Half of World Population: " + halfPopulation);
	}

}
