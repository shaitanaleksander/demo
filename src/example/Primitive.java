package example;

public class Primitive {

    byte aByte = 127; // can be -128 -> 127
    short aShort = 32767; // can be -32768 -> 32767
    int anInt = 2147483647; // can be -2147483648 -> 2147483647
    long aLong = 21474836472323L; // need to have "L" at the end
    float aFloat = 234.234f; // 4 bites
    double aDouble = 2342342.324234234; // 8 bites
    char aChar = 'a'; // 2 bites.
    boolean aBoolean = true; // one bite  can be true/false
    Character character;


    public static void main(String[] args) {
        String a  = "hello";
        String b  = "hello";
        String c = new String("hello");
        a = a + " world"+"123";

        int x = 1;
        System.out.println((2 == 2)  || (2 > 100));

    }

}
