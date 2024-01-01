import java.util.Arrays;

public class AssignCookies__455 {

    /**
     * Time complexity O(NlogN)
     * Space complexity O(1)
     */

    public int findContentChildren(int[] g, int[] s) {

        int count = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        for(int i = 0; i < s.length && count < g.length; i++){
            if(g[count] <= s[i]){
                count++;
            }
        }
        return count;
    }
}
