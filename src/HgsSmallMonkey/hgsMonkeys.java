package HgsSmallMonkey;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ����ɽһ��������Ӌ��
 * @author user
 *
 */
public class hgsMonkeys {
	
	
	private Lock lock = new ReentrantLock();
	
	private Condition cond = lock.newCondition();

	/*
	 * �R���c���֮�g�Č��Q
	 */
	public void withSkySoldierKill(){
		
		System.out.println("���Ӻ�����������콫��ɱ��..");
		
	}
	

	/*
	 * ��ճ���
	 */
	public  void SunKill(){
		try{
			lock.lock();
			System.out.println("��ճ�ս..");
			cond.await();
			if("loseWuKong".equals(Thread.currentThread().getName())){
				System.out.println("��Ք�������ѹ����ָɽ�£�����Ե�˼���ʩ�ȡ�~~~~�������ӷ�......");
			}else{
				System.out.println("��Ց��٣���ս..");
			}
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	/*
	 * ֪ͨ����ݑ�
	 */
	public void signalSun(){
		try{
			lock.lock();
			cond.signal();
		}finally{
			lock.unlock();
		}
		
		
	}

}
