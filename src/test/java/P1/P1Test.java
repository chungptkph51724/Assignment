package P1;

import com.example.ph51724_24062025.P1.ChanLe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
public class P1Test {
    ChanLe service = new ChanLe();
    @Test
    public void test1() {
        assertEquals(1, service.soLe(1));
    }
    @Test
    public void test2() {
        assertEquals(2, service.soLe(2));
    }
    @Test
    public void test3() {
        assertEquals(3, service.soLe(3));
    }
    @Test
    public void test4() {
        assertEquals(4, service.soLe(4));
    }
    @Test
    public void test5() {
        assertEquals(5, service.soLe(5));
    }


}
