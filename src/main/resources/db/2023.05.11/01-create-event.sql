--liquibase formatted sql
--changeset remigiuszabramik:1
CREATE SEQUENCE sequence_rem increment by 1;

create table event (
    id bigint PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    start_event_time TIMESTAMP NOT NULL,
    end_event_time TIMESTAMP NOT NULL,
    is_active BOOLEAN NOT NULL
);
