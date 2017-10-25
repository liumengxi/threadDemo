package threadSkyWithHgs.signalStop;

import HgsSmallMonkey.hgsMonkeys;

/**
 * Í¨ÖªÐÝÕ½
 * @author user
 *
 */
public class wuKongSignalStop extends Thread {
	
	private hgsMonkeys hs;
	
	public wuKongSignalStop(hgsMonkeys hs){
		this.hs = hs;
	}
	
	public void run(){
		hs.signalSun();
	}

}
