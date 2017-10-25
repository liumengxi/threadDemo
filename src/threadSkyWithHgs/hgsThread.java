package threadSkyWithHgs;

import HgsSmallMonkey.hgsMonkeys;

/**
 * 花果山作战线程
 * @author user
 *
 */
public class hgsThread extends Thread {
	
	private hgsMonkeys hgs;
	
	public static boolean loseTag = false;
	
	public hgsThread(hgsMonkeys hgs){
		this.hgs = hgs;
	}

	@Override
	public void run() {
		try {
		for(int i = 0 ; i < 50; i ++){
			
			if(loseTag == true){
				System.out.println("悟空被如来佛祖压入五指山下，猴儿们也各自回到傲来国花果山，等待他们的大王回来~。");
				break;
			}
			  hgs.withSkySoldierKill();
				Thread.sleep(2000);
			} 
		}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

