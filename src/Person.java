
public class Person {
private String Name;
private String Superpower;
public String getName() {
	return Name;
}
public String getSuperpower() {
	return Superpower;
}
public void setName(String name) {
	Name=name;
}
public void setSuperpower(String superpower) {
	Superpower=superpower;
}
public String toString() {
	return Name +" has mad " +Superpower+ " skills";
}
}
