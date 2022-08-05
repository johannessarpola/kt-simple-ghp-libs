package fi.johannes.lib.hash

import com.google.common.hash.Hashing
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.nio.charset.StandardCharsets
import java.util.*

/**
 * Johannes on 5.8.2022.
 */
class HashLibTest {

    val convert =  { arr: ByteArray ->
        Base64.getEncoder().encodeToString(arr);
    }

    @Test
    fun testMd5() {
        val input = "abc"
        val md5 = HashLib.md5(input);
        val hashCode = Hashing.md5().hashString(input, StandardCharsets.UTF_8);


        val b64 = md5.b64()
        val b64_2 = convert(hashCode.asBytes())

        assertNotNull(md5)
        assertEquals(b64, b64_2)

    }
}