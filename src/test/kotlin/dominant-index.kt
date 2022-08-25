import org.junit.jupiter.api.*
import kotlin.random.Random

internal class DominantIndexTest {
    @TestFactory
    fun dominantIndex() = listOf(
            intArrayOf(3,6,1,0) to 1,
            intArrayOf(2,3,6, 19, 9, 1,0) to 3,
            intArrayOf(2,3,6, 19, 10, 1,0) to -1,
            intArrayOf(1,2,3,4) to -1,
            intArrayOf(1, 0) to 0,
        ).map { (input, expected) -> DynamicTest.dynamicTest("dominantIndex($input) to be $expected") {
            Assertions.assertEquals(expected, dominantIndex(input))
        } }
}
