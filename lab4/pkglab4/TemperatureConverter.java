package pkglab4;
import java.util.function.Function;
public class TemperatureConverter implements Function<Double,Double>{
  public Double apply (Double celsius){
    return (celsius * 9 / 5) + 32;
  }
}
