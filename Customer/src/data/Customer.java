package data;

public class Customer {
    private String name;
    private String address;
    private long mobileNumber;
    private String email;
    private boolean memberShip;

    public Customer(){

    }
    public Customer(String name,String address,long mobileNumber,String email,boolean memberShip){
        this.name= name;
        this.address = address;

        this.mobileNumber =   mobileNumber;
        this.email =  email;
        this.memberShip = memberShip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMemberShip() {
        return memberShip;
    }

    public void setMemberShip(boolean memberShip) {
        this.memberShip = memberShip;
    }
    public void display(){
        System.out.println("name = " + name);
        System.out.println("address = " + address);
        System.out.println("mobileNumber = " + mobileNumber);
        System.out.println("email = " + email);
        System.out.println("memberShip = " + memberShip);
    }
}
