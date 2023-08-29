package practice.algorithms;

import java.util.Objects;

public class Coordinates {
    private double cX;
    private double cY;

    public Coordinates(double cX, double cY) {
        this.cX = cX;
        this.cY = cY;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "cX=" + cX +
                ", cY=" + cY +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return Double.compare(cX, that.cX) == 0 && Double.compare(cY, that.cY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cX, cY);
    }

    public double getcX() {
        return cX;
    }

    public void setcX(double cX) {
        this.cX = cX;
    }

    public double getcY() {
        return cY;
    }

    public void setcY(double cY) {
        this.cY = cY;
    }
}
