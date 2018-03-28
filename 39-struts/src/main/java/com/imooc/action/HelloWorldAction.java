package com.imooc.action;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("execute");
		return super.execute();
	}
	
	public String add() {
		System.out.println("add");
		return "add";
	}
	
	public String update() {
		System.out.println("Update");
		return "update";
	}
}
