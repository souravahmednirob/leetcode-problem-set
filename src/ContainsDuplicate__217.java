import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate__217 {

    /**
     * Time complexity O(n)
     * Space complexity O(n)
     */

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }
}