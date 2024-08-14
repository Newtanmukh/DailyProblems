class KthLargest {

    final PriorityQueue<Integer> queue;
    final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.queue = new PriorityQueue<>(new Comparator<Integer>(){

            @Override
            public int compare(Integer lhs, Integer rhs){
                if(lhs > rhs)
                    return 1;

                if(lhs < rhs)
                    return -1;

                return 0;
            }
        });

        for(int a:nums){
            queue.add(a);

            if(queue.size()>k){
                queue.poll();
            }
        }
    }
    
    public int add(int val) {
        queue.add(val);
        while(queue.size() > k){
            queue.poll();
        }
        return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */