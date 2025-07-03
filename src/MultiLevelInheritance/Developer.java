package MultiLevelInheritance;

public  class Developer extends TeamMember {

	public String techStack;

	    public Developer(int memberId, String memberName, double monthlyPay, String role, int badgeId, String techStack) {
	        super(memberId, memberName, monthlyPay, role, badgeId);
	        this.techStack = techStack;
	    }

	    public  void   buildFeature() {
	    	
	        System.out.println(memberName + " is building features using " + techStack + ".");
	    }
	}

