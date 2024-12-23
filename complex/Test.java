public class Test{
    public static void main(String[] args) {
        Complex<Double> c1 = new Complex<>(6.5, -10.5);
        Complex<Double> c2 = new Complex<>(1.5, -5.5);

      
        Complex<Double> addition = c1.add(c2);
        Complex<Double> subtraction= c1.sub(c2);
        Complex<Double> multiplication = c1.multiply(c2);
        Complex<Double> division = c1.Division(c2);
    
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}
