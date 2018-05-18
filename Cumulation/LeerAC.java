import javax.xml.bind.annotation.XmlElement;

public class LeerAC {

    private Integer Down;
    private Integer Up;
    private Boolean Leer_Over_Franchise;
    private Integer Down1;
    private Integer Up1;
    private Float Percentage;
    private Integer Exposure2;

    public LeerAC(Integer down,
                  Integer up,
                  Boolean leer_Over_Franchise,
                  Integer down1,
                  Integer up1,
                  Float percentage,
                  Integer exposure2) {
        this.Down = down;
        this.Up = up;
        this.Leer_Over_Franchise = leer_Over_Franchise;
        this.Down1 = down1;
        this.Up1 = up1;
        this.Percentage = percentage;
        this.Exposure2 = exposure2;
    }

    @XmlElement(name = "Down")
    public Integer getDown() {
        return Down;
    }

    public void setDown(Integer down) {
        Down = down;
    }

    @XmlElement(name = "Up")
    public Integer getUp() {
        return Up;
    }

    public void setUp(Integer up) {
        Up = up;
    }

    @XmlElement(name = "Leer_Over_Franchise")
    public Boolean getLeer_Over_Franchise() {
        return Leer_Over_Franchise;
    }

    public void setLeer_Over_Franchise(Boolean leer_Over_Franchise) {
        Leer_Over_Franchise = leer_Over_Franchise;
    }

    @XmlElement(name = "Down1")
    public Integer getDown1() {
        return Down1;
    }

    public void setDown1(Integer down1) {
        Down1 = down1;
    }

    @XmlElement(name = "Up1")
    public Integer getUp1() {
        return Up1;
    }

    public void setUp1(Integer up1) {
        Up1 = up1;
    }

    @XmlElement(name = "Percentage")
    public Float getPercentage() {
        return Percentage;
    }

    public void setPercentage(Float percentage) {
        Percentage = percentage;
    }

    @XmlElement(name = "Exposure2")
    public Integer getExposure2() {
        return Exposure2;
    }

    public void setExposure2(Integer exposure2) {
        Exposure2 = exposure2;
    }
}
