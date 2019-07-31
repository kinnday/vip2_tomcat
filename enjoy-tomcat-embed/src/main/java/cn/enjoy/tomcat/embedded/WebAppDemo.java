package cn.enjoy.tomcat.embedded;

import org.apache.catalina.startup.Tomcat;

/**
 * @author 【享学课堂】 King老师
 * 需要往期视频的同学加QQ：2068425757（肉兰老师）
 * 需要咨询VIP课程的同学加QQ：1011843464 （依娜老师）
 *
 * 要用嵌入式启动的方式启动一个SpringMVc的项目
 */
public class WebAppDemo {
    public static void main(String[] args) throws  Exception{
        Tomcat tomcat = new Tomcat();
        tomcat.addWebapp("/ref","D:\\work_tomcat\\ref-comet");
        tomcat.getConnector().setPort(80);
        tomcat.init();
        tomcat.start();
        tomcat.getServer().await();
    }
}
