package threadSkyWithHgs.WuKongAndTianDi;

import SkySoldier.skySoldier;

/**
 * ����쌢���𾀳�
 * @author user
 *
 */
public class tianDiThread extends Thread {
	
	
	private skySoldier sky;
	public tianDiThread(skySoldier sky){
		this.sky = sky;
	}
	public void run(){
		sky.someSkyPeople();
	}

}
