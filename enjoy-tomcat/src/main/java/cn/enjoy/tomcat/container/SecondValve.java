package cn.enjoy.tomcat.container;

/**
 * @author 【享学课堂】 King老师
 * 需要往期视频的同学加QQ：2068425757（肉兰老师）
 * 需要咨询VIP课程的同学加QQ：1011843464 （依娜老师）
 */
public class SecondValve implements Valve {
    protected  Valve next =null;
    @Override
    public Valve getNext() {
        return next;
    }

    @Override
    public void setNext(Valve valve) {
        this.next =valve;
    }

    @Override
    public void invoke(String request) {
        System.out.println("第二个定制阀门处理!");
        getNext().invoke(request);
    }
}
