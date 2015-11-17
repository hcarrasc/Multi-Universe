package cl.hcarrasco.universes;

import org.apache.log4j.Logger;

public class SpaceTime implements Runnable {
	
	final static Logger logger = Logger.getLogger(SpaceTime.class);
	
	private boolean endOfTimes = false; // true stopped the time thread.
	private double time  = 0; // time, expressed in years
	private double width = 0; // width, expressed in KM
	private double height= 0; // height, expressed in KM
	private double depth = 0; // depth, expressed in KM
	
	private double darkEnergyFactor = 0.001; // factor to represents expansion caused by dark energy

	//@Override 
	public void run() {
		
		while(!endOfTimes) {
			
			time  = time  + 0.5;
			width = width + darkEnergyFactor;
			height = height + darkEnergyFactor;
			depth = depth + darkEnergyFactor;
			darkEnergyFactor = darkEnergyFactor + 0.001f;
			logger.info(this.toString());
			
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
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	@Override
	public String toString() {
		return "time: "+this.time+" space: [x="+String.format("%.3f", this.width)+", y="+String.format("%.3f", this.height)+", z="+String.format("%.3f", this.depth)+"]";
	}

}
