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
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.covspectrum.Indexes;
import org.jooq.covspectrum.Public;
import org.jooq.covspectrum.tables.records.SpectrumSwissCasesRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpectrumSwissCases extends TableImpl<SpectrumSwissCasesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.spectrum_swiss_cases</code>
     */
    public static final SpectrumSwissCases SPECTRUM_SWISS_CASES = new SpectrumSwissCases();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpectrumSwissCasesRecord> getRecordType() {
        return SpectrumSwissCasesRecord.class;
    }

    /**
     * The column <code>public.spectrum_swiss_cases.date</code>.
     */
    public final TableField<SpectrumSwissCasesRecord, LocalDate> DATE = createField(DSL.name("date"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>public.spectrum_swiss_cases.division</code>.
     */
    public final TableField<SpectrumSwissCasesRecord, String> DIVISION = createField(DSL.name("division"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.spectrum_swiss_cases.age</code>.
     */
    public final TableField<SpectrumSwissCasesRecord, Integer> AGE = createField(DSL.name("age"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.spectrum_swiss_cases.sex</code>.
     */
    public final TableField<SpectrumSwissCasesRecord, String> SEX = createField(DSL.name("sex"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.spectrum_swiss_cases.hospitalized</code>.
     */
    public final TableField<SpectrumSwissCasesRecord, Boolean> HOSPITALIZED = createField(DSL.name("hospitalized"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.spectrum_swiss_cases.deceased</code>.
     */
    public final TableField<SpectrumSwissCasesRecord, Boolean> DECEASED = createField(DSL.name("deceased"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.spectrum_swiss_cases.count</code>.
     */
    public final TableField<SpectrumSwissCasesRecord, Long> COUNT = createField(DSL.name("count"), SQLDataType.BIGINT, this, "");

    private SpectrumSwissCases(Name alias, Table<SpectrumSwissCasesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SpectrumSwissCases(Name alias, Table<SpectrumSwissCasesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.materializedView());
    }

    /**
     * Create an aliased <code>public.spectrum_swiss_cases</code> table reference
     */
    public SpectrumSwissCases(String alias) {
        this(DSL.name(alias), SPECTRUM_SWISS_CASES);
    }

    /**
     * Create an aliased <code>public.spectrum_swiss_cases</code> table reference
     */
    public SpectrumSwissCases(Name alias) {
        this(alias, SPECTRUM_SWISS_CASES);
    }

    /**
     * Create a <code>public.spectrum_swiss_cases</code> table reference
     */
    public SpectrumSwissCases() {
        this(DSL.name("spectrum_swiss_cases"), null);
    }

    public <O extends Record> SpectrumSwissCases(Table<O> child, ForeignKey<O, SpectrumSwissCasesRecord> key) {
        super(child, key, SPECTRUM_SWISS_CASES);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SPECTRUM_SWISS_CASES_DATE_DIVISION_AGE_SEX_HOSPITALIZED_DEC_IDX, Indexes.SPECTRUM_SWISS_CASES_DATE_IDX);
    }

    @Override
    public SpectrumSwissCases as(String alias) {
        return new SpectrumSwissCases(DSL.name(alias), this);
    }

    @Override
    public SpectrumSwissCases as(Name alias) {
        return new SpectrumSwissCases(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SpectrumSwissCases rename(String name) {
        return new SpectrumSwissCases(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SpectrumSwissCases rename(Name name) {
        return new SpectrumSwissCases(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<LocalDate, String, Integer, String, Boolean, Boolean, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}