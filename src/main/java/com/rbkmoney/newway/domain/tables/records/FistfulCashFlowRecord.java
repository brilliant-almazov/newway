/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain.tables.records;


import com.rbkmoney.newway.domain.enums.CashFlowAccount;
import com.rbkmoney.newway.domain.enums.FistfulCashFlowChangeType;
import com.rbkmoney.newway.domain.tables.FistfulCashFlow;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FistfulCashFlowRecord extends UpdatableRecordImpl<FistfulCashFlowRecord> implements Record12<Long, Long, CashFlowAccount, String, String, CashFlowAccount, String, String, Long, String, String, FistfulCashFlowChangeType> {

    private static final long serialVersionUID = 629835653;

    /**
     * Setter for <code>nw.fistful_cash_flow.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>nw.fistful_cash_flow.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>nw.fistful_cash_flow.obj_id</code>.
     */
    public void setObjId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>nw.fistful_cash_flow.obj_id</code>.
     */
    public Long getObjId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>nw.fistful_cash_flow.source_account_type</code>.
     */
    public void setSourceAccountType(CashFlowAccount value) {
        set(2, value);
    }

    /**
     * Getter for <code>nw.fistful_cash_flow.source_account_type</code>.
     */
    public CashFlowAccount getSourceAccountType() {
        return (CashFlowAccount) get(2);
    }

    /**
     * Setter for <code>nw.fistful_cash_flow.source_account_type_value</code>.
     */
    public void setSourceAccountTypeValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>nw.fistful_cash_flow.source_account_type_value</code>.
     */
    public String getSourceAccountTypeValue() {
        return (String) get(3);
    }

    /**
     * Setter for <code>nw.fistful_cash_flow.source_account_id</code>.
     */
    public void setSourceAccountId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>nw.fistful_cash_flow.source_account_id</code>.
     */
    public String getSourceAccountId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>nw.fistful_cash_flow.destination_account_type</code>.
     */
    public void setDestinationAccountType(CashFlowAccount value) {
        set(5, value);
    }

    /**
     * Getter for <code>nw.fistful_cash_flow.destination_account_type</code>.
     */
    public CashFlowAccount getDestinationAccountType() {
        return (CashFlowAccount) get(5);
    }

    /**
     * Setter for <code>nw.fistful_cash_flow.destination_account_type_value</code>.
     */
    public void setDestinationAccountTypeValue(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>nw.fistful_cash_flow.destination_account_type_value</code>.
     */
    public String getDestinationAccountTypeValue() {
        return (String) get(6);
    }

    /**
     * Setter for <code>nw.fistful_cash_flow.destination_account_id</code>.
     */
    public void setDestinationAccountId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>nw.fistful_cash_flow.destination_account_id</code>.
     */
    public String getDestinationAccountId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>nw.fistful_cash_flow.amount</code>.
     */
    public void setAmount(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>nw.fistful_cash_flow.amount</code>.
     */
    public Long getAmount() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>nw.fistful_cash_flow.currency_code</code>.
     */
    public void setCurrencyCode(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>nw.fistful_cash_flow.currency_code</code>.
     */
    public String getCurrencyCode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>nw.fistful_cash_flow.details</code>.
     */
    public void setDetails(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>nw.fistful_cash_flow.details</code>.
     */
    public String getDetails() {
        return (String) get(10);
    }

    /**
     * Setter for <code>nw.fistful_cash_flow.obj_type</code>.
     */
    public void setObjType(FistfulCashFlowChangeType value) {
        set(11, value);
    }

    /**
     * Getter for <code>nw.fistful_cash_flow.obj_type</code>.
     */
    public FistfulCashFlowChangeType getObjType() {
        return (FistfulCashFlowChangeType) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, CashFlowAccount, String, String, CashFlowAccount, String, String, Long, String, String, FistfulCashFlowChangeType> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, CashFlowAccount, String, String, CashFlowAccount, String, String, Long, String, String, FistfulCashFlowChangeType> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return FistfulCashFlow.FISTFUL_CASH_FLOW.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return FistfulCashFlow.FISTFUL_CASH_FLOW.OBJ_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<CashFlowAccount> field3() {
        return FistfulCashFlow.FISTFUL_CASH_FLOW.SOURCE_ACCOUNT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FistfulCashFlow.FISTFUL_CASH_FLOW.SOURCE_ACCOUNT_TYPE_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return FistfulCashFlow.FISTFUL_CASH_FLOW.SOURCE_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<CashFlowAccount> field6() {
        return FistfulCashFlow.FISTFUL_CASH_FLOW.DESTINATION_ACCOUNT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return FistfulCashFlow.FISTFUL_CASH_FLOW.DESTINATION_ACCOUNT_TYPE_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FistfulCashFlow.FISTFUL_CASH_FLOW.DESTINATION_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return FistfulCashFlow.FISTFUL_CASH_FLOW.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return FistfulCashFlow.FISTFUL_CASH_FLOW.CURRENCY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return FistfulCashFlow.FISTFUL_CASH_FLOW.DETAILS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<FistfulCashFlowChangeType> field12() {
        return FistfulCashFlow.FISTFUL_CASH_FLOW.OBJ_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getObjId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CashFlowAccount value3() {
        return getSourceAccountType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSourceAccountTypeValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSourceAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CashFlowAccount value6() {
        return getDestinationAccountType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDestinationAccountTypeValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDestinationAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCurrencyCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getDetails();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FistfulCashFlowChangeType value12() {
        return getObjType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FistfulCashFlowRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FistfulCashFlowRecord value2(Long value) {
        setObjId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FistfulCashFlowRecord value3(CashFlowAccount value) {
        setSourceAccountType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FistfulCashFlowRecord value4(String value) {
        setSourceAccountTypeValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FistfulCashFlowRecord value5(String value) {
        setSourceAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FistfulCashFlowRecord value6(CashFlowAccount value) {
        setDestinationAccountType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FistfulCashFlowRecord value7(String value) {
        setDestinationAccountTypeValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FistfulCashFlowRecord value8(String value) {
        setDestinationAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FistfulCashFlowRecord value9(Long value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FistfulCashFlowRecord value10(String value) {
        setCurrencyCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FistfulCashFlowRecord value11(String value) {
        setDetails(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FistfulCashFlowRecord value12(FistfulCashFlowChangeType value) {
        setObjType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FistfulCashFlowRecord values(Long value1, Long value2, CashFlowAccount value3, String value4, String value5, CashFlowAccount value6, String value7, String value8, Long value9, String value10, String value11, FistfulCashFlowChangeType value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FistfulCashFlowRecord
     */
    public FistfulCashFlowRecord() {
        super(FistfulCashFlow.FISTFUL_CASH_FLOW);
    }

    /**
     * Create a detached, initialised FistfulCashFlowRecord
     */
    public FistfulCashFlowRecord(Long id, Long objId, CashFlowAccount sourceAccountType, String sourceAccountTypeValue, String sourceAccountId, CashFlowAccount destinationAccountType, String destinationAccountTypeValue, String destinationAccountId, Long amount, String currencyCode, String details, FistfulCashFlowChangeType objType) {
        super(FistfulCashFlow.FISTFUL_CASH_FLOW);

        set(0, id);
        set(1, objId);
        set(2, sourceAccountType);
        set(3, sourceAccountTypeValue);
        set(4, sourceAccountId);
        set(5, destinationAccountType);
        set(6, destinationAccountTypeValue);
        set(7, destinationAccountId);
        set(8, amount);
        set(9, currencyCode);
        set(10, details);
        set(11, objType);
    }
}
