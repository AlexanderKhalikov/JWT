import javax.xml.bind.annotation.XmlElement;

public class InsuranceAmounts {

    private Long PD;
    private Long BI;
    private Integer MPO_Mounth;
    private Long Summary;

    public InsuranceAmounts() {
    }

    public InsuranceAmounts(Long PD, Long BI, Integer MPO_Mounth, Long summary) {
        this.PD = PD;
        this.BI = BI;
        this.MPO_Mounth = MPO_Mounth;
        this.Summary = summary;
    }

    @XmlElement(name = "PD")
    public Long getPD() {
        return PD;
    }

    public void setPD(Long PD) {
        this.PD = PD;
    }

    @XmlElement(name = "BI")
    public Long getBI() {
        return BI;
    }

    public void setBI(Long BI) {
        this.BI = BI;
    }

    @XmlElement(name = "MPO_Mounth")
    public Integer getMPO_Mounth() {
        return MPO_Mounth;
    }

    public void setMPO_Mounth(Integer MPO_Mounth) {
        this.MPO_Mounth = MPO_Mounth;
    }

    @XmlElement(name = "Summary")
    public Long getSummary() {
        return Summary;
    }

    public void setSummary(Long summary) {
        Summary = summary;
    }
}
