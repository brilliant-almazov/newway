/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain.tables;


import com.rbkmoney.newway.domain.Keys;
import com.rbkmoney.newway.domain.Nw;
import com.rbkmoney.newway.domain.enums.SourceStatus;
import com.rbkmoney.newway.domain.tables.records.SourceRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Source extends TableImpl<SourceRecord> {

    private static final long serialVersionUID = 1182941223;

    /**
     * The reference instance of <code>nw.source</code>
     */
    public static final Source SOURCE = new Source();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SourceRecord> getRecordType() {
        return SourceRecord.class;
    }

    /**
     * The column <code>nw.source.id</code>.
     */
    public final TableField<SourceRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('nw.source_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>nw.source.event_id</code>.
     */
    public final TableField<SourceRecord, Long> EVENT_ID = createField("event_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>nw.source.event_created_at</code>.
     */
    public final TableField<SourceRecord, LocalDateTime> EVENT_CREATED_AT = createField("event_created_at", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>nw.source.event_occured_at</code>.
     */
    public final TableField<SourceRecord, LocalDateTime> EVENT_OCCURED_AT = createField("event_occured_at", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>nw.source.sequence_id</code>.
     */
    public final TableField<SourceRecord, Integer> SEQUENCE_ID = createField("sequence_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>nw.source.source_id</code>.
     */
    public final TableField<SourceRecord, String> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>nw.source.source_name</code>.
     */
    public final TableField<SourceRecord, String> SOURCE_NAME = createField("source_name", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>nw.source.source_status</code>.
     */
    public final TableField<SourceRecord, SourceStatus> SOURCE_STATUS = createField("source_status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.rbkmoney.newway.domain.enums.SourceStatus.class), this, "");

    /**
     * The column <code>nw.source.resource_internal_details</code>.
     */
    public final TableField<SourceRecord, String> RESOURCE_INTERNAL_DETAILS = createField("resource_internal_details", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.source.account_id</code>.
     */
    public final TableField<SourceRecord, String> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.source.identity_id</code>.
     */
    public final TableField<SourceRecord, String> IDENTITY_ID = createField("identity_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.source.party_id</code>.
     */
    public final TableField<SourceRecord, String> PARTY_ID = createField("party_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.source.accounter_account_id</code>.
     */
    public final TableField<SourceRecord, Long> ACCOUNTER_ACCOUNT_ID = createField("accounter_account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>nw.source.currency_code</code>.
     */
    public final TableField<SourceRecord, String> CURRENCY_CODE = createField("currency_code", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.source.wtime</code>.
     */
    public final TableField<SourceRecord, LocalDateTime> WTIME = createField("wtime", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("timezone('utc'::text, now())", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>nw.source.current</code>.
     */
    public final TableField<SourceRecord, Boolean> CURRENT = createField("current", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>nw.source</code> table reference
     */
    public Source() {
        this("source", null);
    }

    /**
     * Create an aliased <code>nw.source</code> table reference
     */
    public Source(String alias) {
        this(alias, SOURCE);
    }

    private Source(String alias, Table<SourceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Source(String alias, Table<SourceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Nw.NW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SourceRecord, Long> getIdentity() {
        return Keys.IDENTITY_SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SourceRecord> getPrimaryKey() {
        return Keys.SOURCE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SourceRecord>> getKeys() {
        return Arrays.<UniqueKey<SourceRecord>>asList(Keys.SOURCE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Source as(String alias) {
        return new Source(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Source rename(String name) {
        return new Source(name, null);
    }
}
