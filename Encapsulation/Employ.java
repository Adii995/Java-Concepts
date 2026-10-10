package Encapsulation;

public class Employ {
	private String name;
	private int age;
	private int id;
	private String company;
	private double salary ;
	private long phone;
	
	public void setAge(int age) {
		if(age>=18 && age<=65)
			this.age=age;
		else
		   System.out.println("Invalid Age");
	}
       public int getAge() {
    	   return age;
       }
      public void setName(String name) {
    	  if(name.matches("[A-Za-z\s]+"))
  			this.name=name;
  		else
  			System.out.println("Invalid Name");
      }
        public String getName() {
        	return name;
      }
        public void setId(int id) {
	     if(id>=1 && id<=99)
	        this.id=id;
	     else
	    	 System.out.println("Invalid Id");
	  }
        public int getId() {
        	return id;
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
      public void setSalary(double salary) {
    	  if(salary>=10000)
  			this.salary=salary;
  		else
  			System.out.println("Invalid Salary");
     }
     public double getSaraly() {
    	 return salary;
     }
      
    public void setPhone(long phone) {
    	if(phone>=100000000L && phone<=9999999999L)
    		this.phone=phone;
    	else
    	   System.out.println("Invalid phone");
    }
    	public long getPhone() {
    		return phone;
    	}
    	
   }
      
