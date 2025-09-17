package lx.project.team3.vo;

public class CategoryVO {
	int categoryNo;
	String categoryType;
	String categoryName;
	
	
	public int getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}
	public String getCategoryType() {
		return categoryType;
	}
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	@Override
	public String toString() {
		return "CategoryVO [categoryNo=" + categoryNo + ", categoryType=" + categoryType + ", categoryName="
				+ categoryName + "]";
	}
}
