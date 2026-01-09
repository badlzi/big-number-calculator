package main;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyBigNumberTest {

    @Test
    public void testSumBasic() {
        MyBigNumber calc = new MyBigNumber();
        assertEquals("2", calc.sum("1", "1"));
        assertEquals("15", calc.sum("7", "8"));
    }

    @Test
    public void testSumWithCarry() {
        MyBigNumber calc = new MyBigNumber();
        assertEquals("100", calc.sum("99", "1"));
        assertEquals("110", calc.sum("99", "11"));
    }

    @Test
    public void testSum1234_897() {
        MyBigNumber calc = new MyBigNumber();
        String result = calc.sum("1234", "897");
        System.out.println("\nTest 1234 + 897:");
        calc.printAllSteps();
        assertEquals("2131", result);
    }

    @Test
    public void testStepsRecording() {
        MyBigNumber calc = new MyBigNumber();
        calc.sum("555", "555");
        List<String> steps = calc.getSteps();
        assertTrue(steps.size() >= 4);
        assertTrue(steps.get(0).contains("Bắt đầu"));
        assertTrue(steps.get(steps.size()-1).contains("Kết quả"));
    }
}
