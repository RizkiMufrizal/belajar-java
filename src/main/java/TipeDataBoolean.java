public class TipeDataBoolean {
    public static void main(String[] args) {

        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(!salah);

        Integer uang = 5000;

        if (uang != 1000) {
            System.out.println("pergi ke pasar");
        } else if (uang == 1000) {
            System.out.println("uang 1000");
        } else {
            System.out.println("di rumah");
        }

        String hari = "selasa";
        uang = 1000;

        if (uang == 1000 && hari.equals("senin")) {
            System.out.println("jalan");
        } else {
            System.out.println("tidur");
        }

        if (uang == 1000 || hari.equals("senin")) {
            System.out.println("jalan");
        } else {
            System.out.println("tidur");
        }
    }
}
