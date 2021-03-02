package primitives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    Point3D p1 =new Point3D(0d,0.5d,1d);
    Point3D p2 =new Point3D(0.0000000000000000000001d,0.4999999999999999999999999d,1d);
    @Test
    void testEquals() {
        assertEquals(p1,p2);
    }

    @Test
    void testToString() {
        System.out.println("the first point is :" + p1);
        System.out.println("the second point is :" + p2);
    }

    @Test
    void distance() {
        Point3D p3=new Point3D(0,0,2.4);
        //double result = p3.distance(p2);

        assertEquals(1.5,p3.distance(p2),0.0001);
    }
}