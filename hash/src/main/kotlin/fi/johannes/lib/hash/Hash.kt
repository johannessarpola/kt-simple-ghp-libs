package fi.johannes.lib.hash

/**
 * Johannes on 5.8.2022.
 */
data class Hash(val bytes: ByteArray) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Hash

        if (!bytes.contentEquals(other.bytes)) return false

        return true
    }

    override fun hashCode(): Int {
        return bytes.contentHashCode()
    }

    fun b64(): String {
        return Utils.convertb64(this.bytes)
    }
}
