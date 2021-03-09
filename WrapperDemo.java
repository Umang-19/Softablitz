public class WrapperDemo {
    public static void main(String args[]) {
        // Integer iob = new Integer(100); // Depreciated
        Integer iob = 100; // AutoBoxing
        // int i = iob.intValue();
        int i = iob; // Auto Unboxing
        System.out.println(i + " " + iob);
    }
}
