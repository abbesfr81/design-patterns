
public class testString {

    public static void main(String[] args) {
        String s1 = new String("test");
        String s2 = new String("test");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        s1 = "test1";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
