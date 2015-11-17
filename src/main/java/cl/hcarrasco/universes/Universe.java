package cl.hcarrasco.universes;

import java.util.ArrayList;
import cl.hcarrasco.universes.Particle;

public class Universe {

	private double totalParticlesOfUniverse;
	private ArrayList<Particle> materInUniverse;
	private SpaceTime spaceTime;
	
	public void bigBang(){
		
		totalParticlesOfUniverse = (Math.random() * 100 + 1);
		materInUniverse = new ArrayList<Particle>();
		startSpaceTime();
		
		for (int i=0; i<totalParticlesOfUniverse; i++){
			
			Location location = new Location();
			location.x = Math.random() * spaceTime.getWidth() + 0;
			location.y = Math.random() * spaceTime.getHeight()+ 0;
			location.z = Math.random() * spaceTime.getDepth() + 0;
			materInUniverse.add(new Particle().setName("alpha_"+i).setStructure("10110").setLocation(location));
			
		}
		seeMater();
	}
	
	private void seeMater(){
		for(Particle p : materInUniverse){
			System.out.println("---------");
			System.out.println(p.toString());
		}
	}
	
	private void startSpaceTime(){
		spaceTime = new SpaceTime();
		(new Thread(spaceTime)).start();
	}
	
	public double getTotalParticlesOfUniverse() {
		return totalParticlesOfUniverse;
	}

	public void setTotalParticlesOfUniverse(double totalParticlesOfUniverse) {
		this.totalParticlesOfUniverse = totalParticlesOfUniverse;
	}

	public ArrayList<Particle> getMaterInUniverse() {
		return materInUniverse;
	}

	public void setMaterInUniverse(ArrayList<Particle> materInUniverse) {
		this.materInUniverse = materInUniverse;
	}
	
}