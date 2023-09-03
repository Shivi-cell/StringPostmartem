package stringVsStringBuffer;

public class MutableAndImmutable {
    public static void main(String[] args) {
        String s = new String("Shivam");
        /** adding new content to the previously created string */
        s.concat("Chaubey");

        /** content will be added to new object because String is immutable (old object is not changed)
         * and newly created object is not assigned to any reference variable,
         * so it will be garbage collected....*/
        System.out.println(s);


        StringBuffer sb = new StringBuffer("Shivam");
        /** adding new content to the previously created stringBuffer */
        sb.append("Chaubey");
        /** content will be added to same object because StringBuffer is mutable */
        System.out.println(sb);
    }
}
