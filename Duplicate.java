
import java.util.HashMap;

class solution{
    public boolean containsDuplicate(int[] nums){
        HashMap<Integer,Boolean> map = new HashMap<>();


        for(int i : nums)
        {
            if(map.containsKey(i))
               return true;

                map.put(i,true);
            }
            return false;
        }
    }
class Duplicate{
    public static void main(String[] args) {
        solution s = new solution();
        int[] nums ={1,2,3,1};
        System.out.println(s.containsDuplicate(nums));
    }
}