import org.example.Katas;
import org.junit.Assert;
import org.junit.Test;

public class KatasTest {
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

    @Test
    public void romanNumeralsTest() {
        Katas katas = new Katas();
        String roman = katas.convertToRoman(2);
        Assert.assertEquals("II", roman);
    }
}
