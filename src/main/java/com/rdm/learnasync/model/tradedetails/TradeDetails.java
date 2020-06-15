package com.rdm.learnasync.model.tradedetails;

import com.rdm.learnasync.model.trade.Trade;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author - Rahul Dev Mishra
 * @date - 6/13/20-8:55 AM
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "TradeDetails")
@Table(name = "trade_details")
public class TradeDetails {
    @EmbeddedId
    private TradeDetailsPK tradeDetailsPK;

    @Column(name = "amount")
    private float amount;

    @Column(name = "broker_name")
    private String brokerName;
}
