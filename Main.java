class ListNode {

      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    class Solution {
        public static boolean hasCycle(ListNode head) {
            ListNode first=head;
            ListNode second=head;

            while(first!=null){
                if(first==null||first.next==null){
                    return false;
                }
                first=first.next.next;
                second=second.next;
                if(first==second){
                    return true;
                }
            }


            return false;
        }



    }

