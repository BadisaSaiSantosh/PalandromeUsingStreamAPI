import java.util.ArrayList;
import java.util.stream.*;
class Pal{
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(121);
        ar.add(22);
        ar.add(122);
        System.out.println(ar.stream().map(el->Pal(el)).collect(Collectors.toList()));
    }
    static int Pal(int num){
        String str=Integer.toString(num);
        String strRev="";
        for(int i=0;i<str.length();i++){
            strRev+=str.charAt(str.length()-1-i);   
        }
        if(strRev.equals(str)){
        return num;
        }
        else  
        return -1;
        // expected output:
        // [121, 22, -1]
        
    }
}