

CREATE TABLE status
(
  id          serial PRIMARY KEY,
  chain       VARCHAR(255),
  step        VARCHAR(255),
  item_id      VARCHAR(255),
  item_state   VARCHAR(255),
  detail      TEXT,
  numba       INTEGER,
  daet        INT8,
  msg_type     VARCHAR(255),
  exec_id      INT8
);

CREATE INDEX IF NOT EXISTS IDX_STATUS_DATE_DESC ON STATUS(daet desc);
CREATE INDEX IF NOT EXISTS IDX_STATUS_MSGTYPE ON STATUS(msg_type);
CREATE INDEX IF NOT EXISTS IDX_STATUS_ITEMID ON STATUS(item_id);
CREATE INDEX IF NOT EXISTS IDX_STATUS_ITEMSTATE ON STATUS(item_state);
CREATE INDEX IF NOT EXISTS IDX_STATUS_EXECID ON STATUS(exec_id);