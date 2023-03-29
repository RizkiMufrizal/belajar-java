public class TipedataBukanPrimitif {

    public static void main(String[] args) {

        Integer iniTeger = 100;
        long iniLong = 10000;

        Byte inibyte = null;

        System.out.println(inibyte);

        inibyte = 100;

        System.out.println(inibyte);

        int iniint = 100;

        Integer iniObject = iniint;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long amount = 100000000000000L;
        Integer amount1 = 1000000000;






    }
}
