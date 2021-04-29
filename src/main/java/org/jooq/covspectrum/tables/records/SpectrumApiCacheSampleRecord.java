/*
 * This file is generated by jOOQ.
 */
package org.jooq.covspectrum.tables.records;


import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.covspectrum.tables.SpectrumApiCacheSample;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpectrumApiCacheSampleRecord extends UpdatableRecordImpl<SpectrumApiCacheSampleRecord> implements Record12<Integer, String, Boolean, String, String, String, Double, String, String, LocalDate, LocalDate, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.spectrum_api_cache_sample.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.spectrum_api_cache_sample.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.spectrum_api_cache_sample.fields</code>.
     */
    public void setFields(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.spectrum_api_cache_sample.fields</code>.
     */
    public String getFields() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.spectrum_api_cache_sample.private_version</code>.
     */
    public void setPrivateVersion(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.spectrum_api_cache_sample.private_version</code>.
     */
    public Boolean getPrivateVersion() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>public.spectrum_api_cache_sample.region</code>.
     */
    public void setRegion(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.spectrum_api_cache_sample.region</code>.
     */
    public String getRegion() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.spectrum_api_cache_sample.country</code>.
     */
    public void setCountry(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.spectrum_api_cache_sample.country</code>.
     */
    public String getCountry() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.spectrum_api_cache_sample.mutations</code>.
     */
    public void setMutations(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.spectrum_api_cache_sample.mutations</code>.
     */
    public String getMutations() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.spectrum_api_cache_sample.match_percentage</code>.
     */
    public void setMatchPercentage(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.spectrum_api_cache_sample.match_percentage</code>.
     */
    public Double getMatchPercentage() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>public.spectrum_api_cache_sample.pangolin_lineage</code>.
     */
    public void setPangolinLineage(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.spectrum_api_cache_sample.pangolin_lineage</code>.
     */
    public String getPangolinLineage() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.spectrum_api_cache_sample.data_type</code>.
     */
    public void setDataType(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.spectrum_api_cache_sample.data_type</code>.
     */
    public String getDataType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.spectrum_api_cache_sample.date_from</code>.
     */
    public void setDateFrom(LocalDate value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.spectrum_api_cache_sample.date_from</code>.
     */
    public LocalDate getDateFrom() {
        return (LocalDate) get(9);
    }

    /**
     * Setter for <code>public.spectrum_api_cache_sample.date_to</code>.
     */
    public void setDateTo(LocalDate value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.spectrum_api_cache_sample.date_to</code>.
     */
    public LocalDate getDateTo() {
        return (LocalDate) get(10);
    }

    /**
     * Setter for <code>public.spectrum_api_cache_sample.cache</code>.
     */
    public void setCache(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.spectrum_api_cache_sample.cache</code>.
     */
    public String getCache() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, Boolean, String, String, String, Double, String, String, LocalDate, LocalDate, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Integer, String, Boolean, String, String, String, Double, String, String, LocalDate, LocalDate, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return SpectrumApiCacheSample.SPECTRUM_API_CACHE_SAMPLE.ID;
    }

    @Override
    public Field<String> field2() {
        return SpectrumApiCacheSample.SPECTRUM_API_CACHE_SAMPLE.FIELDS;
    }

    @Override
    public Field<Boolean> field3() {
        return SpectrumApiCacheSample.SPECTRUM_API_CACHE_SAMPLE.PRIVATE_VERSION;
    }

    @Override
    public Field<String> field4() {
        return SpectrumApiCacheSample.SPECTRUM_API_CACHE_SAMPLE.REGION;
    }

    @Override
    public Field<String> field5() {
        return SpectrumApiCacheSample.SPECTRUM_API_CACHE_SAMPLE.COUNTRY;
    }

    @Override
    public Field<String> field6() {
        return SpectrumApiCacheSample.SPECTRUM_API_CACHE_SAMPLE.MUTATIONS;
    }

    @Override
    public Field<Double> field7() {
        return SpectrumApiCacheSample.SPECTRUM_API_CACHE_SAMPLE.MATCH_PERCENTAGE;
    }

    @Override
    public Field<String> field8() {
        return SpectrumApiCacheSample.SPECTRUM_API_CACHE_SAMPLE.PANGOLIN_LINEAGE;
    }

    @Override
    public Field<String> field9() {
        return SpectrumApiCacheSample.SPECTRUM_API_CACHE_SAMPLE.DATA_TYPE;
    }

    @Override
    public Field<LocalDate> field10() {
        return SpectrumApiCacheSample.SPECTRUM_API_CACHE_SAMPLE.DATE_FROM;
    }

    @Override
    public Field<LocalDate> field11() {
        return SpectrumApiCacheSample.SPECTRUM_API_CACHE_SAMPLE.DATE_TO;
    }

    @Override
    public Field<String> field12() {
        return SpectrumApiCacheSample.SPECTRUM_API_CACHE_SAMPLE.CACHE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getFields();
    }

    @Override
    public Boolean component3() {
        return getPrivateVersion();
    }

    @Override
    public String component4() {
        return getRegion();
    }

    @Override
    public String component5() {
        return getCountry();
    }

    @Override
    public String component6() {
        return getMutations();
    }

    @Override
    public Double component7() {
        return getMatchPercentage();
    }

    @Override
    public String component8() {
        return getPangolinLineage();
    }

    @Override
    public String component9() {
        return getDataType();
    }

    @Override
    public LocalDate component10() {
        return getDateFrom();
    }

    @Override
    public LocalDate component11() {
        return getDateTo();
    }

    @Override
    public String component12() {
        return getCache();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getFields();
    }

    @Override
    public Boolean value3() {
        return getPrivateVersion();
    }

    @Override
    public String value4() {
        return getRegion();
    }

    @Override
    public String value5() {
        return getCountry();
    }

    @Override
    public String value6() {
        return getMutations();
    }

    @Override
    public Double value7() {
        return getMatchPercentage();
    }

    @Override
    public String value8() {
        return getPangolinLineage();
    }

    @Override
    public String value9() {
        return getDataType();
    }

    @Override
    public LocalDate value10() {
        return getDateFrom();
    }

    @Override
    public LocalDate value11() {
        return getDateTo();
    }

    @Override
    public String value12() {
        return getCache();
    }

    @Override
    public SpectrumApiCacheSampleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public SpectrumApiCacheSampleRecord value2(String value) {
        setFields(value);
        return this;
    }

    @Override
    public SpectrumApiCacheSampleRecord value3(Boolean value) {
        setPrivateVersion(value);
        return this;
    }

    @Override
    public SpectrumApiCacheSampleRecord value4(String value) {
        setRegion(value);
        return this;
    }

    @Override
    public SpectrumApiCacheSampleRecord value5(String value) {
        setCountry(value);
        return this;
    }

    @Override
    public SpectrumApiCacheSampleRecord value6(String value) {
        setMutations(value);
        return this;
    }

    @Override
    public SpectrumApiCacheSampleRecord value7(Double value) {
        setMatchPercentage(value);
        return this;
    }

    @Override
    public SpectrumApiCacheSampleRecord value8(String value) {
        setPangolinLineage(value);
        return this;
    }

    @Override
    public SpectrumApiCacheSampleRecord value9(String value) {
        setDataType(value);
        return this;
    }

    @Override
    public SpectrumApiCacheSampleRecord value10(LocalDate value) {
        setDateFrom(value);
        return this;
    }

    @Override
    public SpectrumApiCacheSampleRecord value11(LocalDate value) {
        setDateTo(value);
        return this;
    }

    @Override
    public SpectrumApiCacheSampleRecord value12(String value) {
        setCache(value);
        return this;
    }

    @Override
    public SpectrumApiCacheSampleRecord values(Integer value1, String value2, Boolean value3, String value4, String value5, String value6, Double value7, String value8, String value9, LocalDate value10, LocalDate value11, String value12) {
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
     * Create a detached SpectrumApiCacheSampleRecord
     */
    public SpectrumApiCacheSampleRecord() {
        super(SpectrumApiCacheSample.SPECTRUM_API_CACHE_SAMPLE);
    }

    /**
     * Create a detached, initialised SpectrumApiCacheSampleRecord
     */
    public SpectrumApiCacheSampleRecord(Integer id, String fields, Boolean privateVersion, String region, String country, String mutations, Double matchPercentage, String pangolinLineage, String dataType, LocalDate dateFrom, LocalDate dateTo, String cache) {
        super(SpectrumApiCacheSample.SPECTRUM_API_CACHE_SAMPLE);

        setId(id);
        setFields(fields);
        setPrivateVersion(privateVersion);
        setRegion(region);
        setCountry(country);
        setMutations(mutations);
        setMatchPercentage(matchPercentage);
        setPangolinLineage(pangolinLineage);
        setDataType(dataType);
        setDateFrom(dateFrom);
        setDateTo(dateTo);
        setCache(cache);
    }
}
