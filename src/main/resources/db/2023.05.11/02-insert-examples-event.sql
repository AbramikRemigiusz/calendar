--liquibase formatted sql
--changeset remigiuszabramik:2
INSERT INTO event (id,name, category, description, start_event_time, end_event_time, is_active)
VALUES
    (nextval('sequence_rem'),'Spotkanie 1', 'Biznes', 'Pierwsze spotkanie', '2023-05-11 09:00:00', '2023-05-11 10:00:00', true),
    (nextval('sequence_rem'),'Spotkanie 2', 'Biznes', 'Drugie spotkanie', '2023-05-12 14:30:00', '2023-05-12 15:30:00', true),
    (nextval('sequence_rem'),'Wydarzenie 1', 'Rozrywka', 'Koncert', '2023-05-13 20:00:00', '2023-05-13 22:00:00', true);