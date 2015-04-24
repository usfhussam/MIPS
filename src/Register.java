
public class Register {
 private int value;
 private String name;
 public Register(int value, String name) {
	 this.setValue(value);
	 this.setName(name);
 }
public int getValue() {
	return value;
}
public void setValue(int value) {
	if(name.equals("$0"))
		return;
	this.value = value;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
}
