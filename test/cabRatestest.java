import CabGenerator.CabGenerator;
import org.junit.Assert;
import org.junit.Test;

public class CabRatesTest {
    @Test
    public void Distance_timeAndTotalFare() {
        CabGenerator cabGenerator = new CabGenerator();
        double distance=2.0;
        int time=5;
       double fare = CabGenerator.calculatorFare(distance,time);
        Assert.assertEquals(25, fare,0.0);

    }

    @Test
    public void givenLessDistanceOrTime_ShouldReturnFare() {
        CabGenerator cabGenerator = new CabGenerator();
        double distance=0.1;
        int time=1;
        double fare = CabGenerator.calculatorFare(distance,time);
        Assert.assertEquals(5, fare,0.0);

    }
}
