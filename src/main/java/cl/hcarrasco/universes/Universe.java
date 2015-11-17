package cl.hcarrasco.universes;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import cl.hcarrasco.universes.Particle;

public class Universe {

	final static Logger logger = Logger.getLogger(Universe.class);
	
	private double totalParticlesOfUniverse;
	private ArrayList<Particle> materInUniverse;
	private SpaceTime spaceTime;
	
	public void bigBang(){
		
		totalParticlesOfUniverse = Math.round((Math.random() * 100 + 1));
		materInUniverse = new ArrayList<Particle>();
		logger.info("Started with "+totalParticlesOfUniverse+" particles around this universe");

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
			logger.info("Mater: "+p.toString());
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