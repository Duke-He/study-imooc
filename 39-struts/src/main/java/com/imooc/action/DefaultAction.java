package com.imooc.action;
import com.opensymphony.xwork2.ActionSupport;

public class DefaultAction extends ActionSupport{
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("execute");
		return "login";
	}
}