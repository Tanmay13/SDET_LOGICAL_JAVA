package JAVATPOINT;

public class ConstructorChainingusingThis {
	int id, Age;
	String Name, Address;

	public ConstructorChainingusingThis(int id) {
		this.id = id;

	}

	public ConstructorChainingusingThis(int id, int Age) {
		this(id);
		this.Age = Age;

	}

	public ConstructorChainingusingThis(int id, int Age, String Name, String Address)

	{
		this(id, Age);
		this.Name = Name;
		this.Address = Address;

	}

	public static void main(String[] args) {

		ConstructorChainingusingThis cs = new ConstructorChainingusingThis(20, 121, "Tanmay", "Pune");

		System.out.println("ID:" + cs.id + "Name:" + cs.Name + "Age:" + cs.Age + "Address:" + cs.Address);
	}

}
