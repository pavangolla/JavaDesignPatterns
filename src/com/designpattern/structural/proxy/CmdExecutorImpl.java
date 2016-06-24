package com.designpattern.structural.proxy;

import java.io.IOException;

/**
 * Created by pgangadhar on 5/31/16.
 */
public class CmdExecutorImpl implements CmdExecutor {

	@Override public void runCmd(String cmd) throws IOException{
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "Command Executed");
	}
}
