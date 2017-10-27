cxf  支持webservice标准
配置：在SSM环境的基础上配置
	在pom.xml中导包，在applicationContext.xml中配置（在namespace中要勾选jaxws、jee）
	在web.xml中配置,编写java代码。
测试：http://localhost:8686/cxf/webservice/HelloWorld?wsdl