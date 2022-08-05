package fi.johannes.lib.strings

import org.apache.commons.lang3.StringUtils

/**
 */
object StringLib {

    /**
     * Simple method to reverse a string with StringUtils (it is in Kotlin std as well)
     */
    fun reverse(str: String): String {
        return StringUtils.reverse(str)!!
    }

    /**
     * Simple method to reverse a string with StringUtils (it is in Kotlin std as well)
     * @param a string to check
     * @param b string to count
     */
    fun count(a: String, b: String): Int {
        return StringUtils.countMatches(a, b)
    }

}