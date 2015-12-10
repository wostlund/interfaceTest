public class Sphere extends Circle implements Volume{

    public Sphere(double radius, String name){
	super(radius,name);
    }

    public String toString(){
	return "FIXME!";
    }

    public double getVolume(){
	return Math.PI * Math.pow(getRadius(), 3);
    }
}
