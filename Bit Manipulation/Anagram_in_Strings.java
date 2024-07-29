import java.util.Arrays;

public class Anagram_in_Strings{
    public static void main(String args[]){
        String s1 = "racecar";
        String s2 = "carrafe";
        System.out.println(isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        char ch[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        for(int i=0; i<s1.length(); i++){
            if(ch[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }
}

