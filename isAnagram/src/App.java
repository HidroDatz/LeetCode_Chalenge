import java.util.Arrays;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
       String s = "anagram", t = "nagaram";
       System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t){
        if(s.length()!= t.length()) return false;
        HashMap<Character, Integer> mapS = new HashMap<Character,Integer>(); 
        HashMap<Character, Integer> mapT = new HashMap<Character,Integer>(); 
        for(int i=0;i< s.length();i++){
            mapS.put(s.charAt(i),mapS.getOrDefault(s.charAt(i),0) +1);
            mapT.put(t.charAt(i),mapT.getOrDefault(t.charAt(i),0) +1);
        }
        for (Character c : mapS.keySet()) {
            if(!mapT.containsKey(c) || !mapS.get(c).equals(mapT.get(c))) return false;
        }
        return true;
    }
}
