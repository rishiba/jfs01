import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0122{
public static double DELTA = 1e-15;
    @Test
        public void test_01() {
            AsgA0122 obj  = new AsgA0122();
            double temp = obj.is_profit(200,100);
            assertEquals(temp, 1,DELTA);
        }
    @Test
        public void test_02() {
            AsgA0122 obj = new AsgA0122();
            double temp = obj.is_profit(200,200);
            assertEquals(temp,0,DELTA);
        }

    @Test
        public void test_03() {
            AsgA0122 obj = new AsgA0122();
            double temp = obj.is_profit(100,300);
            assertEquals(temp, -1,DELTA);
        }

 }
