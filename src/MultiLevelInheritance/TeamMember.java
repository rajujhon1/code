package MultiLevelInheritance;

public class TeamMember {
	
	public int memberId;
    public String memberName;
    public double monthlyPay;
    public String role;
    public int badgeId;

    public TeamMember(int memberId, String memberName, double monthlyPay, String role, int badgeId) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.monthlyPay = monthlyPay;
        this.role = role;
        this.badgeId = badgeId;
    }

    public void showProfile() {
        System.out.println("Member ID: " + memberId + ", Name: " + memberName + ", Role: " + role + ", Pay: ₹" + monthlyPay);
    }
}

