import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class SearchTest {
    @TestFactory
    fun search() = listOf(
            Pair(intArrayOf(-1,0,3,5,9,12), 9) to 4,
            Pair(intArrayOf(-1,0,3,5,9,12), -1) to 0,
            Pair(intArrayOf(-1,0,3,5,9,12), 12) to 5,
            Pair(intArrayOf(-1,0,3,5,9,12), 0) to 1,
            Pair(intArrayOf(-1,0,3,5,9,12), 5) to 3,
            Pair(intArrayOf(-1,0,3,5,9,12), 8) to -1,
        ).map { (input, expected) -> DynamicTest.dynamicTest("search([${input.first.joinToString()}], ${input.second}) to be $expected") {
            Assertions.assertEquals(expected, search(input.first, input.second))
        } }
}
