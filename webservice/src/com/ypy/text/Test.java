package com.ypy.text;

import com.ypy.cxf.HelloWorldImpl;
import com.ypy.cxf.HelloWorldImplService;

public class Test {
	public static void main(String[] args) {
		HelloWorldImplService ss = new HelloWorldImplService();
		HelloWorldImpl hi = ss.getHelloWorldImplPort();
		System.out.println(hi.say("уехЩ"));
	}
}
