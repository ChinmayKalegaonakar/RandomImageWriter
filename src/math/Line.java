package math;

public class Line {
    int x1; int y1;
    int x2; int y2;
    int slope;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.slope = (y2 - y1) / (x2 - x1);
    }

}