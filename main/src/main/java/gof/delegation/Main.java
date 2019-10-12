package gof.delegation;

import java.util.Date;

/**
 * @program: main
 * @description: 委托
 * @author: william
 * @create: 2019-09-02 21:30
 **/
public class Main {
    public static void main(String[] args) {
        Notifier goodNotifier=new GoodNotifier();

        //创建一个玩游戏的同学，开始玩游戏
        PlayingGameListener playingGameListener=new PlayingGameListener();
        //创建一个看电视的同学，开始看电视
        WatchingTVListener watchingTVListener=new WatchingTVListener();
        //玩游戏的同学告诉放哨的同学，老师来了告诉一下
        goodNotifier.addListener(playingGameListener, "stopPlayingGame",new Date());
        //看电视的同学告诉放哨的同学，老师来了告诉一下
        goodNotifier.addListener(watchingTVListener, "stopWatchingTV",new Date());
        try{
            //一点时间后
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        //老师出现，放哨的人通知所有要帮忙的同学:老师来了
        goodNotifier.notifyX();
    }
}
