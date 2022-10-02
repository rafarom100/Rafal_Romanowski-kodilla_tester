public class UserRR {
    public String name1;
    public int age1;

    public UserRR (String  name1, int age1) {
        this.name1 = name1;
        this.age1 = age1;
    }
    public static void main(String[] args) {
        User pawel = new User("Paweł", 15);
        User michal = new User("Michał", 20);
        User anna = new User("Anna", 10);

        User[] users = {pawel, michal, anna};

        int sum = 0;
        for (int i=0; i<users.length; i++){
            sum = sum + users[i].age;
        }
        double avg = (double) sum/users.length;
        System.out.println(avg);

        for (int i=0; i< users.length; i++ ){
            if (users[i].age > avg) {
                System.out.println(users[i].name);
            }

        }

    }
}
