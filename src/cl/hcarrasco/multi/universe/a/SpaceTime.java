package cl.hcarrasco.multi.universe.a;

public class SpaceTime implements Runnable{
	
	private boolean endOfTimes = false;
	private double time  = 0; // expressed in years
	private double space = 0; // expressed in km2
	private double darkEnergyFactor = 0.001; // factor to represents expansion caused by dark energy

	@Override
	public void run() {
		
		while(!endOfTimes){
			
			time  = time  + 0.5;
			space = space + darkEnergyFactor;
			darkEnergyFactor = darkEnergyFactor + 0.001;
			
			System.out.println(this.toString());
			
			// this Thread.sleep allows just see this instance of time, is not part of this universe.
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public boolean isEndOfTimes() {
		return endOfTimes;
	}

	public void setEndOfTimes(boolean endOfTimes) {
		this.endOfTimes = endOfTimes;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public double getSpace() {
		return space;
	}

	public void setSpace(double space) {
		this.space = space;
	}

	@Override
	public String toString() {
		return "time: "+this.time+" space: "+this.space; 
	}

}
