class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        HashMap<String, Integer> dp = new HashMap<>();
        int max_chain = 0;
        for (String word : words) {
            dp.put(word, 1);
            for (int i = 0; i < word.length(); i++) {
                String prev_word = word.substring(0, i) + word.substring(i + 1);
                if (dp.containsKey(prev_word)) {
                    dp.put(word, Math.max(dp.get(word), dp.get(prev_word) + 1));
                }
            }
            max_chain = Math.max(max_chain, dp.get(word));
        }
        return max_chain;
    }
}
