package threadSkyWithHgs;

import HgsSmallMonkey.hgsMonkeys;

/**
 * ����ɽ��ս�߳�
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
				System.out.println("��ձ���������ѹ����ָɽ�£������Ҳ���Իص�����������ɽ���ȴ����ǵĴ�������~��");
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

