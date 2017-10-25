package threadSkyWithHgs;

import SkySoldier.skySoldier;

/**
 * 天兵天将作战线程
 * @author user
 *
 */
public class skyThread extends Thread {

	private skySoldier sky;
	
	public static boolean stopWar = false;
	
	public skyThread(skySoldier sky){
		this.sky = sky;
	}
	
	@Override
	public void run() {
		try {
		for(int i = 0 ; i < 50; i ++){
			/**
			 * 天帝毫无办法，已计划通知西天如来佛祖
			 */
			if(stopWar == true){
				System.out.println("天兵天将节节败退，终究抵挡不住悟空的强烈攻势!~");
				break;
			}
			
			sky.withHgsMokeysKill();
			Thread.sleep(2000);
			
		}
		} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

