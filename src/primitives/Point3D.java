package primitives;

import java.util.Objects;

/**
 * basic Point for RayTracing project
 */
public class Point3D {
    final Coordinate _x;
    final Coordinate _y;
    final Coordinate _z;

    public Point3D(Coordinate x, Coordinate y, Coordinate z) {
        this(x.coord,y.coord, z.coord);
    }

    /**
     *
     * @param x x
     * @param y
     * @param z
     */
    public Point3D(double x, double y, double z) {
        _x =new Coordinate(x);
        _y =new Coordinate(y);
        _z =new Coordinate(z);

    }

    public Coordinate getX() {
        return _x;
    }

    public Coordinate getY() {
        return _y;
    }

    public Coordinate getZ() {
        return _z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return _x.equals(point3D._x) && _y.equals(point3D._y) && _z.equals(point3D._z);
    }

    @Override
    public String toString() {
        return "("+_x+","+_y+"," +_z+")";
    }

    /**
     *
     * @param other
     * @return (x2-x1)^2 +(y2-y1)^2 (z2-z1)^2
     */
    public double distanceSquared(Point3D other){
        final double x1= _x.coord;
        final double y1= _y.coord;
        final double z1= _z.coord;

        final double x2= other._x.coord;
        final double y2= other._y.coord;
        final double z2= other._z.coord;

        return ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1) +(z2-z1)*(z2-z1) );

    }

    /**
     *
     * @param point3D
     * @return ecluditan distance between 3Dpoint
     */
    public double distance(Point3D point3D){
        return Math.sqrt(distanceSquared(point3D));
    }

}
