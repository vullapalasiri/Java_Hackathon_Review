Topic :  Java Encapsulation
------------------------------------------------------------------
Encapsulation is the process of wrapping data (variables) and methods into a single unit (class) and restricting direct access to the data.
------------------------------------------------------------------------
In Java, encapsulation is mainly achieved by:

		Declaring variables as private
	        Providing public getter and setter methods to access them.
---------------------------------------------------------------------------------
class Student {

    // Private data
    private String name;
    private int age;

    // Setter method
    public void setName(String name) 
   {
        this.name = name;
    }

    // Getter method
    public String getName() 
    {
        return name;
    }

    // Setter method
    public void setAge(int age) 
   {
        this.age = age;
    }

    // Getter method
    public int getAge() {
        return age;
    }
}

class TestEncapsulation 
 {
    public static void main(String[] args) 
    {

        Student s = new Student();

        s.setName("Sai");
        s.setAge(13);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}


class Student 
{
int rollno;
String name;
void Read (int rollno,String name)
{
this.rollno = rollno;
this.name = name;
}
void display()
{ System.out.println(rollno+" "+name);
  }
}




class TestThis
{
public static void main (String args[])
{
Student s1 = new Student();
s1.Read(1,"sai");
s1 display();
   }
}



class Student
{
void Student()
{
System.out.println("my name is Tholisri");
System.out.println("my roll no is 678");
}
} 
class TestConstructor 
e


































































































class Hello{
 public static void main(String args[]){
    System.out.println("Hello world");
   }
}





































+
