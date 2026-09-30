 package Encapsulation;

public class product {
		 private String product;
		 private String productName;
		 private String company;
		 private double price;
		 private int ram;
		 private int ssd;
		 private double discount;
		 
	 public void setProduct(String product) {
		if(product.matches("[A-Za-z\s]+"))
  			this.product=product;
  		else
  			System.out.println("Invalid Product");
	 }
		 public String getProduct() {
		    	   return product;
		       }
		 public void setproductName(String productName) {
		    	  if(productName.matches("[A-Za-z\s]+"))
		  			this.productName=productName;
		  		else
		  			System.out.println("Invalid productName");
		      }
	    public String getproductName() {
		        	return productName;
		      }
	    public void setCompany(String company) {
		   if(company.matches("[A-Za-z\s]+"))
	  			this.company=company;
	  		else
	  			System.out.println("Invalid Company");
			  }
		    public String getCompany() {
		        	return company;
		        }
		  public void setPrice(double price) {
			 if(price>=40000)
		  			this.price=price;
		  		else
		  			System.out.println("Invalid Price");
		      }
		      public double getPrice() {
		    	  return price;
		      }
		      public void setRam(int ram) {
		    	  if(ram>=8 && ram<=32)
		      		this.ram=ram;
		      	else
		      	   System.out.println("Invalid ram"); 
		     }
		    public int getRam() {
		    	  return ram;
		     }
		      
		   public void setSsd(int ssd) {
		    	  if(ssd>=256 && ssd<=512)
		      		this.ssd=ssd;
		      	else
		      	   System.out.println("Invalid ram"); 
		     }
		  public int getSsd() {
		    	  return ssd;
		     }
		  public void setDiscount(double discount) {
	    	  if(discount>=0 && discount<=100)
	      		this.discount=discount;
	      	else
	      	   System.out.println("Invalid Discount"); 
	     }
	     public double getDiscount() {
	    	  return discount;
	     }
	}

