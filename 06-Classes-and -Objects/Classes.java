public class Classes {

	public static void main(String[] args) {
		
		Student stu1 = new Student("priya",1234,80.67f);
		Student stu2 = new Student(stu1);
		Student stu3 = new Student();
		Student one = new Student();
		Student two = one;
		
		one.name ="something Something";
		System.out.println(two.name);
		
        System.out.println(stu1.rno);
        System.out.println(stu1.name);
        System.out.println(stu3.marks);
		
 
	}

}

class Student{
	int rno;
    String name;
    float marks;
    
    Student()
    {
    	//calling another constructor  here this keyword is replaced with Student constructor 
    	this ("priya",13,60.43f);
    }
    
    Student(Student other)
    {
    	this.name=other.name;
    	this.rno=other.rno;
    	this.marks=other.marks;
    }
    
    Student(String name,int rno,float marks){
    	this.name=name;
		this.rno=rno;
		this.marks=marks;
    	
    }
    
}

