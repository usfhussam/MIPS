package registers;

public class Register {
 private int value;
 private String name;
 public Register(int value) {
	 this.setValue(value);
 }
 
 public Register() {
	 this.setValue(0);
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
