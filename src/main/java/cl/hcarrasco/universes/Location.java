package cl.hcarrasco.universes;

public class Location {

	public double x = 0; // width component, expressed in KM
	public double y = 0; // height component, expressed in KM
	public double z = 0; // depth component, expressed in KM
	
	@Override
	public String toString() {
		return "[x="+String.format("%.3f", x)+", y="+String.format("%.3f", y)+", z="+String.format("%.3f", z)+"]";
	}
}
