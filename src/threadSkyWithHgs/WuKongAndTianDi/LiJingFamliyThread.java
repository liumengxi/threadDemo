package threadSkyWithHgs.WuKongAndTianDi;

import SkySoldier.skySoldier;

/**
 * 李靖家族作戰線程
 * @author user
 *
 */
public class LiJingFamliyThread extends Thread {

	
	private skySoldier sky;
	public LiJingFamliyThread(skySoldier sky){
		this.sky = sky;
	}
	public void run(){
		sky.someSkyPeople();
	}
	
}
