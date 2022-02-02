package gay10.Streams;

public class Product {
  private int pQty;
  private String pName;
  private Double pPrice;
  
  
  public Product() {
	// TODO Auto-generated constructor stub
}
public Product(int pQty, String pName, Double pPrice) {
	super();
	this.pQty = pQty;
	this.pName = pName;
	this.pPrice = pPrice;
}
public int getpQty() {
	return pQty;
}
public void setpQty(int pQty) {
	this.pQty = pQty;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public Double getpPrice() {
	return pPrice;
}
public void setpPrice(Double pPrice) {
	this.pPrice = pPrice;
}
@Override
public String toString() {
	return "Product [pQty=" + pQty + ", pName=" + pName + ", pPrice=" + pPrice + "]";
}
  
  
  
  
  
  
}



  