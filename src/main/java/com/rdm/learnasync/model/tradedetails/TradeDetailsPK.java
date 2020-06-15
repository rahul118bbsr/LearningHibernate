package com.rdm.learnasync.model.tradedetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Date;



/**
 * @author - Rahul Dev Mishra
 * @date - 6/13/20-8:57 AM
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class TradeDetailsPK implements Serializable {
    @Column(name = "fund")
    private int fund;

    @Column(name = "pos_date", nullable = false)
    private Date posDate;

    @Column(name = "cusip", nullable = false)
    private String cusip;

    @Column(name = "trade_num")
    private int tradeNum;

    @Column(name = "stop_date", nullable = false)
    private Date stopDate;
}
