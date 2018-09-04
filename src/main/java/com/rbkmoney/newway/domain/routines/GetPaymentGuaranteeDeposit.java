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
public class GetPaymentGuaranteeDeposit extends AbstractRoutine<Long> {

    private static final long serialVersionUID = 397336320;

    /**
     * The parameter <code>nw.get_payment_guarantee_deposit.RETURN_VALUE</code>.
     */
    public static final Parameter<Long> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>nw.get_payment_guarantee_deposit._1</code>.
     */
    public static final Parameter<CashFlowRecord> _1 = createParameter("_1", com.rbkmoney.newway.domain.tables.CashFlow.CASH_FLOW.getDataType(), false, true);

    /**
     * Create a new routine call instance
     */
    public GetPaymentGuaranteeDeposit() {
        super("get_payment_guarantee_deposit", Nw.NW, org.jooq.impl.SQLDataType.BIGINT);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(CashFlowRecord value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<CashFlowRecord> field) {
        setField(_1, field);
    }
}
