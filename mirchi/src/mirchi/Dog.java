package mirchi;

public class Dog extends Animal{
	String type;
	String name;
	int age;
	static String color;
	
public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		Dog.color = color;
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



public void move() {
	System.out.println("i am move from dog");
}

@Override
public String toString() {
	return "Dog [type=" + type + ", name=" + name + ", age=" + age + "]";
}



	
	 
}
