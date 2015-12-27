import org.junit.Test
import kotlin.test.*

public class FizzBuzzTest {

    @Test
    fun testReturnsFizzFor3() {
        assertEquals("fizz", FizzBuzz().get(3))
    }

    @Test
    fun testReturnsBuzzFor5() {
        assertEquals("buzz", FizzBuzz().get(5))
    }
}

