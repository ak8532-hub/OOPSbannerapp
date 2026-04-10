/**
 * OOPSBannerApp - UC3
 * This program prints "OOPS" in banner format using String.join()
 * 
 * @author Anupam
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                " ***** ", " ***** ", " ****** ", " ***** "));

        System.out.println(String.join(" ",
                "*     *", "*     *", "*     *", "*     *"));

        System.out.println(String.join(" ",
                "*     *", "*     *", "*     *", "*"));

        System.out.println(String.join(" ",
                "*     *", "*     *", "******", " ***** "));

        System.out.println(String.join(" ",
                "*     *", "*     *", "*", "      *"));

        System.out.println(String.join(" ",
                "*     *", "*     *", "*", "*     *"));

        System.out.println(String.join(" ",
                " ***** ", " ***** ", "*", " ***** "));
    }
}