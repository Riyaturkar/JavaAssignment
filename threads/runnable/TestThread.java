package com.jasdhir.example.runnable;

public class TestThread {

	   public static void main(String args[]) {
	      ThreadDemo T1 = new ThreadDemo( "Thread-1"); // new
	     T1.start(); // started or runnable 
	    //  T1.run(); // this will be a noraml method call not the threaded call
	      
	      
	      ThreadDemo T2 = new ThreadDemo( "Thread-2");
	      T2.start();
	   }   
	}
