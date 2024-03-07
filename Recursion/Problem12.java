package JavaDSAPlayground.Recursion;


public class Problem12 {
    public static void main(String[] args) {
        // Problem 12 : Remove Duplicates in a string(GOOGLE , MICROSOFT)
        // eg-appnnacollege
        remove("appnnacollege" , 0 , new StringBuilder() , new boolean[26]);
    }
    public static void remove(String str ,int index ,StringBuilder sb , boolean[] map ){
    // base case
    if(index == str.length()){
        System.out.println(sb);
        return;
    }
    // kaam
    char currChar = str.charAt(index);
    if(map[currChar-'a']==true){
       remove(str , index+1 , sb , map);
    }else{
        map[currChar-'a']=true;
        sb.append(currChar);
        remove(str , index+1 , sb , map);
    }
    }
}

