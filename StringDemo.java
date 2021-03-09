public class StringDemo {

    public static void main(String args[]) {

        String str1 = "Umang";
        String str2 = "Mahima OP";
        String str3 = str1;

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("length of str1 : " + str1.length());
        System.out.println("length of str2 : " + str2.length());
        System.out.println("Char at 0th index in str1 : " + str1.charAt(0));
        System.out.println("Char at 1st index in str2 : " + str2.charAt(1));
        System.out.println("Comparing str1 & str3  " + str1.equals(str3));
        System.out.println("Comparing str2 & str3  " + str2.equals(str3));
    }

}
