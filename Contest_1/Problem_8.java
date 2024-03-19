//8
class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node fast = head;
         Node slow = head;
         while(fast.next!=null && fast.next.next!=null){
             fast = fast.next.next;
             slow = slow.next;
         }
         if(fast.next!=null){
             slow = slow.next;
         }
         return slow.data;
    }
}