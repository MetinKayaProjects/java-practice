package book;

public class Person {
	String name;
	int age = 25;
	
//	public Person() {
//		this.name=name;
//		//this.age=age;
//	}
	
	public Person(String name) {
		//this();
		setName(name);
	}
	public Person(String name, int age) {
		this(name);
		setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String show() {
		return name + " " + age + " ";
	}
	public static void main(String[] args) {
		Person p1 = new Person("Jesee");
		Person p2 = new Person("Walter", 52);
		System.out.println(p1.show());
		System.out.println(p2.show());
	}

}
