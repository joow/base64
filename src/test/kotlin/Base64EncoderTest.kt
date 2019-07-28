import org.junit.Assert.assertEquals
import org.junit.Test

class Base64EncoderTest {
    @Test
    fun `it should encode to base 64`() {
        val cases = mapOf(
            "Hi!" to "SGkh",
            "Hello" to "SGVsbG8=",
            "Hello, World!" to "SGVsbG8sIFdvcmxkIQ=="
        )

        for ((plain, encoded) in cases) {
            assertEquals(encoded, plain.toBase64())
        }
    }
}