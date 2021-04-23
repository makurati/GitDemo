package co.vanila;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/*
import java.util.ArrayList;
import java.util.Scanner;

public class SherlockAndAnagrams {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = in.nextInt();
        in.nextLine();
        for (int i = 0; i < testCases; i++) {
            String text = in.nextLine();
            ArrayList<String> list = new ArrayList<>();
            int len = text.length();
            int counter = 0;
            for (int j = 0; j < len; j++) {
                for (int sub = 1; sub <= len-j; sub++) {
                    String subPart = text.substring(j, j+sub);
                    list.add(subPart);
                }
            }
            for (int j = 0; j < list.size(); j++) {
                String element = list.get(j);
                for (int k = j+1; k < list.size(); k++) {
                    if(isAnagram(list.get(k), element)){
                        //System.out.println(list.get(k) + "->" + element);
                        counter++;
                    }
                }
            }
            System.out.println(counter);
        }
    }

    public static boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        int[] lettermap = new int[26];
        for(int j=0; j<a.length(); j++){
            char ch = a.charAt(j);
            lettermap[ch - 'a']++;
            ch = b.charAt(j);
            lettermap[ch - 'a']--;
        }

        for(int j=0; j<lettermap.length; j++){
            if(lettermap[j] != 0){
                return false;
            }
        }
        return true;
    }
}*/



/*//Complete the sherlockAndAnagrams function below.
static int sherlockAndAnagrams(String s) {
    
    int len = s.length(); 
    int ans = 0;
    //counter map for substring
    HashMap<String,Integer> subMap= new HashMap<String,Integer>();
    //iterate through all the possible substring of s
    for(int i = 1;i<len;i++){//starting with size 1,2,3,4
        for(int j= 0;i+j<len+1; j++){
            String sub = s.substring(j,i+j);
            //before putting the substring into the map, sort the string
            //in this way abc, acb will result in abc abc pair
            char[] subArray = sub.toCharArray();
            Arrays.sort(subArray);
            String subSorted = new String(subArray);
            Integer subNumber = subMap.get(subSorted);
            if(subNumber==null )//check if the sequnece already exists
                subMap.put(subSorted,1);//put in for the first time
            else{
                subNumber++;//sub already inserted so update plus 1
                subMap.put(subSorted,subNumber);
                //if we have values o n for a sub 
                //increse ans with n*(n-1)/2 but removing the value of the preceding
                //iteratrion -= (n-1)*(n-2)/2
                ans -= ((subNumber-1)*(subNumber-2))/2;
                System.out.println("ans first "+ans);
                ans += (subNumber*(subNumber-1))/2;
                System.out.println("ans second "+ ans);
            }

        }
    }
    return ans;

}*/
