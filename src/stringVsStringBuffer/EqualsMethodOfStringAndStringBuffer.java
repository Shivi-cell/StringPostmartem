package stringVsStringBuffer;
/** double equals (==) always compares reference  */
public class EqualsMethodOfStringAndStringBuffer {
    public static void main(String[] args) {
        String s1 = new String("Shivam");
        String s2 = new String("Shivam");
        System.out.println(s1 == s2);  // false
        /** equals() method is overridden in String class for content comparison
         *  so if contents are same it returns true */
        System.out.println(s1.equals(s2)); // true


        StringBuffer sb1 = new StringBuffer("Shivam");
        StringBuffer sb2 = new StringBuffer("Shivam");
        System.out.println(sb1 == sb2); // false
        /** Objects class equals() method is called b'coz it is not overridden in StringBuffer
         *  because Objects class equals() method compares the reference, so it will be false */
        System.out.println(sb1.equals(sb2)); // false


        //String str = new String("Shiva");
        String str3 = "Shiva";
        String str2 = new String("Shiva").intern();
        String str = new String("Shiva");
        System.out.println("Comparing str and str2 ");
//        System.out.println(str == str2);
//        System.out.println(str == str3);
        System.out.println(str3 == str2);
        System.out.println(str == str3);
        //System.out.println(str == str3);
    }
}
