import org.example.Katas;
import org.junit.Assert;
import org.junit.Test;

public class KatasTest {

    @Test
    public void compare(){
        Katas katasTest = new Katas();
        int value = katasTest.compare(4,2);
        Assert.assertEquals(1, value);
    }
}
