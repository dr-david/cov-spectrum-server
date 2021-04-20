/*
 * This file is generated by jOOQ.
 */
package org.jooq.covspectrum.tables.records;


import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.covspectrum.tables.SpectrumSequencePublicMeta;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpectrumSequencePublicMetaRecord extends TableRecordImpl<SpectrumSequencePublicMetaRecord> implements Record15<String, LocalDate, String, String, String, String, String, String, Integer, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.spectrum_sequence_public_meta.sequence_name</code>.
     */
    public void setSequenceName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.spectrum_sequence_public_meta.sequence_name</code>.
     */
    public String getSequenceName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.spectrum_sequence_public_meta.date</code>.
     */
    public void setDate(LocalDate value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.spectrum_sequence_public_meta.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(1);
    }

    /**
     * Setter for <code>public.spectrum_sequence_public_meta.region</code>.
     */
    public void setRegion(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.spectrum_sequence_public_meta.region</code>.
     */
    public String getRegion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.spectrum_sequence_public_meta.country</code>.
     */
    public void setCountry(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.spectrum_sequence_public_meta.country</code>.
     */
    public String getCountry() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.spectrum_sequence_public_meta.division</code>.
     */
    public void setDivision(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.spectrum_sequence_public_meta.division</code>.
     */
    public String getDivision() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.spectrum_sequence_public_meta.location</code>.
     */
    public void setLocation(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.spectrum_sequence_public_meta.location</code>.
     */
    public String getLocation() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.spectrum_sequence_public_meta.zip_code</code>.
     */
    public void setZipCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.spectrum_sequence_public_meta.zip_code</code>.
     */
    public String getZipCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.spectrum_sequence_public_meta.host</code>.
     */
    public void setHost(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.spectrum_sequence_public_meta.host</code>.
     */
    public String getHost() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.spectrum_sequence_public_meta.age</code>.
     */
    public void setAge(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.spectrum_sequence_public_meta.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.spectrum_sequence_public_meta.sex</code>.
     */
    public void setSex(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.spectrum_sequence_public_meta.sex</code>.
     */
    public String getSex() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.spectrum_sequence_public_meta.submitting_lab</code>.
     */
    public void setSubmittingLab(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.spectrum_sequence_public_meta.submitting_lab</code>.
     */
    public String getSubmittingLab() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.spectrum_sequence_public_meta.originating_lab</code>.
     */
    public void setOriginatingLab(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.spectrum_sequence_public_meta.originating_lab</code>.
     */
    public String getOriginatingLab() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.spectrum_sequence_public_meta.hospitalized</code>.
     */
    public void setHospitalized(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.spectrum_sequence_public_meta.hospitalized</code>.
     */
    public String getHospitalized() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.spectrum_sequence_public_meta.deceased</code>.
     */
    public void setDeceased(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.spectrum_sequence_public_meta.deceased</code>.
     */
    public String getDeceased() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.spectrum_sequence_public_meta.pangolin_lineage</code>.
     */
    public void setPangolinLineage(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.spectrum_sequence_public_meta.pangolin_lineage</code>.
     */
    public String getPangolinLineage() {
        return (String) get(14);
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<String, LocalDate, String, String, String, String, String, String, Integer, String, String, String, String, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<String, LocalDate, String, String, String, String, String, String, Integer, String, String, String, String, String, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META.SEQUENCE_NAME;
    }

    @Override
    public Field<LocalDate> field2() {
        return SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META.DATE;
    }

    @Override
    public Field<String> field3() {
        return SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META.REGION;
    }

    @Override
    public Field<String> field4() {
        return SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META.COUNTRY;
    }

    @Override
    public Field<String> field5() {
        return SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META.DIVISION;
    }

    @Override
    public Field<String> field6() {
        return SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META.LOCATION;
    }

    @Override
    public Field<String> field7() {
        return SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META.ZIP_CODE;
    }

    @Override
    public Field<String> field8() {
        return SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META.HOST;
    }

    @Override
    public Field<Integer> field9() {
        return SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META.AGE;
    }

    @Override
    public Field<String> field10() {
        return SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META.SEX;
    }

    @Override
    public Field<String> field11() {
        return SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META.SUBMITTING_LAB;
    }

    @Override
    public Field<String> field12() {
        return SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META.ORIGINATING_LAB;
    }

    @Override
    public Field<String> field13() {
        return SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META.HOSPITALIZED;
    }

    @Override
    public Field<String> field14() {
        return SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META.DECEASED;
    }

    @Override
    public Field<String> field15() {
        return SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META.PANGOLIN_LINEAGE;
    }

    @Override
    public String component1() {
        return getSequenceName();
    }

    @Override
    public LocalDate component2() {
        return getDate();
    }

    @Override
    public String component3() {
        return getRegion();
    }

    @Override
    public String component4() {
        return getCountry();
    }

    @Override
    public String component5() {
        return getDivision();
    }

    @Override
    public String component6() {
        return getLocation();
    }

    @Override
    public String component7() {
        return getZipCode();
    }

    @Override
    public String component8() {
        return getHost();
    }

    @Override
    public Integer component9() {
        return getAge();
    }

    @Override
    public String component10() {
        return getSex();
    }

    @Override
    public String component11() {
        return getSubmittingLab();
    }

    @Override
    public String component12() {
        return getOriginatingLab();
    }

    @Override
    public String component13() {
        return getHospitalized();
    }

    @Override
    public String component14() {
        return getDeceased();
    }

    @Override
    public String component15() {
        return getPangolinLineage();
    }

    @Override
    public String value1() {
        return getSequenceName();
    }

    @Override
    public LocalDate value2() {
        return getDate();
    }

    @Override
    public String value3() {
        return getRegion();
    }

    @Override
    public String value4() {
        return getCountry();
    }

    @Override
    public String value5() {
        return getDivision();
    }

    @Override
    public String value6() {
        return getLocation();
    }

    @Override
    public String value7() {
        return getZipCode();
    }

    @Override
    public String value8() {
        return getHost();
    }

    @Override
    public Integer value9() {
        return getAge();
    }

    @Override
    public String value10() {
        return getSex();
    }

    @Override
    public String value11() {
        return getSubmittingLab();
    }

    @Override
    public String value12() {
        return getOriginatingLab();
    }

    @Override
    public String value13() {
        return getHospitalized();
    }

    @Override
    public String value14() {
        return getDeceased();
    }

    @Override
    public String value15() {
        return getPangolinLineage();
    }

    @Override
    public SpectrumSequencePublicMetaRecord value1(String value) {
        setSequenceName(value);
        return this;
    }

    @Override
    public SpectrumSequencePublicMetaRecord value2(LocalDate value) {
        setDate(value);
        return this;
    }

    @Override
    public SpectrumSequencePublicMetaRecord value3(String value) {
        setRegion(value);
        return this;
    }

    @Override
    public SpectrumSequencePublicMetaRecord value4(String value) {
        setCountry(value);
        return this;
    }

    @Override
    public SpectrumSequencePublicMetaRecord value5(String value) {
        setDivision(value);
        return this;
    }

    @Override
    public SpectrumSequencePublicMetaRecord value6(String value) {
        setLocation(value);
        return this;
    }

    @Override
    public SpectrumSequencePublicMetaRecord value7(String value) {
        setZipCode(value);
        return this;
    }

    @Override
    public SpectrumSequencePublicMetaRecord value8(String value) {
        setHost(value);
        return this;
    }

    @Override
    public SpectrumSequencePublicMetaRecord value9(Integer value) {
        setAge(value);
        return this;
    }

    @Override
    public SpectrumSequencePublicMetaRecord value10(String value) {
        setSex(value);
        return this;
    }

    @Override
    public SpectrumSequencePublicMetaRecord value11(String value) {
        setSubmittingLab(value);
        return this;
    }

    @Override
    public SpectrumSequencePublicMetaRecord value12(String value) {
        setOriginatingLab(value);
        return this;
    }

    @Override
    public SpectrumSequencePublicMetaRecord value13(String value) {
        setHospitalized(value);
        return this;
    }

    @Override
    public SpectrumSequencePublicMetaRecord value14(String value) {
        setDeceased(value);
        return this;
    }

    @Override
    public SpectrumSequencePublicMetaRecord value15(String value) {
        setPangolinLineage(value);
        return this;
    }

    @Override
    public SpectrumSequencePublicMetaRecord values(String value1, LocalDate value2, String value3, String value4, String value5, String value6, String value7, String value8, Integer value9, String value10, String value11, String value12, String value13, String value14, String value15) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SpectrumSequencePublicMetaRecord
     */
    public SpectrumSequencePublicMetaRecord() {
        super(SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META);
    }

    /**
     * Create a detached, initialised SpectrumSequencePublicMetaRecord
     */
    public SpectrumSequencePublicMetaRecord(String sequenceName, LocalDate date, String region, String country, String division, String location, String zipCode, String host, Integer age, String sex, String submittingLab, String originatingLab, String hospitalized, String deceased, String pangolinLineage) {
        super(SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META);

        setSequenceName(sequenceName);
        setDate(date);
        setRegion(region);
        setCountry(country);
        setDivision(division);
        setLocation(location);
        setZipCode(zipCode);
        setHost(host);
        setAge(age);
        setSex(sex);
        setSubmittingLab(submittingLab);
        setOriginatingLab(originatingLab);
        setHospitalized(hospitalized);
        setDeceased(deceased);
        setPangolinLineage(pangolinLineage);
    }
}
