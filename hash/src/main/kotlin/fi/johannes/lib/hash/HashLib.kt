package fi.johannes.lib.hash

import com.google.common.hash.Hashing
import java.nio.charset.StandardCharsets
import java.util.*


/**
 */
object HashLib {

    fun md5(input: String): Hash {
        val md5f = Hashing.md5()
        val hashCode = md5f.hashString(input, StandardCharsets.UTF_8);
        return Hash(hashCode.asBytes())
    }
}