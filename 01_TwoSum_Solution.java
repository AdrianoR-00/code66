class Solution {
    public int[] twoSum(int[] sums, int target) {
	for (int ii = 0; ii < sums.length; ii++){
	    for (int jj = 0; jj < sums.length; jj++) {
		if ((sums[ii] + sums[jj] == target) && (ii != jj)) {
			int[] s = {ii, jj};
			return s;
		    }
	    }
	}
	return sums;
    }

    public static void main (String[] args) {
	int[] a  = {2,7,11,15};
	int t = 9;
	Solution s = new Solution();
	int[] r = s.twoSum(a,t);
	if(r.length == 2) System.out.println("[" + r[0] + "," + r[1] + "]");
    }
}
