package stringVsStringBuffer;

public class StringCreationInHeapAndConstantPool {
    public static void main(String[] args) {
        /** creating a string using new keyword creates two objects, one in heap and another one in the string constant pool
         *  and the reference variable points to the object created in the heap memory.
         * */
        String s1 = new String("You can not change me");
        String s2 = new String("You can not change me");
        System.out.println(s1 == s2); // false because both points to different objects in the heap

        String s3 = "You can not change me";
        System.out.println(s1 == s3); // false because s3 points to the object in the SCP

        String s4 = "You can not change me";
        System.out.println(s3 == s4); // true both s3 and s4 points to the SCP object

        String s5 = "You can not " + "change me"; // this expression is evaluated at compile time, so s5 will point to SCP object
        System.out.println(s4 == s5); // true

        String s6 = "You can not";
        String s7 = s6 + "change me"; // this will be evaluated at runtime because s6 is a variable, so s7 will be pointing to object created in the heap memory
        System.out.println(s4 == s7); //false

        /** final variables are replaced by their value at the compile time so the expression is same as reference variable s5
         * and the s9 will point to object created in the SCP */
        final String s8 = "You can not ";
        String s9 = s8 + "change me";
        System.out.println(s4 == s9); // true
    }
}
