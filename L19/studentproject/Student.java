//pojo class

class Student{
private int rno;
private String name;
private int marks;

public Student(){}

public Student(int rno, String name, int marks){
this.rno = rno;
this.name = name;
this.marks = marks;

}

public String toString(){
    return rno + " " + name + " " + marks;
}

//getter
public int getRno(){
return rno;
}
public String getName(){
return name;
}
public int getMarks(){
return marks;
}

//setter
public void setRno(int rno){
this.rno = rno;
}
public void setName(String name){
this.name = name;
}
public void setMarks(int marks){
this.marks = marks;
}

}



