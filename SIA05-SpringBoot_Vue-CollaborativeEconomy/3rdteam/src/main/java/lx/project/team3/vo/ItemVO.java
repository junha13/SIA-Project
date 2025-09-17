package lx.project.team3.vo;

public class ItemVO {
	int itemNO;
	String itemName;
	String status;
	String itemContent;
	int costPerMinute;
	int categoryNO;
	int locationNo;
	String image;
	
	
	public int getItemNO() {
		return itemNO;
	}
	public void setItemNO(int itemNO) {
		this.itemNO = itemNO;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getItemContent() {
		return itemContent;
	}
	public void setItemContent(String itemContent) {
		this.itemContent = itemContent;
	}
	public int getCostPerMinute() {
		return costPerMinute;
	}
	public void setCostPerMinute(int costPerMinute) {
		this.costPerMinute = costPerMinute;
	}
	public int getCategoryNO() {
		return categoryNO;
	}
	public void setCategoryNO(int categoryNO) {
		this.categoryNO = categoryNO;
	}
	public int getLocationNo() {
		return locationNo;
	}
	public void setLocationNo(int locationNo) {
		this.locationNo = locationNo;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	@Override
	public String toString() {
		return "ItemVO [itemNO=" + itemNO + ", itemName=" + itemName + ", status=" + status + ", itemContent="
				+ itemContent + ", costPerMinute=" + costPerMinute + ", categoryNO=" + categoryNO + ", locationNo="
				+ locationNo + ", image=" + image + "]";
	}
	
	
}
