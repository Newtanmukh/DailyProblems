class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, new Comparator<Job>(){
            @Override
            public int compare(Job lhs, Job rhs){
                
                if(lhs.profit==rhs.profit){
                    if(lhs.deadline > rhs.deadline)
                        return -1;
                    return 1;
                }
                
                if(lhs.profit > rhs.profit)
                    return -1;
                return 1;
            }
        });
        
        int maxDeadLine = 0;
        
        for(Job job: arr){
            maxDeadLine = Math.max(maxDeadLine, job.deadline);
        }
        
        boolean[] slot = new boolean[maxDeadLine + 1];
        Arrays.fill(slot, false);
        
        int jobCount = 0;
        int maxProfit = 0;
        
        for(Job job: arr){
            for(int i=job.deadline; i>=1; i--){
                if(slot[i]==false){
                    slot[i] = true;
                    jobCount++;
                    maxProfit = maxProfit + job.profit;
                    break;
                }
            }
        }
        
        return new int[]{jobCount, maxProfit};
    }
}
