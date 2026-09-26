class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        StringBuilder str = new StringBuilder();

        // Store knowledge in HashMap
        Map<String, String> map = new HashMap<>();

        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                int start = i;

                while (s.charAt(i) != ')') {
                    i++;
                }

                String text = s.substring(start + 1, i);

                if (map.containsKey(text)) {
                    str.append(map.get(text));
                } else {
                    str.append("?");
                }

            } else {
                str.append(s.charAt(i));
            }
        }

        return str.toString();
    }
}