//constructor (Special method)
//name of class and constructor is same
// good programming practice
//reduces code of line

class Book{
int id;
String title;
String author;
double price;

Book(int id , String title,String author,double price){
this.id = id;
this.title = title;
this.author = author;
this.price = price;
}

void showData(){
System.out.println(id + " " + title + " " + author + " " + price);
}
}

class BookTest2{
public static void main(String args[]){
Book b1 = new Book(10, " the boy who loved", " Durjoy Dutta", 150.00);
b1.showData();

Book b2 = new Book(20, " the burnt diary", " Durjoy Dutta", 160.00);
b2.showData();
}
}