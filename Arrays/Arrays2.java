package Arrays;
// Passing Arrays to Methods

public class Arrays2 {
    public static void main(String[] args){
        int arr[] = {3, 2, 5, 1, 4};

        sum(arr);

        Book book[];
        book = new Book[3];

        book[0] = new Book("Kafka the metamorphorsis", 150, "Haley");
        book[1] = new Book("Rich Dad Poor Dad", 300, "Owen");
        book[2] = new Book("Rich Dad Poor Dad", 3, "hr");

        for (int i=0; i< book.length; i++){
            System.out.println(book[i].author + " " + book[i].title + " " + book[i].pages);
        }
    }

    public static void sum(int arr[]){
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        };
        System.out.println(sum);
    };
};

class Book {
    public String title;
    public int pages;
    public String author;

    Book(String TITLE, int PAGES, String AUTHOR){
        this.title = TITLE;
        this.author = AUTHOR;
        this.pages = PAGES;
    };
};