package gof.delegation;

/**
 * @program: main
 * @description: 通知者
 * @author: william
 * @create: 2019-09-03 20:03
 **/
public abstract class Notifier {
    private EventHandler eventHandler=new EventHandler();
    public EventHandler getEventHandler() {
        return eventHandler;
    }
    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    /**
     * 增加需要帮忙放哨的学生
     * @param object
     * @param methodName
     * @param args
     */
    public abstract void addListener(Object object,String methodName,Object...args);
    /**
     * 告诉所有要帮忙放哨的学生：老师来了
     */
    public abstract void notifyX();
}
