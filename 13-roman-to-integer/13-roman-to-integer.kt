class Solution {
    fun romanToInt(s: String): Int {
       val StorageMap = HashMap<Char, Int>()
                StorageMap['I'] = 1
                StorageMap['V'] = 5
                StorageMap['X'] = 10
                StorageMap['L'] = 50
                StorageMap['C'] = 100
                StorageMap['D'] = 500
                StorageMap['M'] = 1000

        var result:Int = StorageMap[s[s.length - 1]]!!
        for (i in s.length - 2 downTo 0) {
            if (StorageMap[s[i]]!! >= StorageMap[s[i + 1]]!!) {
                result += StorageMap[s[i]]!!
            } else {
                result -= StorageMap[s[i]]!!
            }
        }
        return result
    
    }
}