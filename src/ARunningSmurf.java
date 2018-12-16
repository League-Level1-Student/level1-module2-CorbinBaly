
public class ARunningSmurf {

public static void main(String[] args) {
Smurf Handy= new Smurf("Handy");
Smurf Papa_Smurf= new Smurf("Papa Smurf");
Smurf Smurfette=new Smurf("Smurfette");
System.out.println("Papa Smurf is a " + Papa_Smurf.isGirlOrBoy() + " and their hat is " + Papa_Smurf.getHatColor());
System.out.println("Smurfette is a " + Smurfette.isGirlOrBoy() + " and their hat is " + Smurfette.getHatColor());
System.out.println("Handy is a " + Handy.isGirlOrBoy() + " and their hat is " + Handy.getHatColor());
}
}
