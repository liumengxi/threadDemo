package threadSkyWithHgs.WuKongAndTianDi;

import SkySoldier.skySoldier;

/**
 * ��������𾀳�
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
