import org.example.Katas;
import org.junit.Assert;
import org.junit.Test;

public class KatasTest {

//    @Test
//    public void compare(){
//        Katas katasTest = new Katas();
//        int value = katasTest.compare(4,2);
//        Assert.assertEquals(1, value);
//    }

    @Test
    public void fahrenheitToCelsiusTest() {
        Katas katas = new Katas();
        double celsius = katas.fahrenheitToCelsius(100.0);
        Assert.assertEquals(37.8, celsius,1);
    }

    @Test
    public void celsiusToFahrenheitTest() {
        Katas katas = new Katas();
        double fahrenheit = katas.celsiusToFahrenheit(37.8);
        Assert.assertEquals(100, fahrenheit, 1);
    }
}
