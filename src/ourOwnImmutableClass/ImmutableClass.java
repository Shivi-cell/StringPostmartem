package ourOwnImmutableClass;

final public class ImmutableClass {
    private int i;
    ImmutableClass(int i){
        this.i = i;
    }

    /** this class is immutable because of modify method, if someone changes the modify method then it will not be
     * immutable, so we can mark this class as final. This is the reason why all immutable classes in java are final. */
    public ImmutableClass modify(int i){
        if (this.i == i)
            return this;
        else
            return new ImmutableClass(i);
    }

    public static void main(String[] args){
        ImmutableClass im = new ImmutableClass(10);

        ImmutableClass im2 = im.modify(20);
        ImmutableClass im3 = im.modify(10);

        System.out.println(im == im2);
        System.out.println(im == im3);
    }
}

