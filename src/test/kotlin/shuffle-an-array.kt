import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

internal class ShuffleAnArrayTest {
    private lateinit var solution: Solution
    private lateinit var initArray: IntArray

    @Test
    fun shouldReturnInitValueAfterReset() {
        val value = intArrayOf(1,2,3)
        initArray = value.clone()
        val solution = Solution(value)

        println(solution.shuffle().joinToString())
        println(solution.shuffle().joinToString())
        println(solution.shuffle().joinToString())
        println(solution.shuffle().joinToString())
        println(solution.shuffle().joinToString())
        val arr = solution.reset()
        Assertions.assertArrayEquals(initArray, arr)
    }
}
