package threadSkyWithHgs;

import SkySoldier.skySoldier;

/**
 * ����콫��ս�߳�
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
			 * ��ۺ��ް취���Ѽƻ�֪ͨ������������
			 */
			if(stopWar == true){
				System.out.println("����콫�ڽڰ��ˣ��վ��ֵ���ס��յ�ǿ�ҹ���!~");
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

