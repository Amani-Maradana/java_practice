package assignments;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Person implements Comparator{
	private int id;
	private String name;
	private String email;
	public Person() {
		super();
	}



	public Person(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}



	@Override
	public int hashCode() {
		return Objects.hash(email, id, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name);
	}



	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}
	
	public static void main(String[] args) {
		TreeSet<Person> t = new TreeSet<>(new Person());
		t.add(new Person(102, "Charlie", "charlie@example.com"));
		t.add(new Person(101, "Alice", "alice@example.com"));
		t.add(new Person(103, "Bob", "bob@example.com"));
		t.add(new Person(104, "David", "david@example.com"));
		t.add(new Person(105, "Eve", "eve@example.com")); // 
		t.add(new Person(106, "Alice", "alice@example.com"));
		System.out.println(t);
		for(Person p:t) {
			System.out.println(p);
		}
	}

}
