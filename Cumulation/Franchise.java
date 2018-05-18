import javax.xml.bind.annotation.XmlElement;

public class Franchise {

    private Integer PD_Val;
    private Boolean Included_In_The_Limit;
    private Integer BI_Days;
    private Integer BI_Val;

    public Franchise() {
    }

    public Franchise(Integer PD_Val, Boolean included_In_The_Limit, Integer BI_Days, Integer BI_Val) {
        this.PD_Val = PD_Val;
        this.Included_In_The_Limit = included_In_The_Limit;
        this.BI_Days = BI_Days;
        this.BI_Val = BI_Val;
    }

    @XmlElement(name = "PD_Val")
    public Integer getPD_Val() {
        return PD_Val;
    }

    public void setPD_Val(Integer PD_Val) {
        this.PD_Val = PD_Val;
    }

    @XmlElement(name = "Included_In_The_Limit")
    public Boolean getIncluded_In_The_Limit() {
        return Included_In_The_Limit;
    }

    public void setIncluded_In_The_Limit(Boolean included_In_The_Limit) {
        Included_In_The_Limit = included_In_The_Limit;
    }

    @XmlElement(name = "BI_Days")
    public Integer getBI_Days() {
        return BI_Days;
    }

    public void setBI_Days(Integer BI_Days) {
        this.BI_Days = BI_Days;
    }

    @XmlElement(name = "BI_Val")
    public Integer getBI_Val() {
        return BI_Val;
    }

    public void setBI_Val(Integer BI_Val) {
        this.BI_Val = BI_Val;
    }
}
