import pkglab4.*;
class Lab4{
    static public void main(String[] args){
	  TemperatureConverter t= new TemperatureConverter();
	  double fahrenheit= t.apply (25.0);
	  System.out.println("Temperature in Fahrenheit: "+ fahrenheit);
	  ///////////////////////////////////////////////////////////////
	  quadraticEquation res = new quadraticEquation();
        
        Double[] input = {1.0, -3.0, 2.0};
        Double[] roots = res.apply(input);

        if (Double.isNaN(roots[0])) {
            System.out.println("The equation has no real roots");
        }else {
            System.out.println("root1= "+roots[0]+ "\troot2= "+roots[1]);
            
        }
	  
	}

}

