ALTER TABLE nw.payment ADD COLUMN trx_additional_info_rrn CHARACTER VARYING;
ALTER TABLE nw.payment ADD COLUMN trx_additional_info_approval_code CHARACTER VARYING;
ALTER TABLE nw.payment ADD COLUMN trx_additional_info_acs_url CHARACTER VARYING;
ALTER TABLE nw.payment ADD COLUMN trx_additional_info_pareq CHARACTER VARYING;
ALTER TABLE nw.payment ADD COLUMN trx_additional_info_md CHARACTER VARYING;
ALTER TABLE nw.payment ADD COLUMN trx_additional_info_term_url CHARACTER VARYING;
ALTER TABLE nw.payment ADD COLUMN trx_additional_info_pares CHARACTER VARYING;
ALTER TABLE nw.payment ADD COLUMN trx_additional_info_eci CHARACTER VARYING;
ALTER TABLE nw.payment ADD COLUMN trx_additional_info_cavv CHARACTER VARYING;
ALTER TABLE nw.payment ADD COLUMN trx_additional_info_xid CHARACTER VARYING;
ALTER TABLE nw.payment ADD COLUMN trx_additional_info_cavv_algorithm CHARACTER VARYING;
ALTER TABLE nw.payment ADD COLUMN trx_additional_info_three_ds_verification CHARACTER VARYING;