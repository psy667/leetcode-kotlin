import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class FizzBuzzTest {
    @TestFactory
    fun fizzBuzz() = listOf(
            15 to listOf("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"),
        ).map { (input, expected) -> DynamicTest.dynamicTest("fizzBuzz($input) to be $expected") {
            Assertions.assertEquals(expected, fizzBuzz(input))
        } }
}
