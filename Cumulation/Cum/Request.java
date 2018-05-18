import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@XmlRootElement
public class Request {

    private List<Point> listOfPoints = new ArrayList<>();
    private Point pointToCheck;

    public Request() {
        super();
    }

    @XmlTransient
    public List<Point> getListOfPoints() {
        return this.listOfPoints;
    }

    public void setListOfPoints(List<Point> listOfPoints) {
        this.listOfPoints = listOfPoints;
    }

    @XmlElement(name = "PointToCheck")
    public Point getPointToCheck() {
        return pointToCheck;
    }

    public void setPointToCheck(Point pointToCheck) {
        this.pointToCheck = pointToCheck;
    }

    public List<Point> getListOfValidPoints() {
        return getListOfPoints()
                .stream()
                .filter(point -> point.getRadius() > 0)
                .collect(Collectors.toList());
    }

    public void addPoint(Double longitude, Double latitude, Double radius) {
        getListOfPoints().add(new Point(longitude, latitude, radius));
    }
}
