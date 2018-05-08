public class employee{

	private String name;
	private int id;
	private String address;
	private int phone;

	public void setName(String name){
		this.name = name;
	}//end setName

	public void setID(int id){
		this.id = id;
	}//end setID

	public void setAddress(String address){
		this.address = address;
	}//end setAddress

	public void setPhone(int phone){
		this.phone = phone;
	}//end setPhone

	public String getName(){
		return name;
	}//end getName

	public int getID(){
		return id;
	}//end getID

	public String getAddress(){
		return address;
	}//end getAddress

	public int getPhone(){
		return phone;
	}//end getPhone

	public String toString(){
		return "\nEmployee Name: " + name + "\nEmployee ID: " + id + "\nEmployee Address: " + address + "\nEmployee Phone: " + phone + "\n\n";
	}//end toString

}//end class