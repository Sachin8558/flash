package beautysaloon;

public class Customer {
	String name;
	boolean member=false;
	String memberType;
	
	Customer(String name){
		this.name=name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMember() {
		return member;
	}
	
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
	}
	
	
	
	
}
