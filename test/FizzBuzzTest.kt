import org.junit.Test
import kotlin.test.assertEquals

public class FizzBuzzTest {

    @Test
    fun testReturnsFizzFor3() {
        assertEquals("fizz", get(3))
    }

    @Test
    fun testReturnsBuzzFor5() {
        assertEquals("buzz", get(5))
    }

    @Test
    fun testReturnsNumberAsStringIfNotDivisibleBy5Or3() {
        assertEquals("1", get(1))
    }

    @Test
    fun testReturnsFizzForMultiplesOf3() {
        assertEquals("fizz", get(6))
        assertEquals("fizz", get(9))
        assertEquals("fizz", get(12))
    }

    @Test
    fun testReturnsFizzbuzzFor15() {
        assertEquals("fizzbuzz", get(15))
    }

    @Test
    fun testReturnsBuzzForMultiplesOf5() {
        assertEquals("buzz", get(10))
        assertEquals("buzz", get(20))
        assertEquals("buzz", get(25))
    }
}
