package demo;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyRequestListener implements ServletRequestListener,ServletRequestAttributeListener{

	//请求被销毁		
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("请求被销毁"+arg0.getServletRequest());

		
	}
	//请求被创建
	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("请求被创建"+arg0.getServletRequest());
	}
	//请求域添加属性和值
	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("请求域添加了属性"+arg0.getName());
		System.out.println("请求域添加了值"+arg0.getValue());
	}
	//请求域修改属性和值
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("请求域中删除了属性：" + arg0.getName());
		System.out.println("请求域中删除了值：" + arg0.getValue());
		
	}
	//请求域删除属性和值
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("请求域中修改了属性：" + arg0.getName());
		System.out.println("请求域中修改之前值：" + arg0.getValue());
		System.out.println("请求域中修改之后值：" + arg0.getServletRequest().getAttribute(arg0.getName()));
	}

}
