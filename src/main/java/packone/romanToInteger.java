package packone;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
    public static void main(String[] args) {
        //Input: MCMXCIV
        System.out.println(romanToInt("MCMXCIV"));
    }
    // Hint taken
    static int romanToInt(String s){
        Map<Character, Integer> numMap = Map.of(
                'I', 1, 'V', 5,
                'X', 10, 'L', 50,
                'C', 100, 'D', 500, 'M', 1000
        );
        int finalnumber = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            int getnumber = numMap.get(s.charAt(i));
            if(i != s.length() - 1 && getnumber < numMap.get(s.charAt(i + 1))){
                finalnumber -= getnumber;
            }
            else{
                finalnumber += getnumber;
            }
        }
        return finalnumber;
    }
}
