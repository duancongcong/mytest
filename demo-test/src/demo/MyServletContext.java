package demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContext implements ServletContextListener ,ServletContextAttributeListener{

	//对象销毁的时候执行
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("Web程序关闭");
	}
	//对象创建的时候执行
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContext servletContext = sce.getServletContext();
		System.out.println(servletContext+"对象被创建, Web程序启动的时候执行");
		
	}
	//添加
	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("上下文域中添加了属性："+event.getName());
		System.out.println("上下文域中添加了值："+event.getValue());
	}
	//删除
	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("上下文域中删除了属性"+event.getName());
		System.out.println("上下文域中删除了值"+event.getValue());
	}
	//修改
	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("在上下文域中修改属性"+event.getName());
		System.out.println("在上下文域中修改之前的属性"+event.getName());
		ServletContext servletContext = event.getServletContext();
		System.out.println("在上下文域中修改之后的属性"+servletContext.getAttribute(event.getName()));
		
	}

}
