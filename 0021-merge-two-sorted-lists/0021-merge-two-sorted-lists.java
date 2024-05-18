class Solution{

  

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
    ListNode curr1 = list1;
    ListNode curr2 = list2;
    ListNode returnList = new ListNode();
    ListNode returnListCopy = returnList;

    while(!(curr1 == null && curr2 == null)){
      
      if(curr1 == null){
        returnList.next = curr2;
        curr2 = curr2.next;
      } else if (curr2 == null){
        returnList.next = curr1;
        curr1 = curr1.next;
      } else if(curr1.val<curr2.val){
        returnList.next = curr1;
        curr1 = curr1.next;
      } else {
        returnList.next = curr2;
        curr2 = curr2.next;
      }

      returnList = returnList.next;

    }
    return returnListCopy.next;

  }
}