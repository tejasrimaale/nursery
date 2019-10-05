package mirchi;

public class Test {
	public static void main(String[] args) {
		Animal a=new Animal();
		Dog d=new Dog();
		Animal c=new Dog();
		
		a.move();
		d.move();
		c.move();
		
		//set values for dog variables
		d.setType("carnivore");
		Dog.setColor("black");
		//d.setName("puppy");
		//d.setAge(5);
		/*System.out.println(d.getType());
		System.out.println(d.getName());
		System.out.println(d.getAge());*/
		System.out.println(Dog.getColor());
	
		c.eat();
		System.out.println(d.toString());
		
	}

}
