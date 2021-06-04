package ch.ethz.covspectrum.entity.core;


public class CaseCounts {

    private String division;
    private String ageGroup;
    private String sex;
    private int count;

    public String getDivision() {
        return division;
    }

    public CaseCounts setDivision(String division) {
        this.division = division;
        return this;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public CaseCounts setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public CaseCounts setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public int getCount() {
        return count;
    }

    public CaseCounts setCount(int count) {
        this.count = count;
        return this;
    }
}
