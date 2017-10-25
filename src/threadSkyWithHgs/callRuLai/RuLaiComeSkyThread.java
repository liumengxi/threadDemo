package threadSkyWithHgs.callRuLai;

import SkySoldier.skySoldier;

/**
 * 呼叫如来线程。
 * @author user
 *
 */
public class RuLaiComeSkyThread extends Thread {
	
	private skySoldier sky;
	public RuLaiComeSkyThread(skySoldier sky){
		this.sky = sky;
	}
	
	public void run(){
		
		sky.callRuLaiFoZu();
	}

}
