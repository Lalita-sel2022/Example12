package classPractice;


public class PropertiesClassPractice 
{
	private int itemNo=123;
	private String proName="T-Shiet";
	private int itemCost;
	private int qty;
	
	
	public int getItemNo()
	{
		return itemNo;
	}
	
    public String getProName() 
    {
		return proName;
	}

	public int getItemCost() {
		return itemCost;
	}

	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}

	public int getQty() 
	{
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int totalAmount()
	{
		return qty*itemCost;
		
	}

	public static void main(String[] args)
	{
		PropertiesClassPractice product= new PropertiesClassPractice();
	
		System.out.println("Product number is :"+product.getItemNo());
		System.out.println("Product name is :"+product.getProName());
		product.setItemCost(2000);
		product.setQty(5);
		System.out.println("Product cost is :"+product.getItemCost());
		System.out.println("Product quantity is :"+product.getQty());
		
		
		
		System.out.println(product.totalAmount());
		

	}

}
