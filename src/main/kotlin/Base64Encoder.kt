private const val ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

fun String.toBase64() =
    this.map { it.toInt() }
        .map { Integer.toBinaryString(it) }
        .joinToString("") { it.padStart(8, '0') }
        .chunked(6)
        .map { it.padEnd(6, '0') }
        .map { Integer.parseInt(it, 2) }
        .map { ALPHABET[it] }
        .joinToString("")
        .chunked(4)
        .joinToString("") { it.padEnd(4, '=') }
