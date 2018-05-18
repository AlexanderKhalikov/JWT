import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

@XmlType(propOrder = {"number", "latitude", "longitude", "radius", "typeOfInsurance",
                    "insuranceAgent", "numberOfContract", "startDate", "endDate",
                    "prolongation", "uninsuredBuildings", "currency", "insuranceAmounts",
                    "franchise", "limit", "pml", "exposure", "exposure1", "obligatorilyRisk"})
public class Point {

    private static final AtomicInteger count = new AtomicInteger(0);

    private Double longitude;
    private Double latitude;
    private Double radius;
    private Integer number;
    private String typeOfInsurance;
    private String insuranceAgent;
    private Integer numberOfContract;
    private Date startDate;
    private Date endDate;
    private Boolean prolongation;
    private Boolean uninsuredBuildings;
    private String currency;
    private InsuranceAmounts insuranceAmounts;
    private Franchise franchise;
    private Limit limit;
    private Integer pml;
    private Integer exposure;
    private Integer exposure1;
    private Boolean obligatorilyRisk;

    public Point() {
        super();
        this.longitude = 0.0;
        this.latitude = 0.0;
        this.radius = 50.0;
        this.number = count.incrementAndGet();
    }

    public Point(Double latitude, Double longitude) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.radius = 50.0;
    }

    public Point(Double latitude, Double longitude, Double radius) {
        super();
        this.longitude = longitude;
        this.latitude = latitude;
        this.radius = radius + 50.0;
//        this.Number = count.incrementAndGet();
    }

    @XmlElement(name = "longitude")
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @XmlElement(name = "latitude")
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @XmlElement(name = "radius")
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @XmlElement(name = "number")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @XmlElement(name = "typeOfInsurance")
    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }

    public void setTypeOfInsurance(String typeOfInsurance) {
        this.typeOfInsurance = typeOfInsurance;
    }

    @XmlElement(name = "insuranceAgent")
    public String getInsuranceAgent() {
        return insuranceAgent;
    }

    public void setInsuranceAgent(String insuranceAgent) {
        this.insuranceAgent = insuranceAgent;
    }

    @XmlElement(name = "numberOfContract")
    public Integer getNumberOfContract() {
        return numberOfContract;
    }

    public void setNumberOfContract(Integer numberOfContract) {
        this.numberOfContract = numberOfContract;
    }

    @XmlElement(name = "startDate")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @XmlElement(name = "endDate")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @XmlElement(name = "prolongation")
    public Boolean getProlongation() {
        return prolongation;
    }

    public void setProlongation(Boolean prolongation) {
        this.prolongation = prolongation;
    }

    @XmlElement(name = "uninsuredBuildings")
    public Boolean getUninsuredBuildings() {
        return uninsuredBuildings;
    }

    public void setUninsuredBuildings(Boolean uninsuredBuildings) {
        this.uninsuredBuildings = uninsuredBuildings;
    }

    @XmlElement(name = "currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @XmlElement(name = "insuranceAmounts")
    public InsuranceAmounts getInsuranceAmounts() {
        return insuranceAmounts;
    }

    public void setInsuranceAmounts(InsuranceAmounts insuranceAmounts) {
        this.insuranceAmounts = insuranceAmounts;
    }

    @XmlElement(name = "franchise")
    public Franchise getFranchise() {
        return franchise;
    }

    public void setFranchise(Franchise franchise) {
        this.franchise = franchise;
    }

    @XmlElement(name = "limit")
    public Limit getLimit() {
        return limit;
    }

    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    @XmlElement(name = "pml")
    public Integer getPml() {
        return pml;
    }

    public void setPml(Integer pml) {
        this.pml = pml;
    }

    @XmlElement(name = "exposure")
    public Integer getExposure() {
        return exposure;
    }

    public void setExposure(Integer exposure) {
        this.exposure = exposure;
    }

    @XmlElement(name = "exposure1")
    public Integer getExposure1() {
        return exposure1;
    }

    public void setExposure1(Integer exposure1) {
        this.exposure1 = exposure1;
    }

    @XmlElement(name = "obligatorilyRisk")
    public Boolean getObligatorilyRisk() {
        return obligatorilyRisk;
    }

    public void setObligatorilyRisk(Boolean obligatorilyRisk) {
        this.obligatorilyRisk = obligatorilyRisk;
    }
}
