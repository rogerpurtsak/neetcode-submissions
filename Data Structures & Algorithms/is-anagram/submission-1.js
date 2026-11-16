class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {

        const dictikas1 = new Object();
        const dictikas2 = new Object();

        for (let char of s) {
            if (Object.keys(dictikas1).includes(char)) {
                dictikas1[char] += 1;
            } else {
                dictikas1[char] = 1;
            }
        }
        for (let ch of t) {
            if (Object.keys(dictikas2).includes(ch)) {
                dictikas2[ch] += 1;
            } else {
                dictikas2[ch] = 1;
            }
        }
        const sortedd1 = Object.keys(dictikas1).sort();
        const sortedObj = {};
        for (const key of sortedd1) {
            sortedObj[key] = dictikas1[key]
        }

        const sortedd2 = Object.keys(dictikas2).sort();
        const sortedObj1 = {};
        for (const key1 of sortedd2) {
            sortedObj1[key1] = dictikas2[key1]
        }

        const keys1 = Object.keys(sortedObj);
        const keys2 = Object.keys(sortedObj1);

        if (keys1.length !== keys2.length) return false;

        for (const each of keys1) {
            if (sortedObj[each] !== sortedObj1[each]) return false;
        }
        return true;
    }
}
