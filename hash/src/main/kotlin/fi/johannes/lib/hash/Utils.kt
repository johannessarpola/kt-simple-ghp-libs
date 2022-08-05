package fi.johannes.lib.hash

import com.google.common.hash.Hashing
import java.nio.charset.StandardCharsets
import java.util.*


/**
 */
internal object Utils {

    fun convertb64(arr: ByteArray): String {
        return Base64.getEncoder().encodeToString(arr);
    }
}