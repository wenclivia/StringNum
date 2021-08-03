public class StringNum {



    public static void main(String[] args) {
        String str1 = "acbdw,1269547,AASIDX,AIUydjs,12sjaA,3819247,ausSHSzio,IUFISsi";
        String s[] = str1.split(",");//以逗号分开

        //判断字符串是否全是数字
        for (int i = 0; i < s.length; i++) {
            String str2 = (s[i]);
            System.out.println(isNumber(str2));
        }
        //判断字符串是否是大写字母
        for (int i = 0; i < s.length; i++) {
            String str3 = (s[i]);
            System.out.println(isBig(str3));
        }
        //判断字符串是否全是小写字母
        for (int i = 0; i < s.length; i++) {
            String str4 = (s[i]);
            System.out.println(isSmall(str4));
        }



    }

    //封装判断方法
    public static boolean isNumber(String str){
        for (int i = 0; i < str.length(); i++){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static boolean isBig(String str){
        for(int i=0;i<str.length();i++){
            if(!Character.isUpperCase(str.charAt(i))){
                return true;
            }
            else if(str.charAt(i)>'Z'||str.charAt(i)<'A'){
                return false;
            }
        }
        return true;
    }
    public static boolean isSmall(String str){
        for(int i=0;i<str.length();i++){
            if(!Character.isLowerCase(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}