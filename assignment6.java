class Book {
    String title;
    String author;
    double price;
    public Book(String title){
        this.title=title;
        this.author="Unknown";
        this.price= 0.0;
    }
    public Book(String title, String author){
        this.title= title;
        this.author= author;
        this.price =0.0;
    }
    public Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void displayInfo(){
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: " + price);
    }

    public static void main(String[] args){

        Book book1=new Book("c++");
        Book book2=new Book("java", "abc");
        Book book3=new Book("python","xyz",599);

    
        System.out.println("Book 1:");
        book1.displayInfo();
        System.out.println();

       

        System.out.println("Book 2:");
        book2.displayInfo();
        System.out.println();

        

        System.out.println("Book 3:");
        book3.displayInfo();
        System.out.println();
    }
}

