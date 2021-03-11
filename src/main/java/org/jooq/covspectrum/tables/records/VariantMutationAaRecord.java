/*
 * This file is generated by jOOQ.
 */
package org.jooq.covspectrum.tables.records;


import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.covspectrum.tables.VariantMutationAa;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VariantMutationAaRecord extends UpdatableRecordImpl<VariantMutationAaRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.variant_mutation_aa.variant_name</code>.
     */
    public void setVariantName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.variant_mutation_aa.variant_name</code>.
     */
    public String getVariantName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.variant_mutation_aa.aa_mutation</code>.
     */
    public void setAaMutation(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.variant_mutation_aa.aa_mutation</code>.
     */
    public String getAaMutation() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return VariantMutationAa.VARIANT_MUTATION_AA.VARIANT_NAME;
    }

    @Override
    public Field<String> field2() {
        return VariantMutationAa.VARIANT_MUTATION_AA.AA_MUTATION;
    }

    @Override
    public String component1() {
        return getVariantName();
    }

    @Override
    public String component2() {
        return getAaMutation();
    }

    @Override
    public String value1() {
        return getVariantName();
    }

    @Override
    public String value2() {
        return getAaMutation();
    }

    @Override
    public VariantMutationAaRecord value1(String value) {
        setVariantName(value);
        return this;
    }

    @Override
    public VariantMutationAaRecord value2(String value) {
        setAaMutation(value);
        return this;
    }

    @Override
    public VariantMutationAaRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VariantMutationAaRecord
     */
    public VariantMutationAaRecord() {
        super(VariantMutationAa.VARIANT_MUTATION_AA);
    }

    /**
     * Create a detached, initialised VariantMutationAaRecord
     */
    public VariantMutationAaRecord(String variantName, String aaMutation) {
        super(VariantMutationAa.VARIANT_MUTATION_AA);

        setVariantName(variantName);
        setAaMutation(aaMutation);
    }
}
