import org.junit.Test
import kotlin.test.*

public class FizzBuzzTest {

    @Test
    fun testReturnsFizzFor3() {
        assertEquals("fizz", FizzBuzz().get(3))
    }
}

