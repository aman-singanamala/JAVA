package Strings;

public class validate_ip {
    static boolean function(String s){
        String[] A= s.split("\\.");

        for(String str:A){
            int num= Integer.parseInt(str);
            if(num<0 ||num>255 ||str.length()>3){
                return false;
            }
        }

        return true;

    }
}
