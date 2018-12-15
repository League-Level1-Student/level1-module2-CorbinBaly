
public class Superhero {
public static void main(String[] args) {
Person Charles= new Person();
Person Bob = new Person();
Person Troy = new Person();
Troy.setName("Troy");
Charles.setName("Charles");
Bob.setName("Bob");
Charles.setSuperpower("Flying");
Bob.setSuperpower("Strength");
Troy.setSuperpower("Speed");
System.out.println(Troy.toString());
System.out.println(Bob.toString());
System.out.println(Charles.toString());
}
}
