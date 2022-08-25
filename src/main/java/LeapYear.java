public class LeapYear {
    public static void main(String[] args) {
        String tekst = "Mamy rok ";
        int year = 2022;
        int number = 4;
        int modulo = year % number;

        System.out.println("Mamy rok " +year);
        System.out.println(modulo);

        if (modulo == 0){
            System.out.println("Rok " +year+ " jest przestępny");
        } else {
            System.out.println("Rok " +year+  " nie jest przestępny.");
        }

    }
}
