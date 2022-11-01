# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if not list1 and not list2:
            return None
        sorted_arr_head = temp = ListNode()
        while list1 != None and list2 != None:
            if list1.val <= list2.val:
                print('in 1')
                temp.val = list1.val
                list1 = list1.next
            else:
                print('in 2')
                temp.val = list2.val
                list2 = list2.next
            
            print(temp.val)
            temp.next = ListNode()
            temp = temp.next
            
        if list1:
            temp.val = list1.val
            temp.next = list1.next
        elif list2:
            temp.val = list2.val
            temp.next = list2.next
        return sorted_arr_head