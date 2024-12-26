import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FractionsTest {

    @Test
    public void doFraction1() throws ZeroException {
        Fractions test1 = new Fractions();
        String actual = test1.DoFraction(1,2);
        String expected = "Дробь: 1/2";
        assertEquals(expected, actual);
    }

}