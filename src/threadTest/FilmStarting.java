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
			System.out.println("大戏即将开始……");
			Thread.sleep(2000);
			System.out.println("五百年前。。。");
			Thread.sleep(1000);
			hgsMonkeys hgs = new hgsMonkeys();
			
			skySoldier sky = new skySoldier();
			
			System.out.println("齐天大圣与玉皇大帝反目成仇，兵戎相见！");
			Thread.sleep(1000);
			System.out.println("于是悟空派出众多猴子猴孙上天庭~");
			Thread.sleep(1000);
			System.out.println("一言不合、便开始厮杀。");
			Thread.sleep(1000);
			System.out.println("厮杀中......");
			
			//天兵天将与猴子猴孙兵戎相见....
			hgsThread ht = new hgsThread(hgs);
			skyThread skyt = new skyThread(sky);
			skyt.setName("十萬天兵天將 ");
			ht.start();
			skyt.start();
			
			//玉帝派众仙家一一迎战，却全部败北~
            tianDiThread FourKing = new tianDiThread(sky);//四大天王
            tianDiThread els = new tianDiThread(sky);
            LiJingFamliyThread ljf = new LiJingFamliyThread(sky);//李靖父子
            FourKing.setName("四大天王");
            els.setName("二郎显圣真君");
            ljf.setName("李靖、哪吒三太子");

            //一一迎战
            FourKing.start();
            els.start();
            ljf.start();
			Thread.sleep(1000);
			
			//悟空出战！
			sunWuKongThread wuKong = new sunWuKongThread(hgs);
			wuKong.start();
			Thread.sleep(2000);
			//众仙家皆败北，全部休战！
			TianDiSignalStop tdSign = new TianDiSignalStop(sky);
			tdSign.start();
			Thread.sleep(2000);
			
			//悟空休战，准备攻入凌霄宝殿！
			wuKongSignalStop wkSign = new wuKongSignalStop(hgs);
			wkSign.start();
			
			//悟空再次出战！目标--->"玉皇大帝"
			Thread.sleep(5000);
			sunWuKongThread wuKongAgain = new sunWuKongThread(hgs);
			wuKongAgain.setName("loseWuKong");
			wuKongAgain.start();
			
			RuLaiComeSkyThread rl = new RuLaiComeSkyThread(sky);
			rl.setName(" 太白金星 ");
			rl.start();
			
			skyThread.stopWar = true; //玉帝苦苦无法抵挡
			Thread.sleep(3000);
			
			//如来驾临，如沐春风！
			TianDiSignalStop rlCome = new TianDiSignalStop(sky);
			rlCome.start();
			hgsThread.loseTag = true;//猴儿们均回傲来国
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
