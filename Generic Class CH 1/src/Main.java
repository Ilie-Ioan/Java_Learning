public class Main {

    public static void main(String[] args) {

        var nationalROParks = new Park[]{
                new Park("Copou", "44.4882, -110.5916"),
                new Park("Herastrau", "36.0636, -112.1079"),
                new Park("Mihai Eminescu", "37.8855, -119.5360")

        };

        Layer<Park> parkLayer = new Layer<>(nationalROParks);
        parkLayer.renderLayer();

        var majorRORivers = new River[]{
                new River("Danube", "1.075, 33.250, 20.000"),
                new River("Mures", "761, 27.890, 1.044"),
                new River("Prut", "742, 10.990, 726")
        };

        Layer<River> riverLayer = new Layer<>(majorRORivers);
        riverLayer.addElements(
                new River("Vasluiet","650, 25.330, 855")
        );

        riverLayer.renderLayer();

    }
}
