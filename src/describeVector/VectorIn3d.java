package describeVector;

import java.util.SortedMap;

public class VectorIn3d {
    private double pointX;
    private double pointY;
    private double pointZ;

    public VectorIn3d(double pointX, double pointY, double pointZ) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.pointZ = pointZ;
    }
//    public VectorIn3d(double v) {
//
//    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double getPointZ() {
        return pointZ;
    }

    public void setPointZ(double pointZ) {
        this.pointZ = pointZ;
    }

    public double vectorLength() {
        return  Math.sqrt((Math.pow(pointX, 2)) + (Math.pow(pointY, 2)) + (Math.pow(pointZ, 2)));
    }

    public  double scalarProduct(VectorIn3d vector){
        return this.pointX * vector.getPointX() + this.pointY * vector.getPointY() + this.pointZ * vector.getPointZ() ;
    }

    public VectorIn3d vectorProduct(VectorIn3d vector) {
        double x = this.pointY * vector.getPointZ() - this.pointZ * vector.getPointY();
        double y = this.pointZ * vector.getPointX() - this.pointX * vector.getPointZ();
        double z =  this.pointX * vector.getPointY() - this.pointY * vector.getPointX();
        VectorIn3d vector1 = new VectorIn3d (x, y, z);
        return vector1;
    }

    public double  vectorAngle(VectorIn3d vector) {
        return  scalarProduct(vector) / (vectorLength() * vector.vectorLength());
    }

    public VectorIn3d vectorPlus(VectorIn3d vector) {
        double x = this.pointX + vector.getPointX();
        double y = this.pointY + vector.getPointY();
        double z =  this.pointZ + vector.getPointZ();
        VectorIn3d vector1 = new VectorIn3d (x, y, z);
        return vector1;
    }

    public VectorIn3d vectorMinus(VectorIn3d vector) {
        double x = this.pointX - vector.getPointX();
        double y = this.pointY - vector.getPointY();
        double z =  this.pointZ - vector.getPointZ();
        VectorIn3d vector1 = new VectorIn3d (x, y, z);
        return vector1;
    }

    @Override
    public String toString() {
        return "VectorIn3d {" +
                "pointX = " + pointX +
                ", pointY = " + pointY +
                ", pointZ = " + pointZ +
                '}';
    }
}
