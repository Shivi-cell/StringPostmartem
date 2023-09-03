package stringBuffer;

public class Capacity {
    public static void main(String[] args) {
        /** StringBuffer object initial capacity is 16 characters if there is no element in it*/
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnop"); // adding 16 characters in the sb
        System.out.println(sb.capacity()); // 16
        sb.append("q"); // adding 17th character
        /** When you add 17th character then the size of stringBuffer will be increased
         * Increasing formula -> (current capacity + 1)*2 = will be the new capacity of stringBuffer
         * (16 + 1)*2 = 34 will be the new capacity. */
        System.out.println(sb.capacity());

        /** If you pass the string inside the constructor then the capacity will be
         * (initial capacity + length of the string) */
        StringBuffer sb2 = new StringBuffer("Shivam");
        System.out.println(sb2.capacity()); // 22 (16 + 6)

        /** If you want to create a string of bigger capacity in the beginning the pass the capacity in the constructor*/
        StringBuffer sb3 = new StringBuffer(100);
        System.out.println(sb3.capacity());
    }
}
