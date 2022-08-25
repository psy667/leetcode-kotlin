fun isPalindrome(s: String): Boolean {
    val azRange = 'a'.rangeTo('z')
    val zeroOneRange = '0'.rangeTo('9')

    return s.toLowerCase()
        .filter { azRange.contains(it) || zeroOneRange.contains(it) }
        .run { this == this.reversed() }
}
