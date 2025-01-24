class typeconversion{
    public static void main(String[] args) {
        int a = 5;
        double d = 5.54;
        char c = 'a';
        boolean b = true;

        System.out.println("Before Type conversion");
        System.out.println(a);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);

        System.out.println("After Type Conversion");

        System.out.println("Int to Double: " + (double)a);
        System.out.println("Char to Int: " +  (int)c);
        System.out.println("Double to int: " + (int)d);
        System.out.println("Boolean to Boolean: " + b);
    }
}