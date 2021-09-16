import java.util.*;

public class Solution {

    public String solution(int[] numbers) {
        
        // 숫자들을 붙여서 문자로된 수를만든다.
        // 문자들을 수로 바꾼다.
        // 가장 큰수를 찾는다.
        // 반환한다.
        
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Collections.sort(nums);

        System.out.println(nums);
        
        for(int i=0; i<numbers.length; i++){
        
            String temp = "";
            
            for(int j=0; j<numbers.length; j++){
                
    
                    temp += numbers[j];
                
            }
            
            nums.add(Integer.parseInt(temp));
            
        }
        
        
        
        return nums.get(nums.size()-1)+"";
    }
}
