/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain.routines;


import com.rbkmoney.newway.domain.Nw;
import com.rbkmoney.newway.domain.tables.records.CashFlowRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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
public class GetRefundFeeSfunc extends AbstractRoutine<Long[]> {

    private static final long serialVersionUID = 693403520;

    /**
     * The parameter <code>nw.get_refund_fee_sfunc.RETURN_VALUE</code>.
     */
    public static final Parameter<Long[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), false, false);

    /**
     * The parameter <code>nw.get_refund_fee_sfunc.amounts</code>.
     */
    public static final Parameter<Long[]> AMOUNTS = createParameter("amounts", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), false, false);

    /**
     * The parameter <code>nw.get_refund_fee_sfunc.cash_flow</code>.
     */
    public static final Parameter<CashFlowRecord> CASH_FLOW = createParameter("cash_flow", com.rbkmoney.newway.domain.tables.CashFlow.CASH_FLOW.getDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public GetRefundFeeSfunc() {
        super("get_refund_fee_sfunc", Nw.NW, org.jooq.impl.SQLDataType.BIGINT.getArrayDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(AMOUNTS);
        addInParameter(CASH_FLOW);
    }

    /**
     * Set the <code>amounts</code> parameter IN value to the routine
     */
    public void setAmounts(Long... value) {
        setValue(AMOUNTS, value);
    }

    /**
     * Set the <code>amounts</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setAmounts(Field<Long[]> field) {
        setField(AMOUNTS, field);
    }

    /**
     * Set the <code>cash_flow</code> parameter IN value to the routine
     */
    public void setCashFlow(CashFlowRecord value) {
        setValue(CASH_FLOW, value);
    }

    /**
     * Set the <code>cash_flow</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setCashFlow(Field<CashFlowRecord> field) {
        setField(CASH_FLOW, field);
    }
}
