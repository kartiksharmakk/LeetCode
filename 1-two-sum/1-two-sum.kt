class Solution {
    lateinit var result:IntArray
    fun twoSum(nums: IntArray, target: Int): IntArray {

        var StorageMap=HashMap<Int,Int>()
        for (i in 0 .. nums.lastIndex )
        {
            if(StorageMap.containsKey(target-nums[i])){
               result= intArrayOf(StorageMap.get(target-nums[i])!!,i)
            }
            //If hashmap is filled before condition we will not get the first entry value result
            StorageMap.put(nums[i],i)
        }
        return result
    }
}