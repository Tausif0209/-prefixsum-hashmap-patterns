import java.util.Arrays;
import java.util.HashMap;

public class Leetcode1371 {
    public int findTheLongestSubstring(String s) {
        //   int[] indices=new int[32];
        //   indices[0]=-1;
        //   int i;
        // HashMap<Character,Integer> hashMap =new HashMap<>();
        //  hashMap.put('a',16);
        // hashMap.put('e',8);
        // hashMap.put('i',4);
        // hashMap.put('o',2);
        // hashMap.put('u',1);
        // int maxLength=0;
        //   for( i=1;i<indices.length;i++)
        //   {
        //       indices[i]=-2;
        //   }
        //   int mask=0;
        //   for(i=0;i<s.length();i++)
        //   {
        //       char ch=s.charAt(i);
        //       mask ^= hashMap.getOrDefault(ch, 0);
        //       if(indices[mask]==-2)
        //           indices[mask]=i;
        //       else {
        //           if((i-indices[mask])>maxLength)
        //               maxLength=i-indices[mask];
        //       }

        //   }
        //   return maxLength;  

        int[] indices=new int[32];
        Arrays.fill(indices,-2);
        indices[31]=-1;
        HashMap<Character,Integer> map =new HashMap<>();// This to basicaly marks set bit if character appearance is even 
        map.put('a',16);
        map.put('e',8);
        map.put('i',4);
        map.put('o',2);
        map.put('u',1);
        int maxLength=0;
        int bitMask=31;// appearance of each is zero so all bit are 1 (even)
        for(int i=0;i<s.length();i++) {
            bitMask^=map.getOrDefault(s.charAt(i),0);
            if(indices[bitMask]!=-2) maxLength=Math.max(maxLength,i-indices[bitMask]);
            else indices[bitMask]=i;
        } return maxLength;
    }
}
