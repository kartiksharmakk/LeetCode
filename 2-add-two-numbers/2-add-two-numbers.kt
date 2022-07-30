/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
     fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var answer=ListNode(0)
        var firstList=l1
        var secondList=l2
        //because humne answer ko update nahi karna balki currentNode ko karna hai
        var currentNode=answer
        var carry=0

        while(firstList!=null || secondList != null)
        {
            // yeh p aur q ko null par 0 dena zarrori hai varna add nahi kar pyega program
            // kyunki null ka addition ho nahi sakta isliye hum zero maan rahe , idhar null safe ? ka   
            // fayda nahi hai kyunki 0 karna padega
            var p = if(firstList!=null) firstList.`val` else 0
            var q =  if(secondList!=null) secondList.`val` else 0
            var sum=p+q+carry
            //carry round off hokar hei aayega 0,1,2 vagera mae hei division sath
            carry=sum/10
            
            //sum%10 , single digit answer joh chaiye vohi dae dega jaise 7%10=7 aur 17%10=7 (remainder=modulus)
            currentNode.next=ListNode(sum%10)
            
            //Idhar !! not null nahi use karna hai varna null pointer exeception aajata
            //Isliye ? null safe hei rakhna kyunki actual mae null value aajye toh bhi theek rahe
            currentNode= currentNode?.next
            firstList=firstList?.next
            secondList=secondList?.next
            // agar yeh java hota toh humko if(firstList!=null) firstList= firstList.next karna padta
            // par kotlin hai isliye null safety ka fayda hogya
        }
        if (carry>0){
            currentNode.next=ListNode(carry)
        }
        //agar .next nahi return karenge toh ek zero bhi aayega starting mae answer kae jisse intialize         //kiya tha humne list
        return answer.next
    }
}