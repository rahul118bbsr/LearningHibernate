-- auto-generated definition
create table trade_details
(
    pos_date    date,
    stop_date   date,
    fund        integer,
    cusip       varchar,
    trade_num   integer,
    amount      double precision,
    broker_name varchar,
    constraint trade_details_pk
        unique (pos_date, stop_date, fund, cusip, trade_num)
);

alter table trade_details
    owner to postgres;

