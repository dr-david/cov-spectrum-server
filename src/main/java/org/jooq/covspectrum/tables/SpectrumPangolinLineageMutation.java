/*
 * This file is generated by jOOQ.
 */
package org.jooq.covspectrum.tables;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.covspectrum.Indexes;
import org.jooq.covspectrum.Public;
import org.jooq.covspectrum.tables.records.SpectrumPangolinLineageMutationRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpectrumPangolinLineageMutation extends TableImpl<SpectrumPangolinLineageMutationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.spectrum_pangolin_lineage_mutation</code>
     */
    public static final SpectrumPangolinLineageMutation SPECTRUM_PANGOLIN_LINEAGE_MUTATION = new SpectrumPangolinLineageMutation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpectrumPangolinLineageMutationRecord> getRecordType() {
        return SpectrumPangolinLineageMutationRecord.class;
    }

    /**
     * The column <code>public.spectrum_pangolin_lineage_mutation.region</code>.
     */
    public final TableField<SpectrumPangolinLineageMutationRecord, String> REGION = createField(DSL.name("region"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.spectrum_pangolin_lineage_mutation.country</code>.
     */
    public final TableField<SpectrumPangolinLineageMutationRecord, String> COUNTRY = createField(DSL.name("country"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.spectrum_pangolin_lineage_mutation.date</code>.
     */
    public final TableField<SpectrumPangolinLineageMutationRecord, LocalDate> DATE = createField(DSL.name("date"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>public.spectrum_pangolin_lineage_mutation.pangolin_lineage</code>.
     */
    public final TableField<SpectrumPangolinLineageMutationRecord, String> PANGOLIN_LINEAGE = createField(DSL.name("pangolin_lineage"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.spectrum_pangolin_lineage_mutation.aa_mutation</code>.
     */
    public final TableField<SpectrumPangolinLineageMutationRecord, String> AA_MUTATION = createField(DSL.name("aa_mutation"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.spectrum_pangolin_lineage_mutation.count</code>.
     */
    public final TableField<SpectrumPangolinLineageMutationRecord, Long> COUNT = createField(DSL.name("count"), SQLDataType.BIGINT, this, "");

    private SpectrumPangolinLineageMutation(Name alias, Table<SpectrumPangolinLineageMutationRecord> aliased) {
        this(alias, aliased, null);
    }

    private SpectrumPangolinLineageMutation(Name alias, Table<SpectrumPangolinLineageMutationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.materializedView());
    }

    /**
     * Create an aliased <code>public.spectrum_pangolin_lineage_mutation</code> table reference
     */
    public SpectrumPangolinLineageMutation(String alias) {
        this(DSL.name(alias), SPECTRUM_PANGOLIN_LINEAGE_MUTATION);
    }

    /**
     * Create an aliased <code>public.spectrum_pangolin_lineage_mutation</code> table reference
     */
    public SpectrumPangolinLineageMutation(Name alias) {
        this(alias, SPECTRUM_PANGOLIN_LINEAGE_MUTATION);
    }

    /**
     * Create a <code>public.spectrum_pangolin_lineage_mutation</code> table reference
     */
    public SpectrumPangolinLineageMutation() {
        this(DSL.name("spectrum_pangolin_lineage_mutation"), null);
    }

    public <O extends Record> SpectrumPangolinLineageMutation(Table<O> child, ForeignKey<O, SpectrumPangolinLineageMutationRecord> key) {
        super(child, key, SPECTRUM_PANGOLIN_LINEAGE_MUTATION);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SPECTRUM_PANGOLIN_LINEAGE_MUT_COUNTRY_DATE_PANGOLIN_LINEAGE_IDX, Indexes.SPECTRUM_PANGOLIN_LINEAGE_MUTA_REGION_DATE_PANGOLIN_LINEAGE_IDX, Indexes.SPECTRUM_PANGOLIN_LINEAGE_MUTATION_DATE_PANGOLIN_LINEAGE_IDX);
    }

    @Override
    public SpectrumPangolinLineageMutation as(String alias) {
        return new SpectrumPangolinLineageMutation(DSL.name(alias), this);
    }

    @Override
    public SpectrumPangolinLineageMutation as(Name alias) {
        return new SpectrumPangolinLineageMutation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SpectrumPangolinLineageMutation rename(String name) {
        return new SpectrumPangolinLineageMutation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SpectrumPangolinLineageMutation rename(Name name) {
        return new SpectrumPangolinLineageMutation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, LocalDate, String, String, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
