package com.designpattern.structural.proxy;

import java.io.IOException;

/**
 * Created by pgangadhar on 5/31/16.
 */
public class CmdExecutorProxy implements CmdExecutor {
	private boolean isAdmin;
	private CmdExecutorImpl cmdExecutorImpl;

	public CmdExecutorProxy(String userName, String pwd) {
		if(isVlaidUser(userName, pwd)) {
			isAdmin = true;
		}
		cmdExecutorImpl = new CmdExecutorImpl();
	}

	private boolean isVlaidUser(String userName, String pwd) {
		return userName.equalsIgnoreCase("Pavan") && pwd.equalsIgnoreCase("xyz") ? true : false;
	}

	@Override public void runCmd(String cmd) throws Exception {
		if(isAdmin) {
			cmdExecutorImpl.runCmd(cmd);
		} else {
			if(cmd.trim().startsWith("rm")) {
				throw new Exception("rm is not allowed for non-admn users");
			} else {
				cmdExecutorImpl.runCmd(cmd);
			}
		}
	}
}
