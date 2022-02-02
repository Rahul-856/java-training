package first.assessment;

public class Marks
{
	public int regNo;
	public int MarksInEng;
	public int MarksInMaths;
	public int MarksInScience;
	
	
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public int getMarksInEng() {
		return MarksInEng;
	}
	public void setMarksInEng(int marksInEng) {
		MarksInEng = marksInEng;
	}
	public int getMarksInMaths() {
		return MarksInMaths;
	}
	public void setMarksInMaths(int marksInMaths) {
		MarksInMaths = marksInMaths;
	}
	public int getMarksInScience() {
		return MarksInScience;
	}
	public void setMarksInScience(int marksInScience) {
		MarksInScience = marksInScience;
	}
	
	@Override
	public String toString() {
		return "Marks [regNo=" + regNo + ", MarksInEng=" + MarksInEng + ", MarksInMaths=" + MarksInMaths
				+ ", MarksInScience=" + MarksInScience + "]";
	}
	

}
