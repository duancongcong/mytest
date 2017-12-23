package countdemo;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class CountListener implements HttpSessionListener {
//	1) 服务器创建会话的个数，与用户访客的个数是相同的。
//	2) 设计一个成员变量用于存储网站访客的人数： int onLineCount = 0;
//	3) 在sessionCreated方法中onLineCount加1
//	4) 把onLineCount的值放入上下文域中，供所有用户共享。
//	5) 在sessionDestoryed中，用户数量减1，onLineCount--，并更新上下文域中的值。
//	6) 在页面上，从上下文域中取出用户数量，输出。
//	7) 如果要用线程安全的计数器，可以使用AtomicInteger类
//	8) 创建JSP页面显示用户数，创建logout.jsp退出。
		int onLineCount = 0;

		@Override
		public void sessionCreated(HttpSessionEvent se) {
			// TODO Auto-generated method stub
			System.out.println("用户："+se.getSession().getId()+ "访问了本站");
			//用户人数++
			onLineCount++;
			//把访问计数放进上下文域中保存
			ServletContext application = se.getSession().getServletContext();
			application.setAttribute("count", onLineCount);
		}

		@Override
		public void sessionDestroyed(HttpSessionEvent se) {
			// TODO Auto-generated method stub
			System.out.println("用户：" + se.getSession().getId() + "退出了本站");
			onLineCount--;
			ServletContext servletContext = se.getSession().getServletContext();
			servletContext.setAttribute("count", onLineCount);
		}
		
}
