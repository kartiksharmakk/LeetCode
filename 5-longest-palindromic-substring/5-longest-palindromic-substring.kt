class Solution {
    fun expand(s: String, l: Int, r: Int): String {
        var l = l
        var r = r
        while (l >= 0 && r < s.length && (s[l] == s[r])) {
            l--
            r++
        }
        return s.substring(l + 1, r)
    }

    fun longestPalindrome(s: String): String? {
        var temp = ""
        if (s.length <= 1) return s
        for (i in 0 until s.length) {
            //even case mae doh pointers rakhenge fir unse left aur right dekhenge
            val even = expand(s, i, i + 1)
            val odd = expand(s, i, i)
            if (odd.length > temp.length) temp = odd
            if (even.length > temp.length) temp = even
        }
        return temp
    }
}