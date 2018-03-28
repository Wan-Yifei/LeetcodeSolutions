# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        # exception
        if l1 is None or l2 is None:
            return None
        if l1 is None:
            return l2
        if l2 is None:
            return l1

        # start
        carrier = 0
        # dummy variables
        head = ListNode(0)
        p = head
        while l1 is not None and l2 is not None:
            value = l1.val + l2.val + carrier
            carrier = (value - value % 10) // 10
            value %= 10
            p.next = ListNode(value)
            p = p.next
            l1 = l1.next
            l2 = l2.next
        if l2 is not None:
            while l2 is not None:
                # copy l2 linked list
                value = l2.val + carrier
                carrier = (value - value % 10) // 10
                value %= 10
                p.next = ListNode(value)
                p = p.next
                l2 = l2.next
        if l1 is not None:
            while l1 is not None:
                # copy l2 linked list
                value = l1.val + carrier
                carrier = (value - value % 10) // 10
                value %= 10
                p.next = ListNode(value)
                p = p.next
                l1 = l1.next
        if carrier is not 0:
            p.next = ListNode(carrier)
        return head.next
