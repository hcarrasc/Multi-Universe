package cl.hcarrasco.multi.universe.a;

import java.util.ArrayList;

public class Universe {

	private double totalParticlesOfUniverse;
	private ArrayList<Particle> materInUniverse;
	private SpaceTime spaceTime;
	
	public void bigBang(){
		
		totalParticlesOfUniverse = (Math.random() * 100 + 1);
		materInUniverse = new ArrayList<Particle>();
		
		for (int i=0; i<totalParticlesOfUniverse; i++){
			materInUniverse.add(new Particle().setName("alpha_"+i).setStructure("10110"));
		}
        
		startSpaceTime();
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