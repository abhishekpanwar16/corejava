public class Main {
    public static void main(String[] args) {
        byte newByte = 10;
        short newShort = 20;
        int newInt = 50;
        long newLong = 50000L + 10L * (newByte + newShort + newInt);

        System.out.println("Pratice given : " + newLong );

        short newShortValue = (short)(1000 + 10 * (newByte + newShort + newInt ));
        System.out.println("New Short Value : " + newShortValue);
    }
}