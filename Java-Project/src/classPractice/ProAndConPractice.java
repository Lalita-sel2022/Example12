package classPractice;

public class ProAndConPractice 
{
	private int itemNo;
	private String proName;
	private double itemCost;
	private int qty;
	
	
	/*
	 * public ProAndConPractice(double price, int quantity) { itemCost=price;
	 * qty=quantity; //setitemCost(price); //setQty(quantity);
	 * 
	 * }
	 */
	
	 public ProAndConPractice(int itemNo ,String name, double price, int quantity)
	 {
		 this.itemNo=itemNo;
		 proName=name;
		 setitemCost(price);
		 setQty(quantity);
	 }
	
	
    
	public void setitemCost(double itemCost)
    {
    	this.itemCost=itemCost;
    }
    
    public void setQty(int qty)
    {
    	this.qty=qty;
    }
    
    public int getItemNo(){return  itemNo;}
    public String getProName(){return  proName;}
    public double getItemCost() {return  itemCost;}
    public int getQty(){return  qty;}
    

	public static void main(String[] args) 
	{
		ProAndConPractice pro= new ProAndConPractice(120,"T-Shirt",4000,3);
		System.out.println(pro.getItemCost());
		System.out.println(pro.getItemNo());
		System.out.println(pro.getProName());
		System.out.println(pro.getQty());

	}

}
