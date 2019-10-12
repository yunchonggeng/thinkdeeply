package reconsitution;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: main
 * @description: 计算
 * @author: william
 * @create: 2019-08-09 08:01
 **/
public class Statement {
    public static void main(String[] args) throws Exception {
        Plays plays=new Plays();
        Map<String,PlayType> playTypeMap=new HashMap<>();
        PlayType playType=new PlayType();
        playType.setName("Hamlet");
        playType.setType("tragedy");
        playTypeMap.put("hamlet",playType);
        playType=new PlayType();
        playType.setName("As You Like It");
        playType.setType("comedy");
        playTypeMap.put("as-like",playType);
        playType=new PlayType();
        playType.setName("Othello");
        playType.setType("tragedy");
        playTypeMap.put("othello",playType);
        plays.setPlay(playTypeMap);

        Invoices invoices=new Invoices();
        invoices.setCustomer("BigCo");
        List<Performance> performanceList=new ArrayList<>();
        Performance performance=new Performance();
        performance.setAudience(55);
        performance.setPlayId("hamlet");
        performanceList.add(performance);
        performance=new Performance();
        performance.setAudience(35);
        performance.setPlayId("as-like");
        performanceList.add(performance);
        performance=new Performance();
        performance.setAudience(40);
        performance.setPlayId("othello");
        performanceList.add(performance);
        invoices.setPerformances(performanceList);
        Statement statement=new Statement();
        String result=statement.statement(invoices,plays);
        System.out.println(result);
    }

    public String statement(Invoices invoices,Plays plays) throws Exception {
        BigDecimal totalAmount=BigDecimal.valueOf(0);
        int volumeCredits=0;
        String result="";
        for(Performance perf:invoices.getPerformances()){
             PlayType playType=plays.getPlay().get(perf.getPlayId());
             BigDecimal thisAmount=BigDecimal.valueOf(0L);
             switch (playType.getType()){
                 case "tragedy":{
                     thisAmount=BigDecimal.valueOf(40000L);
                     if(perf.getAudience()>30){
                         thisAmount=thisAmount.add(BigDecimal.valueOf(1000).multiply(BigDecimal.valueOf(perf.getAudience()).subtract(BigDecimal.valueOf(30))));
                         System.out.println(thisAmount);
                     }
                     break;
                 }
                 case "comedy":{
                     thisAmount=BigDecimal.valueOf(30000L);
                     if(perf.getAudience()>20){
                         thisAmount=thisAmount.add(BigDecimal.valueOf(10000).add(BigDecimal.valueOf(500).multiply(BigDecimal.valueOf(perf.getAudience()).subtract(BigDecimal.valueOf(20)))));
                         System.out.println(thisAmount);
                     }
                     break;
                 }
                 default:{
                     throw new Exception("unknow type :"+playType.getName());
                 }
             }
             volumeCredits+=Math.max(perf.getAudience()-30,0);
             if("comedy".equals(playType.getType())){
                 volumeCredits+=Math.floor(perf.getAudience()/5);
             }
             result+=String.format("%s:%s %s \n",playType.getName(),thisAmount.divide(BigDecimal.valueOf(100)),perf.getAudience());
             totalAmount=totalAmount.add(thisAmount);
        }
        result+=String.format("Amount owed is %s \n",totalAmount.divide(BigDecimal.valueOf(100)));
        result+=String.format("you earned %s credits \n",volumeCredits);
        return result;
    }
}
