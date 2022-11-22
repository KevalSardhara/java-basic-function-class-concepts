import java.util.Scanner;

import Student.Book;


public class Class_Counstructer1
{
    public static void main(String[] args) {
        
        System.out.println("Hiii Your are looking Good");
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        Student s1 = new Student();
        Student s2 = new Student(a,b,c);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        Student s3 = new Student(a,b,c);

        Student.Book b1 = s1.new Book();
        Student.Book b2 = s2.new Book();
        Student.Book b3 = s3.new Book();
        b1.dataPrint();
        b2.dataPrint();
        b3.dataPrint();


        Student.Book.Page p1 = b1.new Page();
        Student.Book.Page p2 = b2.new Page();
        Student.Book.Page p3 = b3.new Page();
        p1.findData();
        p2.findData();
        p3.findData();

    }    
}

class Student
{
    public int x,y,z;
    public Student()
    {
        System.out.println("Yes Right");
    }
    public Student(int a,int b,int c)
    {
        x=a;
        y=b;
        z=c;
        System.out.println("Yes Right Good");
    }
    class Book
    {
        public void dataPrint()
        {
            System.out.println(x+" "+y+" "+z);
        }


        public class Page
        {   

            public Page()
            {
                System.out.println("This is the Consture of this field");
            }

            public void findData()
            {
                System.out.println(x+" "+y+" "+z);
                System.out.println("Thunk you for your goal achive");
            }

        }
    }
}
