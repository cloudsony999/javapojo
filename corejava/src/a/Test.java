package a;

class Test {
	static int j = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 12;
		i++;
		System.out.println("i is " + i);
		// default package java.lang
		System.out.println(j + "     " + Test.j);
		// Student.name = "arpan";
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1.name + " " + s1.rollno + " " + s1.employed);
		System.out.println(s2.name + " " + s2.rollno + " " + s2.employed);
		s1.name = "mriganko";
		s1.rollno = 10;
		s1.employed = true;
		System.out.println(s1.name + " " + s1.rollno + " " + s1.employed);
		s2.name = "amitava";
		System.out.println(s2.name + " " + s2.rollno + " " + s2.employed);
		System.out.println(s1.name + " " + s1.rollno + " " + s1.employed + "  " + s1.college);
		System.out.println(s2.name + " " + s2.rollno + " " + s2.employed + "  " + s2.college);

		s2.college = "TECHNO";
		System.out.println(s1.name + " " + s1.rollno + " " + s1.employed + "  " + s1.college);
		System.out.println(s2.name + " " + s2.rollno + " " + s2.employed + "  " + s2.college);
		Student.college = "IEM";
		System.out.println(s1.name + " " + s1.rollno + " " + s1.employed + "  " + s1.college);
		System.out.println(s2.name + " " + s2.rollno + " " + s2.employed + "  " + s2.college);
		// member access modifieer are not allowed

		System.out.println("sem fees paid by " + s1.name + " " + Student.payfees(s1, "third"));

	}

}
