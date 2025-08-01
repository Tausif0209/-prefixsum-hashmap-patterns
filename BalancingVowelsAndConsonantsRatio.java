import java.util.HashMap;

public class BalancingVowelsAndConsonantsRatio {
  public int countBalanced(String[] arr) {
        int vowels=0,consonants=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        map.put(0,1);
        for(String s : arr){
            for(int i=0;i<s.length();i++) {
                if(isVowel(s.charAt(i))) vowels++;
                else consonants++;
            }  
            int fre=map.getOrDefault(vowels-consonants,0);
            count+=fre;
            map.put(vowels-consonants,fre+1);
        } return count;
    }
    boolean isVowel(char ch) {
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}
