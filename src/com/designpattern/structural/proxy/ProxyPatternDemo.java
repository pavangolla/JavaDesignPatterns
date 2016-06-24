package com.designpattern.structural.proxy;

/**
 * Created by pgangadhar on 5/31/16.
 */
public class ProxyPatternDemo {

	public static void main(String [] args) {
		ImageProxy imageProxy = new ImageProxy("PGLogo.jpg");
		imageProxy.display();
		System.out.println(" ");
		//display again this time it wont load the image again
		imageProxy.display();

		//Command Executor Test
		CmdExecutor cmdExecutorImpl = new CmdExecutorProxy("Pavan", "abc");
		try {
			cmdExecutorImpl.runCmd("ls -lrt");
			cmdExecutorImpl.runCmd("rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
