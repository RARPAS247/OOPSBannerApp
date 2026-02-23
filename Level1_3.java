public class Level1_3 {
     public static void main(String[] args) { 
        double kilometers = 10.8;
        double conversionFactor = 1.6; 
        double miles = kilometers / conversionFactor;
        System.out.printf("The distance %.1f km in miles is %.2f%n", kilometers, miles); 
    } 
}
