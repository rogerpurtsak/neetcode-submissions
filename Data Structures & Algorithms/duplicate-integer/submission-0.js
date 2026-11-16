class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        const setikas = new Set(nums);
        if (setikas.size === nums.length) {
            return false;
        } else {
            return true;
        }
    }
}
