import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class RemoveDuplicatesInArrayTestKt {
    @TestFactory
    fun removeDuplicates() = listOf(
            intArrayOf(0,0,1,1,1,2,2,3,3,4) to intArrayOf(0,1,2,3,4),
            intArrayOf(1) to intArrayOf(1),
            intArrayOf(1,2,3,4) to intArrayOf(1,2,3,4),
        ).map { (input, expected) -> DynamicTest.dynamicTest("removeDuplicates([${input.joinToString()}]) to be [${expected.joinToString()}]") {
            Assertions.assertEquals(expected.joinToString(""), removeDuplicates(input).joinToString(""))
        } }
}
