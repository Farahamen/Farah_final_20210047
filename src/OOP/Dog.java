package OOP;

public class Dog {
	
	private String name;
	public int age;
	public String kind;
	
	 Dog(String name, int age, String kind){
		
		 this.age = age;
		 this.name = name;
		 this.kind = kind;
	}
	 
	 public void setName(String names) {
		 name = names;
	 }
	 public String getName() {
		 return name;
	 }

}
