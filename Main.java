import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Customer customer;
		
		RegularCustomer regularCustomer=new
		RegularCustomer("Jake",5000);
		
		SeniorCustomer seniorCustomer=new
		SeniorCustomer("Taehyung",3000);
		
		customer=regularCustomer;
		System.out.println(customer.getName() + "---" + "Php."+customer.calculateBill());
		
		customer=seniorCustomer;
		System.out.println(customer.getName() + "---" + "Php."+customer.calculateBill());
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
