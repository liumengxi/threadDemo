package SkySoldier;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * ��ͥһ��������Ӌ��
 * @author user
 *
 */
public class skySoldier {
	
	
	private Lock lock = new ReentrantLock();
	
	private Condition cond = lock.newCondition();
	
	
	/*
	 * С��֮�g�Č��Q��
	 */
	public void withHgsMokeysKill(){
		
		System.out.println(Thread.currentThread().getName()+ "���ں���ɱ��..");
		
	}
	
	/*
	 * �쌢�c���֮�g�Č��Q�� 
	 */
	public  void someSkyPeople(){
		
		try{
			lock.lock();
			System.out.println("����� " + Thread.currentThread().getName() + " �c��մ��....");
			cond.await();
			System.out.println(Thread.currentThread().getName() + "�������ݑ�...");
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	/*
	 * ֪ͨ�쌢�ݑ�
	 */
	public void someSkyPeopleSignal(){
		try{
			
			lock.lock();
			cond.signalAll();
		}finally{
			lock.unlock();
		}
        
	}
	/*
	 * ��������~
	 */
	public void callRuLaiFoZu(){
		try{
			lock.lock();
			System.out.println("��ʴ���� "  + Thread.currentThread().getName() + "ȥ����Ո�����潵������!");
			System.out.println("��ʴ�������ɼҽ����ĵȴ���.........");
			cond.await();
			System.out.println("�������٣��黨ָһ������������������");
			System.out.println("������գ������ѹ����ָɽ��~~~~��");
			System.out.println("�������٣�����ƽ����");
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}

}
