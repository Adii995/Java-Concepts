package ArrayDSA;

public class LargestStringQ3 {
	public static void main(String[] args){
	    String[] str = {"abc","xyzpty","pqru","aiy"};
	    String big =getBiggestString(str);
	     System.out.println(big);
	}
	public static String getBiggestString(String[] str){
	  String big = str[0];
	 for (String s:str){
	   if(s.length()>big.length()){
	     big = s;
	    }
	  }
	     return big;
  }
}
