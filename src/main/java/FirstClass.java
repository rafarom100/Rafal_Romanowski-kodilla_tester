public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,1000, 2021);
        System.out.println(notebook.weight + " g  " + notebook.price + " PLN  " + notebook.year + " r");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.comparePriceAndYear();

        Notebook heavyNotebook = new Notebook(1200, 1500, 2010);
        System.out.println(heavyNotebook.weight + " g  " + heavyNotebook.price + " PLN  " + heavyNotebook.year + " r");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        heavyNotebook.comparePriceAndYear();

        Notebook oldNotebook = new Notebook(1600, 500, 2000);
        System.out.println(oldNotebook.weight + " g  " + oldNotebook.price + " PLN  " + oldNotebook.year + " r");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        oldNotebook.comparePriceAndYear();


    }
}