package practise;

public class Student {
	
	@StudentSocial("Nice name")
	private String name;
	@StudentSocial("You look older")
	private int age;
	@StudentSocial("You can work as a cargo crane")
	private int height;
	@StudentSocial("We need You to lose some weight")
	private int weight;
	
	public Student(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
	
}
