class Solution {
     fun containsDuplicate(nums: IntArray): Boolean {
        var result=HashSet<Int>()

        for(i in nums){
            if (result.contains(i))
                return true
            else
                result.add(i)
        }
        return false

    }
}