package a;

class Student {
	String name = null;
	int rollno = 0;
	boolean employed;
	public static String college;// only 1 copy

	// value object
	// Data Transfer Object
	static boolean payfees(Student s, String sem) {
		boolean b = false;
		if (sem.equals("third")) {
			b = true;
			System.out.println("  paid  fees by ........" + s.name + " " + sem);
		} else {
			b = false;
			System.out.println(" not paid  fees by ........" + s.name);
		}

		return b;

	}

}
