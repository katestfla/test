public class Customer{

/** declaring the variables */

private String name;
private String address;
private String vehicle;
private int DateOut;
private int DateIn;
private double amount;
private double charge;
private double TotalAmount;
private int CustomerCount;
private static final double BASE_CHARGE = 10;
private int DOB;
private int TelephoneNumber;

/** Creates a new instance of Class */
public Customer() {
}

/** Gets the current name of the customer
*/
public String getName()
{
return name;
}
/** Gets the current address of the customer
*/
public String getAddress()
{
return address;
}
/** Gets the current vehicle of the customer*/

public String getVehicle()
{
return vehicle;
}
/** Gets the current DateOut of the customer*/
public int getDateOut()
{
return DateOut;
}
/** Gets the current DateIn of the customer*/
public int getDateIn()
{
return DateIn;
}
/** Gets the current customer amount*/
public double getAmount()
{
return amount;
}
/** Gets the current customer charge*/
public double getCharge()
{
return charge;
}
/** gets the TotalAmount*/
public double getTotalAmount()
{
return TotalAmount;
}
/** gets the number of customers*/
public int getCustomerCount()
{
return CustomerCount;
}
/** gets the telephone number of the customer*/
public int getTelephoneNumber()
{
return TelephoneNumber;
}
/** get the DOB of the customer*/

public int DOB()
{
return DOB;
}

// open an account
public void openAccount()
{


}
  
// deposit into an account 
public void deposit(String Account, double amount)
{


}
  
// withdraw from an account 
public void withdrawal(String Account, double amount)
{


}
  
// close an account
public void closeAccout()
{


}
// sets a customer name
public void setName(String aName)
{
name.equals(aName);
}
// sets customer address
public void setAddress(String anAddress)
{
address.equals(anAddress);
}

// sets the vehicle to a customer

public void setVechile(String aVehicle)
{
vehicle = aVehicle;
}
// sets the amount
public void setAmount(double anAmount)
{
amount = anAmount;
}

// a setCharge for the customer

public void setCharge(int numberOfdaysOverdue)
{
charge = BASE_CHARGE + numberOfdaysOverdue;
}

//sets the date the vechile was issued to customer

public void setDateOut(int aDate)
{
DateOut = aDate;
}

// sets the date the vehicle was returned from customer
public void setDateIn(int aDate)
{
DateIn = aDate;
}


}


my test class for the customer

// tests the methods in the customer class
public class CustomerTest
{
public static void main(String[] args )
{
// create instance
Customer firstCustomer = new Customer();

// invoke set accesors to populate attributes

firstCustomer.setName("Joe");
firstCustomer.setDOB("4-07-85");
firstCustomer.setAddress("Berrylands");
firstCustomer.setTelephoneNumber("020-347");
firstCustomer.setVehicle("Ford");
firstCustomer.setAmount("50");
firstCustomer.setCharge("10");
firstCustomer.setDateOut("10-04-2005");
firstCustomer.setDateIn("10-05-2005");


// define variables to contain attribute values retrieved
String customerName, String customerAddress, int customerTelephoneNumber, String customerVechicle, double customerAmount, double customerCharge, int customerDateOut, int customerDateIn, int customerDOB;

//invoke get accessors to retrive attribute values
customerName = firstCustomer.getName();
customerAddress = firstCustomer.getAddress();
customerTelephoneNumber = firstCustomer.getTelephoneNumber();
customerVechicle = firstCustomer.getVechicle();
customerAmount = firstCustomer.getAmount();
customerCharge = firstCustomer.getCharge();
customerDateOut = firstCustomer.getDateOut();
customerDateIn = firstCustomer.getDateIn();
customerDOB = firstCustomer.getDOB();

// display the retrived attribute values
System.out.println("The name is " + customerName);
System.out.println("The address is" + customerAddress);
System.out.println("The telephone number is" + customerTelephoneNumber);
System.out.println("The vechile is" + customerVechicle);
System.out.println("The amount is" + customerAmount);
System.out.println("The date out is" + customerDateOut);
System.out.println("The date in is" + customerDateIn);
System.out.println("The dob is" + customerDOB);
System.out.println("The charge is" + customerCharge);
}
}
