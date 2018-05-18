import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws Exception {
        System.out.println("\n--------------Demo is start--------------\n");
        System.out.println("   --------------Request--------------\n");
        JAXBContext jc = JAXBContext.newInstance(Request.class);

        List<Point> points = new ArrayList<>(2);
        points.add(new Point(55.780641, 37.473463));
        points.add(new Point(55.783981, 37.479699, 200.0));
        points.add(new Point(85.781117, 37.472131));
        points.add(new Point(55.781597, 37.472217));
        points.add(new Point(55.781597, 37.472217));

        Point toCheck = new Point(55.781117, 37.472131);
        CumulationEstimator cumulationEstimator = new CumulationEstimator();

        Request request = new Request();
        request.setListOfPoints(points);
        request.setPointToCheck(toCheck);

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(request, System.out);

        System.out.println("\n   --------------Response--------------\n");

        jc = JAXBContext.newInstance(Response.class);
        Response response = new Response();
        response.addComment("Данная версия калькулятора устарела.");
        response.setCummulationPoints(
                cumulationEstimator.getCumulationPoints(request.getListOfValidPoints(),
                        request.getPointToCheck())
        );

        if (response.getCummulationPoints().size() > 0) {
            response.setSuccess(true);
            response.getCommentList().clear();
            response.getCommentList().add("Есть кумуляция");
            response.setCumulation(true);
        } else {
            response.getCommentList().clear();
            response.getCommentList().add("Кумуляции нет");
        }

        marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(response, System.out);

        System.out.println("\n--------------Demo is finished--------------\n");
    }
}
