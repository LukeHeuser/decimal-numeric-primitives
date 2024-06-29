public class DecimalNumericPrimitives {

    public static void main(String[] args) {

        float myNumber = 25.4f;

//        double before = 10_.25; // does not compile
//        double after = 10._25f; // does not compile
//        double first = _10.25; // does not compile
//        double last = 10.25_; // does not compile

        double myDouble = 2.54;
        double myDouble2 = 2.54F; // 'F' represents float
        double anotherDouble = 2.45D; // 'D' represents double. 'D' can be used for double, it is optional.

        System.out.println("myDouble = " + myDouble);
        System.out.println("myDouble2 = " + myDouble2);
        System.out.println("anotherDouble = " + anotherDouble);


        double scientific = 5.000125E03; // 'E' represents exponent. The 0 after the 'E' is optional.
        double scientific2 = 5.000125E3; // Exemplifying the 0 is optional
        double myDouble3 = 5000.125; // The

        System.out.println("Scientific = " + scientific);
        System.out.println("Scientific2 = " + scientific2);
        System.out.println("myDouble3 = " + myDouble3);

        double hexPi = 0x1.91eb851eb851fp1; // p indicates hexadecimal floating point number

        System.out.println("hexPi = " + hexPi);

    }
}
