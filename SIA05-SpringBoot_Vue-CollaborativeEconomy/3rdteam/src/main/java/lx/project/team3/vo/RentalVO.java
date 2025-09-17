package lx.project.team3.vo;

public class RentalVO {
	int rentalNo;
	String startTime;
	String expectedReturnTime;
	String realReturnTime;
	Character rentalStatus;
	String returnLocation;
	int finalCost;
	int itemNo;
	int userNo;;
	int locationNo;
	public int getRentalNo() {
		return rentalNo;
	}
	public void setRentalNo(int rentalNo) {
		this.rentalNo = rentalNo;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTiem() {
		return realReturnTime;
	}
	public void setEndTiem(String realReturnTime) {
		this.realReturnTime = realReturnTime;
	}
	public Character getRentalStatus() {
		return rentalStatus;
	}
	public void setRentalStatus(Character rentalStatus) {
		this.rentalStatus = rentalStatus;
	}
	public String getExpectedReturnTime() {
		return expectedReturnTime;
	}
	public void setExpectedReturnTime(String expectedReturnTime) {
		this.expectedReturnTime = expectedReturnTime;
	}
	public String getReturnLocation() {
		return returnLocation;
	}
	public void setReturnLocation(String returnLocation) {
		this.returnLocation = returnLocation;
	}
	public int getFinalCost() {
		return finalCost;
	}
	public void setFinalCost(int finalCost) {
		this.finalCost = finalCost;
	}
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getLocationNo() {
		return locationNo;
	}
	public void setLocationNo(int locationNo) {
		this.locationNo = locationNo;
	}
	
	
	@Override
	public String toString() {
		return "RentalVO [rentalNo=" + rentalNo + ", startTime=" + startTime + ", realReturnTime=" + realReturnTime
				+ ", rentalStatus=" + rentalStatus + ", expectedReturnTime=" + expectedReturnTime + ", returnLocation="
				+ returnLocation + ", finalCost=" + finalCost + ", itemNo=" + itemNo + ", userNo=" + userNo
				+ ", locationNo=" + locationNo + "]";
	}
	
}