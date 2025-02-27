public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance()
    {
        double result = x*x + y*y;
        return  Math.sqrt(result);
    }

    public double distance(int x,int y)
    {
        double result = (x-this.x) * (x-this.x) + (y-this.y) * (y-this.y) ;
        return  Math.sqrt(result);
    }

    public double distance(Point B)
    {
        double result = (B.x - this.x) * (B.x - this.x)  + (B.y - this.y) * (B.y - this.y);
        return  Math.sqrt(result);
    }
}
