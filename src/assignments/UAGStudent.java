package assignments;

public class UAGStudent {
	/*
	 * Create a UAGStudent class with the following:
	 * 
	 * 1. Class Variables name (String) grade (int) principalName (String, static,
	 * default value: "Ms. McKoy") studentID (String) nextID (int, static, default
	 * value: 100)
	 * 
	 * Note: studentID is composed of the student's first initial in uppercase
	 * followed by the nextID
	 */

	String name;
	int grade;
	static String principalName = "Ms. McKoy";
	String studentID;
	static int nextID = 100;

	/*
	 * 2. Constructors Main constructor takes in name and grade only. When the main
	 * constructor is called, it generates a student's ID by combining the student's
	 * first initial in uppercase combined with the next ID. The nextID should then
	 * be increased by 1.
	 * 
	 * Example: name is "Alfonso Lewis", static variable nextID is 105 ==> studentID
	 * is A105
	 */
	
	public UAGStudent(String name, int grade) {
		this.name = name;
		this.grade = grade;
		studentID = name.substring(0,1).toUpperCase() + nextID;
		nextID++;
	}
}
