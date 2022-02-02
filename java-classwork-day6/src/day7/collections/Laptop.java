package day7.collections;

public class Laptop implements Comparable<Laptop>{
 
private int laptopId;
  private String laptopName;
  private double laptopPrice;
public Laptop(int i, String string, double d) {
	// TODO Auto-generated constructor stub
}
public int getLaptopId() {
	return laptopId;
}
public void setLaptopId(int laptopId) {
	this.laptopId = laptopId;
}
public String getLaptopName() {
	return laptopName;
}
public void setLaptopName(String laptopName) {
	this.laptopName = laptopName;
}
public double getLaptopPrice() {
	return laptopPrice;
}
public void setLaptopPrice(double laptopPrice) {
	this.laptopPrice = laptopPrice;
}
@Override
public String toString() {
	return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", laptopPrice=" + laptopPrice + "]";
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return this.laptopName.charAt(0);
}
@Override
public boolean equals(Object obj) {
	Laptop temp=(Laptop) obj;
	// TODO Auto-generated method stub
	return 

			this.laptopId==temp.getLaptopId() &&
			this.laptopName.contentEquals(temp.getLaptopName()) &&
			this.laptopPrice==temp.getLaptopPrice();
}
@Override
public int compareTo(Laptop o) {
	// TODO Auto-generated method stub
	return this.laptopId- o.getLaptopId();
}
  
}
