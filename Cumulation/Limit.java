
public class Limit {

    private Integer PD_Val;
    private Integer BI_Val;
    private Integer TotalContractualLimit;

    public Limit() {
        super();
    }

    public Limit(Integer PD_Val, Integer BI_Val, Integer totalContractualLimit) {
        this.PD_Val = PD_Val;
        this.BI_Val = BI_Val;
        this.TotalContractualLimit = totalContractualLimit;
    }

    public Integer getPD_Val() {
        return PD_Val;
    }

    public void setPD_Val(Integer PD_Val) {
        this.PD_Val = PD_Val;
    }

    public Integer getBI_Val() {
        return BI_Val;
    }

    public void setBI_Val(Integer BI_Val) {
        this.BI_Val = BI_Val;
    }

    public Integer getTotalContractualLimit() {
        return TotalContractualLimit;
    }

    public void setTotalContractualLimit(Integer totalContractualLimit) {
        TotalContractualLimit = totalContractualLimit;
    }
}
