package com.rdm.learnasync.model.trade;

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
 * @date - 6/13/20-8:47 AM
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class TradePK  implements Serializable {
    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Column(name = "stop_date", nullable = false)
    private Date stopDate;

    @Column(name = "fund")
    private int fund;

    @Column(name = "cusip", nullable = false)
    private String cusip;

    @Column(name = "trade_num")
    private int tradeNum;
}
