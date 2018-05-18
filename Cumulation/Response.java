import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Response {

    private Boolean cumulation;
    private List<String> commentList;
    private Boolean success;
    private List<Point> cummulationPoints;

    public Response() {
        super();
        setCumulation(false);
        setCommentList(new ArrayList<>());
        setSuccess(false);
    }

    @XmlElement(name = "Cumulation")
    public Boolean getCumulation() {
        return this.cumulation;
    }

    public void setCumulation(Boolean cumulation) {
        this.cumulation = cumulation;
    }

    @XmlElement(name = "commentList", required = true)
    public List<String> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<String> commentList) {
        this.commentList = commentList;
    }

    @XmlElement(name = "success", required = true)
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void addComment(String comment) {
        getCommentList().add(comment);
    }

    @XmlElementWrapper
    @XmlElement(name = "Point")
    public List<Point> getCummulationPoints() {
        return cummulationPoints;
    }

    public void setCummulationPoints(List<Point> cummulationPoints) {
        this.cummulationPoints = cummulationPoints;
    }
}
