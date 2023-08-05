class Solution {
    // Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line) {
        // Your code here
        TreeMap<Character, Integer> map = new TreeMap<>();
        int n = line.length();
        for (int i = 0; i < n; i++) {
            char ch = line.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        char maxChar = '\0';
        for (Map.Entry<Character, Integer> mapElement : map.entrySet()) {
            char ch = mapElement.getKey();
            int freq = mapElement.getValue();

            if (freq > maxFreq) {
                maxFreq = freq;
                maxChar = ch;
            }
        }

        return maxChar;

    }

}