public class address{

	private String name;
	private String address1;
	private String phone;

	public address(){
		name = "Unknown Name";
		address1 = "Unknown Address";
		phone = "Unknown Phone Number";
	}//end constructor

	//constructor
	public address(String name, String address1, String phone){
		this.name = name;
		this.address1 = address1;
		this.phone = phone;
	}//end constructor

	public String toString(){
		return "\nName: " + name + "\nAddress: " + address1 + "\nPhone: " + phone + "\n\n";
	}//end toString

}//end class