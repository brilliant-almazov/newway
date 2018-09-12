/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain;


import com.rbkmoney.newway.domain.tables.Adjustment;
import com.rbkmoney.newway.domain.tables.Calendar;
import com.rbkmoney.newway.domain.tables.CashFlow;
import com.rbkmoney.newway.domain.tables.Category;
import com.rbkmoney.newway.domain.tables.Contract;
import com.rbkmoney.newway.domain.tables.ContractAdjustment;
import com.rbkmoney.newway.domain.tables.Contractor;
import com.rbkmoney.newway.domain.tables.Currency;
import com.rbkmoney.newway.domain.tables.Invoice;
import com.rbkmoney.newway.domain.tables.InvoiceCart;
import com.rbkmoney.newway.domain.tables.Party;
import com.rbkmoney.newway.domain.tables.Payment;
import com.rbkmoney.newway.domain.tables.Payout;
import com.rbkmoney.newway.domain.tables.PayoutSummary;
import com.rbkmoney.newway.domain.tables.PayoutTool;
import com.rbkmoney.newway.domain.tables.Provider;
import com.rbkmoney.newway.domain.tables.Refund;
import com.rbkmoney.newway.domain.tables.Shop;
import com.rbkmoney.newway.domain.tables.Terminal;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in nw
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>nw.adjustment</code>.
     */
    public static final Adjustment ADJUSTMENT = com.rbkmoney.newway.domain.tables.Adjustment.ADJUSTMENT;

    /**
     * The table <code>nw.calendar</code>.
     */
    public static final Calendar CALENDAR = com.rbkmoney.newway.domain.tables.Calendar.CALENDAR;

    /**
     * The table <code>nw.cash_flow</code>.
     */
    public static final CashFlow CASH_FLOW = com.rbkmoney.newway.domain.tables.CashFlow.CASH_FLOW;

    /**
     * The table <code>nw.category</code>.
     */
    public static final Category CATEGORY = com.rbkmoney.newway.domain.tables.Category.CATEGORY;

    /**
     * The table <code>nw.contract</code>.
     */
    public static final Contract CONTRACT = com.rbkmoney.newway.domain.tables.Contract.CONTRACT;

    /**
     * The table <code>nw.contract_adjustment</code>.
     */
    public static final ContractAdjustment CONTRACT_ADJUSTMENT = com.rbkmoney.newway.domain.tables.ContractAdjustment.CONTRACT_ADJUSTMENT;

    /**
     * The table <code>nw.contractor</code>.
     */
    public static final Contractor CONTRACTOR = com.rbkmoney.newway.domain.tables.Contractor.CONTRACTOR;

    /**
     * The table <code>nw.currency</code>.
     */
    public static final Currency CURRENCY = com.rbkmoney.newway.domain.tables.Currency.CURRENCY;

    /**
     * The table <code>nw.invoice</code>.
     */
    public static final Invoice INVOICE = com.rbkmoney.newway.domain.tables.Invoice.INVOICE;

    /**
     * The table <code>nw.invoice_cart</code>.
     */
    public static final InvoiceCart INVOICE_CART = com.rbkmoney.newway.domain.tables.InvoiceCart.INVOICE_CART;

    /**
     * The table <code>nw.party</code>.
     */
    public static final Party PARTY = com.rbkmoney.newway.domain.tables.Party.PARTY;

    /**
     * The table <code>nw.payment</code>.
     */
    public static final Payment PAYMENT = com.rbkmoney.newway.domain.tables.Payment.PAYMENT;

    /**
     * The table <code>nw.payout</code>.
     */
    public static final Payout PAYOUT = com.rbkmoney.newway.domain.tables.Payout.PAYOUT;

    /**
     * The table <code>nw.payout_summary</code>.
     */
    public static final PayoutSummary PAYOUT_SUMMARY = com.rbkmoney.newway.domain.tables.PayoutSummary.PAYOUT_SUMMARY;

    /**
     * The table <code>nw.payout_tool</code>.
     */
    public static final PayoutTool PAYOUT_TOOL = com.rbkmoney.newway.domain.tables.PayoutTool.PAYOUT_TOOL;

    /**
     * The table <code>nw.provider</code>.
     */
    public static final Provider PROVIDER = com.rbkmoney.newway.domain.tables.Provider.PROVIDER;

    /**
     * The table <code>nw.refund</code>.
     */
    public static final Refund REFUND = com.rbkmoney.newway.domain.tables.Refund.REFUND;

    /**
     * The table <code>nw.shop</code>.
     */
    public static final Shop SHOP = com.rbkmoney.newway.domain.tables.Shop.SHOP;

    /**
     * The table <code>nw.terminal</code>.
     */
    public static final Terminal TERMINAL = com.rbkmoney.newway.domain.tables.Terminal.TERMINAL;
}
