/*
 * This file is generated by jOOQ.
 */
package org.jooq.covspectrum;


import org.jooq.covspectrum.tables.ConsensusSequence;
import org.jooq.covspectrum.tables.GisaidSequence;
import org.jooq.covspectrum.tables.SpectrumAccount;
import org.jooq.covspectrum.tables.SpectrumSequenceIntensity;
import org.jooq.covspectrum.tables.SpectrumSequencePrivateMeta;
import org.jooq.covspectrum.tables.SpectrumSequencePrivateMutationAa;
import org.jooq.covspectrum.tables.SpectrumSequencePublicMeta;
import org.jooq.covspectrum.tables.SpectrumSequencePublicMutationAa;
import org.jooq.covspectrum.tables.VariantMutationAa;
import org.jooq.covspectrum.tables.VariantMutationNucleotide;


/**
 * Convenience access to all tables in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.consensus_sequence</code>.
     */
    public static final ConsensusSequence CONSENSUS_SEQUENCE = ConsensusSequence.CONSENSUS_SEQUENCE;

    /**
     * The table <code>public.gisaid_sequence</code>.
     */
    public static final GisaidSequence GISAID_SEQUENCE = GisaidSequence.GISAID_SEQUENCE;

    /**
     * The table <code>public.spectrum_account</code>.
     */
    public static final SpectrumAccount SPECTRUM_ACCOUNT = SpectrumAccount.SPECTRUM_ACCOUNT;

    /**
     * The table <code>public.spectrum_sequence_intensity</code>.
     */
    public static final SpectrumSequenceIntensity SPECTRUM_SEQUENCE_INTENSITY = SpectrumSequenceIntensity.SPECTRUM_SEQUENCE_INTENSITY;

    /**
     * The table <code>public.spectrum_sequence_private_meta</code>.
     */
    public static final SpectrumSequencePrivateMeta SPECTRUM_SEQUENCE_PRIVATE_META = SpectrumSequencePrivateMeta.SPECTRUM_SEQUENCE_PRIVATE_META;

    /**
     * The table <code>public.spectrum_sequence_private_mutation_aa</code>.
     */
    public static final SpectrumSequencePrivateMutationAa SPECTRUM_SEQUENCE_PRIVATE_MUTATION_AA = SpectrumSequencePrivateMutationAa.SPECTRUM_SEQUENCE_PRIVATE_MUTATION_AA;

    /**
     * The table <code>public.spectrum_sequence_public_meta</code>.
     */
    public static final SpectrumSequencePublicMeta SPECTRUM_SEQUENCE_PUBLIC_META = SpectrumSequencePublicMeta.SPECTRUM_SEQUENCE_PUBLIC_META;

    /**
     * The table <code>public.spectrum_sequence_public_mutation_aa</code>.
     */
    public static final SpectrumSequencePublicMutationAa SPECTRUM_SEQUENCE_PUBLIC_MUTATION_AA = SpectrumSequencePublicMutationAa.SPECTRUM_SEQUENCE_PUBLIC_MUTATION_AA;

    /**
     * The table <code>public.variant_mutation_aa</code>.
     */
    public static final VariantMutationAa VARIANT_MUTATION_AA = VariantMutationAa.VARIANT_MUTATION_AA;

    /**
     * The table <code>public.variant_mutation_nucleotide</code>.
     */
    public static final VariantMutationNucleotide VARIANT_MUTATION_NUCLEOTIDE = VariantMutationNucleotide.VARIANT_MUTATION_NUCLEOTIDE;
}