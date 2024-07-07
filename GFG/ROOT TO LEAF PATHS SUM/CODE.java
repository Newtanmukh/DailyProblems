void solve(Node *root, long long sum, long long &ans){
    if(!root) return;
    if(!root->left && !root->right)
        ans+=sum*10+root->data;
    
 
        solve(root->left, sum*10+root->data, ans);
        solve(root->right,sum*10+root->data, ans);
}
long long treePathsSum(Node *root)
{
    //Your code here
    long long ans = 0;
    solve(root, 0, ans);
    return ans;
}