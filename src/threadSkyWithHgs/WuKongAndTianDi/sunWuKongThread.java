package threadSkyWithHgs.WuKongAndTianDi;

import HgsSmallMonkey.hgsMonkeys;

/**
 * ��ճ��𾀳�
 * @author user
 *
 */
public class sunWuKongThread extends Thread {
	
	private hgsMonkeys hs ;
	
	public sunWuKongThread(hgsMonkeys hs){
		this.hs = hs;
	}
	
	public void run(){
		
		hs.SunKill();
	}

}
