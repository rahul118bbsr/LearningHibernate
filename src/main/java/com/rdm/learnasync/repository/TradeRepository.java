package com.rdm.learnasync.repository;

import com.rdm.learnasync.model.trade.Trade;
import com.rdm.learnasync.model.trade.TradePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author - Rahul Dev Mishra
 * @date - 6/13/20-9:04 AM
 */

@Repository
public interface TradeRepository extends JpaRepository<Trade, TradePK> {
    String QUERY = "select * " +
            "from trade T, trade_details TD " +
            "where T.fund = :fund " +
            "and T.cusip = :cusip " +
            "and TD.fund = T.fund " +
            "and TD.cusip = T.cusip " +
            "and TD.trade_num = T.trade_num";

    @Query(value = QUERY, nativeQuery = true)
    List<Trade> findTradeByFundAndCusip(@Param("fund") int fund, @Param("cusip") String cusip);
}
