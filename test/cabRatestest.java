import CabGenerator.CabGenerator;
import Rdie.Ride;
import Ride.Ride;
import org.junit.Assert;
import org.junit.Test;

public class CabRatesTest {
    @Test
    public void Distance_timeAndTotalFare() {
        CabGenerator cabGenerator = new CabGenerator();
        double distance=2.0;
        int time=5;
       double fare = CabGenerator.calculateFare(distance,time);
        Assert.assertEquals(25, fare,0.0);

    }

    @Test
    public void givenLessDistanceOrTime_ShouldReturnFare() {
        CabGenerator cabGenerator = new CabGenerator();
        double distance=0.1;
        int time=1;
        double fare = CabGenerator.calculateFare(distance,time);
        Assert.assertEquals(5, fare,0.0);

    }

    @Test
    public void givenMultipleRides_ShouldReturnTotalFare() {
        CabGenerator cabGenerator =  new CabGenerator();
            Ride[] rides = {new Ride(2.0, 5),
                    new Ride(0.1, 1)
            };
           double fare =  CabGenerator.calculateFare(rides);
        Assert.assertEquals(30, fare,0.0);

    }
}
