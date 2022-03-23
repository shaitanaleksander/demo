package example;

public class Comments {

    public static void main(String[] args) {

        // это строчный коментарий
        System.out.println("inline comments ");

        /* это
        блочный
        коментарий
         */
        System.out.println("blocks comments");

        String str = "asdfasdf";
        String ar = str;
        str = "11111";

        System.out.println(sum(2,3));
        int a = 3;
        int b = 3;
        sum(a, b);
    }


    /**
     * @param a number one
     * @param b number two
     * @return sum of number one and two
     */
    public static int sum(int a, int b){
        return a + b;
    }
}
