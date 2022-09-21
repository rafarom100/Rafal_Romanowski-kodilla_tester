public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weihgt, int price, int year) {
        this.weight = weihgt;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price >=600 && this.price < 1000){
            System.out.println("The price is very good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight <600) {
            System.out.println("This notebook is light.");
        } else if (this.weight >=600 && this.weight <900) {
            System.out.println("This notebook is not heavy.");
        }else {
            System.out.println("This notebook is very heavy.");

        }

    }
    public void checkYear() {
        if (this.year > 2020) {
            System.out.println("This notebook is young.");
        } else if (this.year <= 2020 && this.year > 2010) {
            System.out.println("This notebook is ok.");
        } else {
            System.out.println("This notebook is very old.");
        }
    }
    public void comparePriceAndYear() {
        if (this.price >= 1400 && this.year >= 2015) {
            System.out.println("This notebook is to expensive");
        } else if (this.price < 1400 && this.year < 2015) {
            System.out.println("This notebook is for me.");
        } else {
            System.out.println("This notebook is not for me.");
        }
    }
}