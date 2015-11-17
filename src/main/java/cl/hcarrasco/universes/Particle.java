package cl.hcarrasco.universes;

import java.util.UUID;

public class Particle {
	
	private String name;       // or type of particle
	private String structure;  // representation of how is composed this particle
	private String uuid;
	private Location location; // where is located this particle in space-time, for now will accept just one location. 
	
	public Location getLocation() {
		return location;
	}
	public Particle setLocation(Location location) {
		this.location = location;
		return this;
	}
	public Particle() {
		setUUID();
	}
	public String getName() {
		return name;
	}
	public Particle setName(String name) {
		this.name = name;
		return this;
	}
	public String getStructure() {
		return structure;
	}
	public Particle setStructure(String structure) {
		this.structure = structure;
		return this;
	}
	public String getUUID() {
		return uuid;
	}
	private void setUUID() {
		UUID id = UUID.randomUUID();
	    uuid = id.toString();
	}
	
	@Override
	public String toString() {
		return "name: "+ this.getName()+" structure: "+this.getStructure()+" location: "+this.location.toString();
	}
}