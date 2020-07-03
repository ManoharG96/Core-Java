package com.dxctechnology.interthreadcommunication;


class Chat {

	boolean flag = false;

	public synchronized void Question(String message) {
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(message);
		flag = true;
		notify();
	}

	public synchronized void Answer(String message) {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(message);
		flag = false;
		notifyAll();
	}
}

class Person1 implements Runnable {
	Chat message;
	String[] information = { "Hi", "How are you ?", "I am also doing fine!" };

	public Person1(Chat message) {
		this.message = message;
		new Thread(this, "Question").start();
	}

	public void run() {
		for (int i = 0; i < information.length; i++) {
			message.Question("Person 1: "+information[i]);
		}
	}

}

class Person2 implements Runnable {
	Chat message;
	String[] information = { "Hi", "I am good, what about you?", "Great!" };

	public Person2(Chat message) {
		this.message = message;
		new Thread(this, "Answer").start();
	}

	public void run() {
		for (int i = 0; i < information.length; i++) {
			message.Answer("Person2 :"+information[i]);
		}
	}

}
public class ThreadCommunicationDemo {
	public static void main(String[] args) {
		Chat message = new Chat();
		new Person1(message);
		new Person2(message);
		//System.out.println("Person 1: "+person1);
		//System.out.println("Person 2: "+person2);
	}
}