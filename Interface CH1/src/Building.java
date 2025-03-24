enum UsageType {ENTERTAIMENT, GOVERNMENT, RESIDENTIAL, SPORTS}

public class Building implements Mappable{

    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return null;

    }

    @Override
    public String getMarker() {
        return switch (usage){
            case ENTERTAIMENT -> Color.GREEN + " " + PointMaker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMaker.STAR;
            case SPORTS -> Color.BLACK + " " + PointMaker.PUSH_PIN;
            case RESIDENTIAL -> Color.BLUE + " " + PointMaker.SQUARE;
            default -> Color.BLACK + " " + PointMaker.CIRCLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name" : "%s", "usage" : "%s" """.formatted(name,usage);
    }
}
