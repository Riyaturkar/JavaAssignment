package com.jasdhir.example.sync;

class ThreadDemo extends Thread {
	   private Thread t;
	   private String threadName;
	   PrintDemo  PD;

	   ThreadDemo( String name,  PrintDemo pd) {
	      threadName = name;
	      PD = pd;
	   }
	  		
		
		
		
		  public void run() { PD.printCount(); System.out.println("Thread " +
		  threadName + " exiting."); }
		 
		 
		 
		 
		 			
			
		
		/*
		 * public void run() { synchronized(PD) { PD.printCount(); }
		 * System.out.println("Thread " + threadName + " exiting."); }
		 * 
		 */			 
			 
		 
	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}
