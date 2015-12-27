import org.junit.Before
import org.junit.Test
import kotlin.test.*

public class FizzBuzzTest {

    lateinit var classToTest: FizzBuzz

    @Before
    fun setUp() {
        classToTest = FizzBuzz()
    }

    @Test
    fun testReturnsFizzFor3() {
        assertEquals("fizz", classToTest.get(3))
    }

    @Test
    fun testReturnsBuzzFor5() {
        assertEquals("buzz", classToTest.get(5))
    }

    @Test
    fun testReturnsNumberAsStringIfNotDivisibleBy5Or3() {
        assertEquals("1", classToTest.get(1))
    }

    @Test
    fun testReturnsFizzForMultiplesOf3() {
        assertEquals("fizz", classToTest.get(6))
        assertEquals("fizz", classToTest.get(9))
        assertEquals("fizz", classToTest.get(12))
    }

    @Test
    fun testReturnsFizzbuzzFor15() {
        assertEquals("fizzbuzz", classToTest.get(15))
    }
}

