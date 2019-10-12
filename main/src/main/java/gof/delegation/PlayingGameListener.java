package gof.delegation;

import java.util.Date;

/**
 * @program: main
 * @description: 玩游戏
 * @author: william
 * @create: 2019-09-03 20:16
 **/
public class PlayingGameListener {
    public PlayingGameListener(){
        System.out.println("我正在玩游戏 开始时间"+new Date());
    }
    public void stopPlayingGame(Date date){
        System.out.println("老师来了，快回到座位上，结束时间"+date);
    }

}
