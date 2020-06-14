package com.rdm.learnasync.service;

import com.rdm.learnasync.model.trade.Trade;
import com.rdm.learnasync.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author - Rahul Dev Mishra
 * @date - 6/13/20-9:09 AM
 */

@Service
public class TradeService {
    @Autowired
    private TradeRepository tradeRepository;

    public List<Trade> find(int fund, String cusip) {
        List<Trade> trades = tradeRepository.findTradeByFundAndCusip(fund, cusip);
        return trades;
    }
}
