package P1;

import com.example.ph51724_24062025.P1.ChanLe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
public class P1Test {
    ChanLe NumberChecker=new ChanLe();
    @Test
    public void testEvenPositive() {
        assertEquals("Chan", NumberChecker.checkEvenOdd(8));
    }

    @Test
    public void testOddPositive() {
        assertEquals("Le", NumberChecker.checkEvenOdd(7));
    }

    @Test
    public void testEvenNegative() {
        assertEquals("Chan", NumberChecker.checkEvenOdd(6));
    }


    @Test
    public void testOddNegative() {
        assertEquals("Le", NumberChecker.checkEvenOdd(9));
    }

    @Test
    public void test() {
        assertEquals("Chan", NumberChecker.checkEvenOdd(2));
    }
}

