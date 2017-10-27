package com.ypy.cxf.impl;

import javax.jws.WebService;
import org.springframework.stereotype.Component;
import com.ypy.cxf.HelloWorld;

@Component("helloworld")
@WebService
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String say(String msg) {
		System.out.println("服务器中方法执行了"+msg);
		return "你好";
	}
	

}
