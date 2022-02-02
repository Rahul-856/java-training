package statics;

public class Account {
private int accid;
private String accname;
private static int counter=100;


public Account(String accname) {
	this.accid=counter++;
	this.accname = accname;
}
public int getAccid() {
	return accid;
}

public String getAccname() {
	return accname;
}
public void setAccname(String accname) {
	this.accname = accname;
}
public static int getCounter() {
	return counter;
}

@Override
public String toString() {
	return "Account [accid=" + accid + ", accname=" + accname + "]";
}



}
