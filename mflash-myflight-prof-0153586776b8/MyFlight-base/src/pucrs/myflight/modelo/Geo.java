package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double distancia(Geo p2) {
		//Geo aux = new Geo(latitude, longitude);
		return distancia(this, p2);
	}
	
	public static double distancia(Geo p1, Geo p2) {
		double lat1 = Math.toRadians(p1.latitude);
		double lat2 = Math.toRadians(p2.latitude);
		double lon1 = Math.toRadians(p1.longitude);
		double lon2 = Math.toRadians(p2.longitude);
		
		double diflat = (lat1 - lat2)/2;
		double diflon = (lon1 - lon2)/2;
		
		double d = Math.pow(Math.sin(diflat), 2)
				+ Math.pow(Math.sin(diflon), 2) * Math.cos(lat1) * Math.cos(lat2);
		
		d = 2 * 6371 * Math.asin(Math.sqrt(d));
		
		return d;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
}
