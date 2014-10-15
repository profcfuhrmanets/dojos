import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrimesTest {

    @Test
    public void testTwo() throws Exception {
        assertEquals(list2(), Primes.generate(2));
    }

    @Test
    public void testOne() throws Exception {
        assertEquals(list(), Primes.generate(1));

    }

    private List<Integer> list() {
        return new ArrayList<Integer>();
    }

    private List<Integer> list2() {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        primeFactors.add(2);
        return primeFactors;
    }
}
