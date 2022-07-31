class Solution {
    fun isPalindrome(x: Int): Boolean {
        // If x is a negative number it is not a palindrome
        // If x % 10 = 0, in order for it to be a palindrome the first digit should also be 0
        //creating var x out of x as we cant directly reassign x from function as it is considered
        //val by kotlin compiler so we need to create a var to re-assign it
        var x = x
        if (x < 0 || x != 0 && x % 10 == 0) 
            return false
        var result = 0
        while (x > result) {
            result = result * 10 + x % 10
            x = x / 10
        }
        // If x is equal to reversed number then it is a palindrome
        // If x has odd number of digits, discard the middle digit before comparing with x
        // Example, if x = 23132, at the end of for loop x = 23 and reversedNum = 231
        // So, reversedNum/10 = 23, which is equal to x
        return x == result || x == result / 10
    }
}