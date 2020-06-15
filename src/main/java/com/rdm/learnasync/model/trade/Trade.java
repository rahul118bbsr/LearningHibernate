package com.rdm.learnasync.model.trade;

import com.rdm.learnasync.model.tradedetails.TradeDetails;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

/**
 * @author - Rahul Dev Mishra
 * @date - 6/13/20-8:43 AM
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "Trade")
@Table(name = "trade", uniqueConstraints = @UniqueConstraint(columnNames = {"trade_num", "fund", "stop_date"}))
public class Trade {
    @EmbeddedId
    private TradePK tradePK;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumns({
            @JoinColumn(name = "fund", referencedColumnName = "fund"),
            @JoinColumn(name = "cusip", referencedColumnName = "cusip"),
            @JoinColumn(name = "trade_num", referencedColumnName = "trade_num"),
            @JoinColumn(name = "start_date", referencedColumnName = "pos_date"),
//            @JoinColumn(name = "pos_date", referencedColumnName = "start_date"),
            @JoinColumn(name = "stop_date", referencedColumnName = "stop_date")
    })
    private TradeDetails tradeDetails;

    @Column(name = "description")
    private String description;
}
