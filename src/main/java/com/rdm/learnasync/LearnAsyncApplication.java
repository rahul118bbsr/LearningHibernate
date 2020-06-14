package com.rdm.learnasync;

import com.rdm.learnasync.model.trade.Trade;
import com.rdm.learnasync.service.TradeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.List;

@SpringBootApplication
@EnableAsync
public class LearnAsyncApplication implements AsyncConfigurer {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = SpringApplication.run(LearnAsyncApplication.class, args);
        TradeService tradeService = ctx.getBean(TradeService.class);
        List<Trade> trades = tradeService.find(4179, "BMS001");
        System.out.println("All done");
    }

}
