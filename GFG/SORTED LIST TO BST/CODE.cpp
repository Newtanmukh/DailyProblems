class Solution{
public:
    TNode* f(vector<int>&tree,int start,int end)
      {
          if(start>end)
          return NULL;
          
         int  mid =  (end + start + 1)/2;
         TNode * root = new TNode(tree[mid]);
         root->left = f(tree,start,mid-1);
         root->right = f(tree,mid+1,end);
         return root;
      }
      
      TNode* sortedListToBST(LNode *head) {
        vector<int>tree;
        while(head)
        {
            tree.push_back(head->data);
            head = head->next;
        }
        TNode * temp = f(tree,0,tree.size()-1);
        return temp;
      }
};