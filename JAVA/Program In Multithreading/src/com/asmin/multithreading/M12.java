 package com.asmin.multithreading;

class B{
	boolean flag = true;
	int count = 0;
	public synchronized void produce() {
		try{
			while(true) {
				if (flag==true) {
					count=count+1;
					System.out.println("Producer produce item = "+count);
					flag=false;
					notify();
					wait();
				}else {
					wait();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
    public synchronized void consume() {
    	try {
    		while(true) {
    			if(flag==true) {
    				wait();
    			}else {
    				System.out.println("Consumer Consumed item = "+count);
    				flag = true;
    				notify();
    				wait();
    			}
    		}
    		
    	}catch(Exception e) {
    		e.printStackTrace();	
    	} 		
	}
}
class Producer extends Thread{
	B b;
	Producer(B b) {
		this.b= b;
	}
	public void run() {
		b.produce();
	}
}
class Consumer extends Thread{
	B b;
	Consumer(B b){
		this.b=b;
	}
	public void run() {
		b.consume();
	}
	
}
public class M12 {
	public static void main(String[] args) {
		B b = new B();
		Producer producer = new Producer(b);
		Consumer consumer = new Consumer(b);
		
		producer.start();
		consumer.start();
	}

}
