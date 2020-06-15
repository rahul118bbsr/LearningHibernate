-- auto-generated definition
create table trade
(
    start_date  date,
    stop_date   date,
    fund        integer,
    cusip       varchar,
    trade_num   integer,
    description varchar,
    constraint trade_pk_1
        unique (start_date, stop_date, fund, cusip),
    constraint ukh7qglorbb0ud7a86nf7cv4q19
        unique (trade_num, fund, stop_date)
);

alter table trade
    owner to postgres;

create unique index trade_uindex
    on trade (stop_date, fund, trade_num);

