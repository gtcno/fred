package unit

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import src.Probability
import kotlin.test.assertEquals

internal class ProbabilityTest {

    @Test
    fun `Valid on creation`() {
        assertThrows<IllegalArgumentException> { Probability(-0.1) }
        assertThrows<IllegalArgumentException> { Probability(1.2) }
    }

    @Test
    fun `Inverse`() {
        assertEquals(Probability(0.6), Probability(0.4).inverse())
        assertEquals(Probability(0.3), Probability(0.3).inverse().inverse())
    }
}