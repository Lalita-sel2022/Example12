package arrayOfObject;

public class Subject 
{
	private int subId;
	private String name;
	private int maxMark;
	private int marksObtain;
	
	
	public Subject(int subId, String name)
	{
		this.subId=subId;
		this.name=name;
	}
	
	public Subject(int subId, String name, int maxMark)
	{
		this.subId=subId;
		this.name=name;
		setMaxMark(maxMark);
	}
	
	public Subject(int subId, String name, int maxMark, int marksObtain)
	{
		this.subId=subId;
		this.name=name;
		setMaxMark(maxMark);
		setMarksObtain(marksObtain);
	}
	
	public void setMaxMark(int maxMark)
	{
		this.maxMark=maxMark;
	}
	public void setMarksObtain(int marksObtain)
	{
		this.marksObtain=marksObtain;
	}
	
	public int getSubId() {return subId;}
	public String getName() {return name;}
	public int getMaxMark() {return maxMark;}
	public int getMarksObtain() {return marksObtain;}
	

	
	 // @Override 
		/*
		 * public String toString() { return "\nSubject [subId=" + subId + "\nname=" +
		 * name + ",\nmaxMark=" + maxMark + ",\nmarksObtain=" + marksObtain + "]";
		 * 
		 * }
		 */
	 
	
	
	  public void display() { System.out.print("Subject id :"+ subId +
	  "Subject name :"+ name + "maximum marks :" + maxMark); System.out.println();
	  }
	 

	public static void main(String[] args)
	{
		Subject subjects[] = new Subject[2];
	    subjects[0] = new Subject(101,"Java",87);
	    subjects[1] = new Subject(102,"Operating System ",76);
	    //subjects[0].display();
	    //subjects[1].display();
	    
		/*
		 * for(int i=0;i<subjects.length;i++) {
		 * 
		 * System.out.println(subjects[i]); }
		 */
		
		  for(Subject subjet:subjects) 
		  { 
			 subjet.display();
		  }
		 
	    
	}

}
