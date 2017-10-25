package threadTest;

import threadSkyWithHgs.hgsThread;
import threadSkyWithHgs.skyThread;
import threadSkyWithHgs.WuKongAndTianDi.LiJingFamliyThread;
import threadSkyWithHgs.WuKongAndTianDi.sunWuKongThread;
import threadSkyWithHgs.WuKongAndTianDi.tianDiThread;
import threadSkyWithHgs.callRuLai.RuLaiComeSkyThread;
import threadSkyWithHgs.signalStop.TianDiSignalStop;
import threadSkyWithHgs.signalStop.wuKongSignalStop;
import HgsSmallMonkey.hgsMonkeys;
import SkySoldier.skySoldier;

public class FilmStarting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
			System.out.println("��Ϸ������ʼ����");
			Thread.sleep(2000);
			System.out.println("�����ǰ������");
			Thread.sleep(1000);
			hgsMonkeys hgs = new hgsMonkeys();
			
			skySoldier sky = new skySoldier();
			
			System.out.println("�����ʥ����ʴ�۷�Ŀ�ɳ𣬱��������");
			Thread.sleep(1000);
			System.out.println("��������ɳ��ڶ���Ӻ�������ͥ~");
			Thread.sleep(1000);
			System.out.println("һ�Բ��ϡ��㿪ʼ��ɱ��");
			Thread.sleep(1000);
			System.out.println("��ɱ��......");
			
			//����콫����Ӻ���������....
			hgsThread ht = new hgsThread(hgs);
			skyThread skyt = new skyThread(sky);
			skyt.setName("ʮ�f����쌢 ");
			ht.start();
			skyt.start();
			
			//��������ɼ�һһӭս��ȴȫ���ܱ�~
            tianDiThread FourKing = new tianDiThread(sky);//�Ĵ�����
            tianDiThread els = new tianDiThread(sky);
            LiJingFamliyThread ljf = new LiJingFamliyThread(sky);//�����
            FourKing.setName("�Ĵ�����");
            els.setName("������ʥ���");
            ljf.setName("�����߸��̫��");

            //һһӭս
            FourKing.start();
            els.start();
            ljf.start();
			Thread.sleep(1000);
			
			//��ճ�ս��
			sunWuKongThread wuKong = new sunWuKongThread(hgs);
			wuKong.start();
			Thread.sleep(2000);
			//���ɼҽ԰ܱ���ȫ����ս��
			TianDiSignalStop tdSign = new TianDiSignalStop(sky);
			tdSign.start();
			Thread.sleep(2000);
			
			//�����ս��׼�������������
			wuKongSignalStop wkSign = new wuKongSignalStop(hgs);
			wkSign.start();
			
			//����ٴγ�ս��Ŀ��--->"��ʴ��"
			Thread.sleep(5000);
			sunWuKongThread wuKongAgain = new sunWuKongThread(hgs);
			wuKongAgain.setName("loseWuKong");
			wuKongAgain.start();
			
			RuLaiComeSkyThread rl = new RuLaiComeSkyThread(sky);
			rl.setName(" ̫�׽��� ");
			rl.start();
			
			skyThread.stopWar = true; //��ۿ���޷��ֵ�
			Thread.sleep(3000);
			
			//�������٣����崺�磡
			TianDiSignalStop rlCome = new TianDiSignalStop(sky);
			rlCome.start();
			hgsThread.loseTag = true;//����Ǿ��ذ�����
			Thread.sleep(2000);
			
			
			wuKongSignalStop loseWuKong = new wuKongSignalStop(hgs);
			loseWuKong.start();
			Thread.sleep(3000);
			
			
			System.out.println("End........");
			
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		
		

	}

}
