import java.util.HashSet;
import java.util.Set;

public class TripletSeq {

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{1, 2, 3, 4, 5}));
//        System.out.println(Integer.MAX_VALUE);
    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums.length <= 2)
            return false;
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num);
        }
        if (s.size() <= 2)
            return false;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] < nums[j])
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[j] < nums[k])
                            return true;
                    }
            }

        }
        return false;
    }

}
