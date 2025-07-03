package MultiLevelInheritance;

public class TechLead extends Developer {
	
	  public int engineersMentored;

      public TechLead(int memberId, String memberName, double monthlyPay, String role, int badgeId, String techStack, int engineersMentored, int i) {
        super(memberId, memberName, monthlyPay, role, badgeId,techStack);
        this.engineersMentored = engineersMentored;
    }

    public void mentorDevelopers() {
        System.out.println(memberName + " is mentoring " + engineersMentored + " developers.");
    }

    public void showFullProfile() {
        
    	showFullProfile();  
        buildFeature();
        mentorDevelopers();   
    
    }

}


		
		
	



