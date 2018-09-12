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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Nw extends SchemaImpl {

    private static final long serialVersionUID = -1745816537;

    /**
     * The reference instance of <code>nw</code>
     */
    public static final Nw NW = new Nw();

    /**
     * The table <code>nw.adjustment</code>.
     */
    public final Adjustment ADJUSTMENT = com.rbkmoney.newway.domain.tables.Adjustment.ADJUSTMENT;

    /**
     * The table <code>nw.calendar</code>.
     */
    public final Calendar CALENDAR = com.rbkmoney.newway.domain.tables.Calendar.CALENDAR;

    /**
     * The table <code>nw.cash_flow</code>.
     */
    public final CashFlow CASH_FLOW = com.rbkmoney.newway.domain.tables.CashFlow.CASH_FLOW;

    /**
     * The table <code>nw.category</code>.
     */
    public final Category CATEGORY = com.rbkmoney.newway.domain.tables.Category.CATEGORY;

    /**
     * The table <code>nw.contract</code>.
     */
    public final Contract CONTRACT = com.rbkmoney.newway.domain.tables.Contract.CONTRACT;

    /**
     * The table <code>nw.contract_adjustment</code>.
     */
    public final ContractAdjustment CONTRACT_ADJUSTMENT = com.rbkmoney.newway.domain.tables.ContractAdjustment.CONTRACT_ADJUSTMENT;

    /**
     * The table <code>nw.contractor</code>.
     */
    public final Contractor CONTRACTOR = com.rbkmoney.newway.domain.tables.Contractor.CONTRACTOR;

    /**
     * The table <code>nw.currency</code>.
     */
    public final Currency CURRENCY = com.rbkmoney.newway.domain.tables.Currency.CURRENCY;

    /**
     * The table <code>nw.invoice</code>.
     */
    public final Invoice INVOICE = com.rbkmoney.newway.domain.tables.Invoice.INVOICE;

    /**
     * The table <code>nw.invoice_cart</code>.
     */
    public final InvoiceCart INVOICE_CART = com.rbkmoney.newway.domain.tables.InvoiceCart.INVOICE_CART;

    /**
     * The table <code>nw.party</code>.
     */
    public final Party PARTY = com.rbkmoney.newway.domain.tables.Party.PARTY;

    /**
     * The table <code>nw.payment</code>.
     */
    public final Payment PAYMENT = com.rbkmoney.newway.domain.tables.Payment.PAYMENT;

    /**
     * The table <code>nw.payout</code>.
     */
    public final Payout PAYOUT = com.rbkmoney.newway.domain.tables.Payout.PAYOUT;

    /**
     * The table <code>nw.payout_summary</code>.
     */
    public final PayoutSummary PAYOUT_SUMMARY = com.rbkmoney.newway.domain.tables.PayoutSummary.PAYOUT_SUMMARY;

    /**
     * The table <code>nw.payout_tool</code>.
     */
    public final PayoutTool PAYOUT_TOOL = com.rbkmoney.newway.domain.tables.PayoutTool.PAYOUT_TOOL;

    /**
     * The table <code>nw.provider</code>.
     */
    public final Provider PROVIDER = com.rbkmoney.newway.domain.tables.Provider.PROVIDER;

    /**
     * The table <code>nw.refund</code>.
     */
    public final Refund REFUND = com.rbkmoney.newway.domain.tables.Refund.REFUND;

    /**
     * The table <code>nw.shop</code>.
     */
    public final Shop SHOP = com.rbkmoney.newway.domain.tables.Shop.SHOP;

    /**
     * The table <code>nw.terminal</code>.
     */
    public final Terminal TERMINAL = com.rbkmoney.newway.domain.tables.Terminal.TERMINAL;

    /**
     * No further instances allowed
     */
    private Nw() {
        super("nw", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.ADJUSTMENT_ID_SEQ,
            Sequences.CALENDAR_ID_SEQ,
            Sequences.CASH_FLOW_ID_SEQ,
            Sequences.CATEGORY_ID_SEQ,
            Sequences.CONTRACT_ADJUSTMENT_ID_SEQ,
            Sequences.CONTRACT_ID_SEQ,
            Sequences.CONTRACTOR_ID_SEQ,
            Sequences.CURRENCY_ID_SEQ,
            Sequences.INVOICE_CART_ID_SEQ,
            Sequences.INVOICE_ID_SEQ,
            Sequences.PARTY_ID_SEQ,
            Sequences.PAYMENT_ID_SEQ,
            Sequences.PAYOUT_ID_SEQ,
            Sequences.PAYOUT_SUMMARY_ID_SEQ,
            Sequences.PAYOUT_TOOL_ID_SEQ,
            Sequences.PROVIDER_ID_SEQ,
            Sequences.REFUND_ID_SEQ,
            Sequences.SHOP_ID_SEQ,
            Sequences.TERMINAL_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Adjustment.ADJUSTMENT,
            Calendar.CALENDAR,
            CashFlow.CASH_FLOW,
            Category.CATEGORY,
            Contract.CONTRACT,
            ContractAdjustment.CONTRACT_ADJUSTMENT,
            Contractor.CONTRACTOR,
            Currency.CURRENCY,
            Invoice.INVOICE,
            InvoiceCart.INVOICE_CART,
            Party.PARTY,
            Payment.PAYMENT,
            Payout.PAYOUT,
            PayoutSummary.PAYOUT_SUMMARY,
            PayoutTool.PAYOUT_TOOL,
            Provider.PROVIDER,
            Refund.REFUND,
            Shop.SHOP,
            Terminal.TERMINAL);
    }
}
