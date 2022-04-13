package javaPackage;

public class Encapsulation1 {
	
	// later will change the scope of private to public
	private String name; 
	
	public void setname(String a) {
		this.name =a;
		
	}
	
	// change scope from private to public
	public Object getname() {
		
		return name;
	}

}
