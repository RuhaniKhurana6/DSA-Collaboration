class Solution{
    public boolean backspaceCompare(String s, String t){
        int i = s.length() - 1;
        int j = t.length() - 1;
        while(i>=0 || j >= 0){
            int S = 0;
            while(i>=0){
                if(s.charAt(i)== '#'){
                    S++;
                    i--;
                }else if(S>0){
                    S--;
                    i--;
                
                }else{
                    break;
                }
            }
            int T = 0;
            while(j>=0){
                if(t.charAt(j)=='#'){
                    T++;
                    j--;
                }else if(T>0){
                    T--;
                    j--;
                }else{
                    break;
                }
            }
        }
        if(i>=0&&j>=0){
            if(s.charAt(i)!=t.charAt(j)){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}