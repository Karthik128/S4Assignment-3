
public class EncapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapExample encap=new EncapExample();
		
		encap.setfirstName("Karthik");
		encap.setlastName("M");
		encap.setIdnum("01328");
		encap.setAge(28);
		
		System.out.print("First Name: "+encap.getFirstName()+"\n"+"Last Name: "+encap.getLastName()+"\n"+"Age: "+encap.getAge()+"\n"+"ID Number: "+ encap.getIdnum());

	}

}
