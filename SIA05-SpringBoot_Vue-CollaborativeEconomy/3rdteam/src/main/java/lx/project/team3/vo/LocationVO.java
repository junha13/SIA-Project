package lx.project.team3.vo;

public class LocationVO {
	int locationNo;
	double lattitude;
	double longtude;
	
	
	
	public int getLocationNo() {
		return locationNo;
	}
	public void setLocationNo(int locationNo) {
		this.locationNo = locationNo;
	}
	public double getLattitude() {
		return lattitude;
	}
	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}
	public double getLongtude() {
		return longtude;
	}
	public void setLongtude(double longtude) {
		this.longtude = longtude;
	}
	
	
	@Override
	public String toString() {
		return "LocationVO [locationNo=" + locationNo + ", lattitude=" + lattitude + ", longtude=" + longtude + "]";
	}
}
