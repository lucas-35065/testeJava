public class CelsiusToFahrenheit {
    public static void main(String[] args){
        double degreeCelcius = 20;
        double degreeFahrenheit = (degreeCelcius * 1.8) + 32;
        
        int fahrenheitWithoutDecimals = (int) degreeFahrenheit;

        System.out.println(fahrenheitWithoutDecimals);
    }
    
}
