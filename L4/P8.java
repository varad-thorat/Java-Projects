//waoojp for class Student:
//var : rno and name 
//methods: setData() and showData()

class Book{
int id;
String title, author;
double price;

void setData(int i, String t, String a, double p){
id = i;
title = t;
author = a;
price = p;
}

void showData(){
System.out.println(id + " " +title+ " "+ author+ " "+ price);
}
}

class P8{
public static void main(String args[]){
Book b1 = new Book();
b1.setData(001 , " the boy who loved", " Durjoy Dutta", 150.00);
b1.showData();

Book b2 = new Book();
b2.setData(002 , " the boy who lived", " Durjoy Dutta", 120.00);
b2.showData();
}
}