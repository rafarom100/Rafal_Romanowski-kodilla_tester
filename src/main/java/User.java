public class User {
    public String name;
    public int age;

    public User (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User piotr = new User("Piotr", 21);
        User pawel = new User("Paweł", 30);
        User marcin = new User("Marcin", 17);
        User anna = new User("Anna", 40);
        User paulina = new User("Paulina", 22);
        User wiktor = new User("Wiktor", 68);
        User donald = new User("Donald", 18);
        User kunegunda = new User("Kunegunda", 53);
        User waldek = new User ("Waldek", 11);

        User[] users = {piotr, pawel, marcin, anna, paulina, wiktor, donald, kunegunda, waldek};

        int sum = 0;
         for (int i = 0; i< users.length; i++) {
             sum = sum + users[i].age;
        }
         double avg = (double)  sum / users.length;
                System.out.println("Średnia wieku: " + avg);

         for (int i=0; i< users.length; i++) {
             if (users[i].age <avg) {
                 System.out.println(users[i].name);
             }
         }





    }

}
