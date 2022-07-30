class Solution {
    lateinit var result:IntArray
    fun twoSum(nums: IntArray, target: Int): IntArray {

        var StorageMap=LinkedHashMap<Int,Int>()
        for (i in 0 .. nums.lastIndex )
        {
            
            if(StorageMap.containsKey(target-nums[i])){
               result= intArrayOf(StorageMap.get(target-nums[i])!!,i)
            }
            StorageMap.put(nums[i],i)
        }
        return result
    }
}