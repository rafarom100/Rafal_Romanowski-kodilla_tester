public class SimpleArray {
    public static void main(String[] args) {

        String[] names = new String[7];
        names[0] = "Piotr";
        names[1] = "Paweł";
        names[2] = "Gargamel";
        names[3] = "Zygfryd";
        names[4] = "Sebastian";
        names[5] = "Anna";
        names[6] = "Maria";

        String name = names[2];

        System.out.println(name);

        int numberOfElements = names.length;

        System.out.println("Moja tablica zawiera " +numberOfElements +" elementów.");

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }




    }
}