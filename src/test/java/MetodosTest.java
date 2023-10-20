import org.example.Metodos;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MetodosTest {
    static Metodos met;
    @BeforeAll
    public static void setup(){
        met = new Metodos();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 23, 311, 487, 653, 947})
    public void isPrimeTest(int number){
        assertTrue(met.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {32, 64, 2, 20, 30, 26})
    public void isEvenTest(int number){
        boolean expect = true;
        boolean actual = met.isEven(number);
        assertEquals(expect, actual,"impar");
    }

    @ParameterizedTest
    @ValueSource(value = {"23,23"})
    public void isMultipleTest(int number,int divisor){
        boolean expect = true;
        boolean actual = met.isMultiple(number, divisor);
        assertEquals(expect, actual,"no");

    }

}
