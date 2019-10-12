package gof.delegation;

import java.util.Date;

/**
 * @program: main
 * @description: 看电视
 * @author: william
 * @create: 2019-09-03 20:19
 **/
public class WatchingTVListener {
    public WatchingTVListener(){
        System.out.println("我正在看电视 "+new Date());
    }

    public void stopWatchingTV(Date date){
        System.out.println("老师来了，快关闭电视 。 结束时间"+date);
    }
}
