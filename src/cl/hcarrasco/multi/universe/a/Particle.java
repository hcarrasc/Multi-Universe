package cl.hcarrasco.multi.universe.a;

import java.util.UUID;

public class Particle {
	
	private String name;
	private String structure;
	private String uuid;
	
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
		return "name: "+ this.getName()+" structure: "+this.getStructure()+" uid: "+this.getUUID();
	}
}