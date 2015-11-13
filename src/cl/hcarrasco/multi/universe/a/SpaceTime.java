package cl.hcarrasco.multi.universe.a;

public class SpaceTime implements Runnable {
	
	private boolean endOfTimes = false;
	private double time  = 0; // time, expressed in years
	private double x     = 0; // width, expressed in KM
	private double y     = 0; // height, expressed in KM
	private double z     = 0; // depth, expressed in KM
	
	private double darkEnergyFactor = 0.001; // factor to represents expansion caused by dark energy

	@Override
	public void run() {
		
		while(!endOfTimes) {
			
			time  = time  + 0.5;
			x = x + darkEnergyFactor;
			y = y + darkEnergyFactor;
			z = z + darkEnergyFactor;
			
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
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "time: "+this.time+" space: ["+this.x+"-"+this.y+"-"+this.z+"]";
	}

}
