package util;

public class ELUtil {
    /**
     * 1,必须要有静态方法
     * 2,必须要有返回值
     *
     * @param input
     * @return
     */

    public static String reverse(String input){

        char [] array = input.toCharArray();
//        String result = "";
        StringBuffer sb = new StringBuffer();
        for (int i = array.length - 1; i >= 0; i--) {
//            result += array[i];
            sb.append(array[i]);
        }
        return String.valueOf(sb);
    }

    public static boolean endWith(String input,String substring){
        if(input==null) input="";
        if(substring==null) substring="";
      int index=input.lastIndexOf(substring);
        if(index==-1) return false;
        if(index==0&&substring.length()==0) return true;
        return (index==input.length()-substring.length());
    }




}
