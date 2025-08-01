import java.util.HashMap;

public class ContiguousArray {
  public int findMaxLength(int[] nums) {
        if(nums.length==1) return 0;
        int maxlen=0;
        int count=0;
        HashMap<Integer,Integer> indices=new HashMap<>();
        indices.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) count++;
            else count--;
            Integer index=indices.get(count);
            if(index!=null) maxlen=Math.max(maxlen,i-index);
            else indices.put(count,i);
        }
        return maxlen;
    }
}
