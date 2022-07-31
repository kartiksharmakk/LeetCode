class Solution {
    fun lengthOfLongestSubstring(s: String):Int {
        //sliding window technique O(n) complexity
        //Hashset for storing and comparing characters of string for low complexity
        var charSet=HashSet<Char>()
        //index from left side
        var l=0
        //final largest value will be stored in this
        var result=0
        //right value will constantly increase and the total will be compared
        //from left to right as soon as a repeating character comes
        // hum usko udhar rok denge aur fir left value badha denge
        //yeh hum end tak karenge aur fir joh bhi result mae maximum
        //length vala substring banega uska length compare karke return kardenge
        for(r in 0 until s.length){
            //yeh character check karega hashset kae andar
            while (s[r] in charSet)
            {
                //jaise hei same character dikhega toh voh joh sabse left vala char
                //hoga usko remove kardega aur left index aage badha dega
                charSet.remove(s[l])
                l++
            }
            //yeh add karne kae liye string kae character , Hash set kae andar
            charSet.add(s[r])
            //yeh 0 sae r-l+1 hoga pehla unique substring
            //fir agla result mae store hokar iske agle vale substring length sath comparsion hoga
            //for loop kae end hone par sirf highest vale rahega isme
            result = Math.max(result,r-l+1)
        }
        return result
    }
}