/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* result = new ListNode();
        ListNode* record = result;
        ListNode* pre = 0;
        int up = 0;
        int formerUp = 0;
        while (l1 != 0 && l2 != 0) {
            if (l1->val + l2->val + formerUp >= 10) {
                up = 1;
            } else {
                up = 0;
            }
            result->val = (l1->val + l2->val + formerUp) % 10;
            result->next = new ListNode();
            pre = result;
            result = result->next;
            formerUp = up;
            l1 = l1->next;
            l2 = l2->next;
        }
        while (l1 != 0) {
            if (l1->val + formerUp >= 10) {
                up = 1;
            } else {
                up = 0;
            }
            pre = result;
            result->val = (l1->val + formerUp) % 10;
            result->next = new ListNode();
            result = result->next;
            formerUp = up;
            l1 = l1->next;
        }
        while (l2 != 0) {
            if (l2->val + formerUp >= 10) {
                up = 1;
            } else {
                up = 0;
            }
            pre = result;
            result->val = (l2->val + formerUp) % 10;
            result->next = new ListNode();
            result = result->next;
            formerUp = up;
            l2 = l2->next;
        }

        if (formerUp == 1) {
            result->val = 1;
            result->next = 0;
        } else {
            pre->next = 0;
        }

        return record;
    }
};