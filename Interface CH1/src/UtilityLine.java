enum UtilityType {ELECTRICACL, FIBER_OPTIC, GAS, WATER}

public class UtilityLine implements Mappable{

    private String name;
    private UtilityType utility;

    public UtilityLine(String name, UtilityType utility) {
        this.name = name;
        this.utility = utility;
    }

    @Override
    public String getLabel() {
        return name + " (" + utility + ")";
    }

    @Override
    public Geometry getShape() {
        return null;
    }

    @Override
    public String getMarker() {
        return switch (utility){
            case ELECTRICACL -> Color.GREEN + " " + PointMaker.TRIANGLE;
            case FIBER_OPTIC -> Color.RED + " " + PointMaker.STAR;
            case GAS -> Color.BLACK + " " + PointMaker.PUSH_PIN;
            case WATER -> Color.BLUE + " " + PointMaker.SQUARE;
            default -> Color.BLACK + " " + PointMaker.CIRCLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name" : "%s", "usage" : "%s" """.formatted(name,utility);
    }
}
