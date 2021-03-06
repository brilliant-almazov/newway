CREATE TYPE nw.recurrent_payment_tool_status AS ENUM('created', 'acquired', 'abandoned', 'failed');

CREATE TABLE nw.recurrent_payment_tool(
  id                                 BIGSERIAL NOT NULL,
  event_id                           BIGINT NOT NULL,
  sequence_id                        INT NOT NULL,
  change_id                          INT NOT NULL,
  event_created_at                   TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  recurrent_payment_tool_id          CHARACTER VARYING NOT NULL,
  created_at                         TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  party_id                           CHARACTER VARYING NOT NULL,
  shop_id                            CHARACTER VARYING NOT NULL,
  party_revision                     BIGINT,
  domain_revision                    BIGINT NOT NULL,
  status                             nw.recurrent_payment_tool_status NOT NULL,
  status_failed_failure              CHARACTER VARYING,
  payment_tool_type                  nw.payment_tool_type NOT NULL,
  bank_card_token                    CHARACTER VARYING,
  bank_card_payment_system           CHARACTER VARYING,
  bank_card_bin                      CHARACTER VARYING,
  bank_card_masked_pan               CHARACTER VARYING,
  bank_card_token_provider           CHARACTER VARYING,
  bank_card_issuer_country           CHARACTER VARYING,
  bank_card_bank_name                CHARACTER VARYING,
  bank_card_metadata_json            CHARACTER VARYING,
  bank_card_is_cvv_empty             BOOLEAN,
  bank_card_exp_date_month           INT,
  bank_card_exp_date_year            INT,
  bank_card_cardholder_name          CHARACTER VARYING,
  payment_terminal_type              CHARACTER VARYING,
  digital_wallet_provider            CHARACTER VARYING,
  digital_wallet_id                  CHARACTER VARYING,
  digital_wallet_token               CHARACTER VARYING,
  crypto_currency                    CHARACTER VARYING,
  mobile_commerce_operator           nw.mobile_operator_type,
  mobile_commerce_phone_cc           CHARACTER VARYING,
  mobile_commerce_phone_ctn          CHARACTER VARYING,
  payment_session_id                 CHARACTER VARYING,
  client_info_ip_address             CHARACTER VARYING,
  client_info_fingerprint            CHARACTER VARYING,
  rec_token                          CHARACTER VARYING,
  route_provider_id                  INT,
  route_terminal_id                  INT,
  amount                             BIGINT NOT NULL,
  currency_code                      CHARACTER VARYING NOT NULL,
  risk_score                         CHARACTER VARYING,
  session_payload_transaction_bound_trx_id CHARACTER VARYING,
  session_payload_transaction_bound_trx_extra_json CHARACTER VARYING,
  session_payload_transaction_bound_trx_additional_info_rrn CHARACTER VARYING,
  wtime                              TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT (now() at time zone 'utc'),
  current                            BOOLEAN NOT NULL DEFAULT TRUE,
  CONSTRAINT recurrent_payment_tool_pkey PRIMARY KEY (id)
);

CREATE INDEX recurrent_payment_tool_event_id_idx on nw.recurrent_payment_tool(event_id);
CREATE INDEX recurrent_payment_tool_id_idx on nw.recurrent_payment_tool(recurrent_payment_tool_id);
ALTER TABLE nw.recurrent_payment_tool ADD CONSTRAINT recurrent_payment_tool_uniq UNIQUE (recurrent_payment_tool_id, sequence_id, change_id);