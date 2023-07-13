package packone;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] arrayS = new String[]{"acc","aaa","aaba"};
        System.out.println(solution(arrayS));
    }
    // No hint
    static String solution(String[] strs){
        String commonPrefix = "";
        if(strs.length == 1){
            return strs[0];
        }
        int minimalIndexPrefixLength = strs[0].length();

        for(int i = 1; i < strs.length; i++){
            if(strs[i].isEmpty() || strs[i - 1].isEmpty()){
                return "";
            }
            char[] currentWordChars = strs[i].toCharArray();
            char[] firstWordChars = strs[i-1].toCharArray();
            if(currentWordChars[0] != firstWordChars[0]){
                return "";
            }

            if(currentWordChars.length < minimalIndexPrefixLength){
                minimalIndexPrefixLength = currentWordChars.length;
            }

            StringBuilder possiblePrefix = new StringBuilder();
            for(int j = 0; j < minimalIndexPrefixLength; j++){
                if(currentWordChars[j] == firstWordChars[j]){
                    possiblePrefix.append(currentWordChars[j]);
                }
                else{
                    break;
                }
            }
            // commonPrefix = possiblePrefix; [without help]
            // With help:
            if(possiblePrefix.length() < commonPrefix.length() || commonPrefix.isEmpty()){
                commonPrefix = possiblePrefix.toString();
            }
        }
        return commonPrefix;
    }
}
