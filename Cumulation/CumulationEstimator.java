import java.util.List;
import java.util.stream.Collectors;

public class CumulationEstimator {

    private static final int r = 6371000;  // радиус Земли
    private static final int d = 42;       // расстояние между обектами (для теплового излучения)
    private static final int delta = 50;   // погрешность
    private static final int dStrih = 300; // промежуточный незастрахованный объект (указывает пользователь)

    public static int getR() {
        return r;
    }

    public static int getD() {
        return d;
    }

    public static int getDelta() {
        return delta;
    }

    public static int getdStrih() {
        return dStrih;
    }

    public Double getL(Point point1, Point point2) {
        return (2 * Math.PI * getR() / 360)
                * (Math.sqrt(Math.pow(point2.getLongitude() - point1.getLongitude(), 2)
                * Math.pow(Math.cos((point1.getLatitude() + point2.getLatitude()) / 2), 2)
                + Math.pow(point2.getLatitude() - point1.getLatitude(), 2)));
    }

    public List<Point> getCumulationPoints(List<Point> pointList, Point point) {
        return pointList.stream()
                .filter(p -> p.getRadius() + point.getRadius() + getD() + 2*getDelta() + getdStrih()>= getL(p, point))
                .collect(Collectors.toList());
    }

    public List<Point> getCumulationPointsWithFlatCoordinates(List<Point> pointList, Point point) {
        return pointList.stream()
                .filter( p -> p.getRadius() + point.getRadius() >=
                        Math.sqrt(Math.pow((p.getLatitude() - point.getLatitude()), 2) +
                                Math.pow(p.getLongitude() - point.getLongitude(), 2)) )
                .filter( p -> p.getRadius() +
                        Math.sqrt(Math.pow((p.getLatitude() - point.getLatitude()), 2) +
                                Math.pow(p.getLongitude() - point.getLongitude(), 2)) >=
                        point.getRadius() )
                .filter( p -> p.getRadius() <= point.getRadius() +
                        Math.sqrt(Math.pow((p.getLatitude() - point.getLatitude()), 2) +
                                Math.pow(p.getLongitude() - point.getLongitude(), 2)) )
                .collect(Collectors.toList());
    }


}
