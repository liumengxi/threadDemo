package threadSkyWithHgs.signalStop;

import SkySoldier.skySoldier;

/**
 * ��۷��ݑ�
 * @author user
 *
 */
public class TianDiSignalStop extends Thread {
	
	private skySoldier sky;
	public TianDiSignalStop(skySoldier sky){
		this.sky = sky;
	}
	public void run(){
		
		sky.someSkyPeopleSignal();
	
	}

}
