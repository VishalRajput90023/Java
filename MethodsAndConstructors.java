package test;
class Student{
	int rollno;
	int age;
	char gender;
	int marks;
	
	
	//creating method
	void display() {
		System.out.println(rollno);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(marks);
	}
	//parameterized function
	int calculate(int rno,int mrk) {
		int sum = rno + mrk;
		return sum;
	}
	//Update details of student
	void updateDetails(int rollno,
	int age,
	char gender,
	int marks) {
		//this keyword(Access the object that invoked this method)
		this.rollno = rollno;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
		
	}
	//Constructor is called at the time of object creation
	Student(){
		rollno = 100;
		marks = 100;
		age = 100;
		gender = 'M';
	}
}
public class thinkx {

	public static void main(String[] args) {
	 Student student1;  //Referencing to a class student
	 student1 = new Student();//Allocating it in memory
	 Student student2 = new Student();
	 Student student3 = new Student();//it will invoke Student()
	 
	 //assigning values to student1 and student2
	 student1.rollno = 25;
	 student2.rollno = 50;
	 student1.marks = 95;
	 student2.marks = 80;
	 
	 //assigning values
	 student1.age = 16;
	 student2.age = 17;
	 student1.gender = 'M';
	 student2.gender = 'F';
	 

	 //Display values of student1
	 student1.display();
	 int temp = student2.calculate(12,75);
	 System.out.print(temp);	
	 student1.updateDetails(36,50,'F',15); //function call
	 student3.display();
  }
}
