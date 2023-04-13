import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class FrequencySortTest {
    @TestFactory
    fun frequencySort() = listOf(
            "tree" to "eert",
            "cccaaa" to "aaaccc",
            "Aabb" to "bbAa",
        ).map { (input, expected) -> DynamicTest.dynamicTest("frequencySort($input) to be $expected") {
            Assertions.assertEquals(expected, frequencySort(input))
        } }
}
