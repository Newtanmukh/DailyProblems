
class GfG 
{
    public static Tree convert(Node head, Tree node) {
        // add code here.}
        ArrayList<Integer> list= new ArrayList<>();
        Node cur=head;
        while(cur!=null){
            list.add(cur.data);
            cur=cur.next;
        }
        node=solve(list,0);
        return node;
    }
  
    public static Tree solve(ArrayList<Integer> list, int i){
        if(i>=list.size()) return null;
        Tree root= new Tree(list.get(i));
        root.left=solve(list,2*i+1);
        root.right=solve(list,2*i+2);
        return root;
    }
}  