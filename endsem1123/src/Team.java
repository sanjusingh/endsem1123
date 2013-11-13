
public class Team {
	Member member;
	ProductOwner productOwner;
	ScrumMaster scrumMaster;
	custumers_main customer;

	public Team(Member member, ProductOwner productOwner,
			ScrumMaster scrumMaster, custumers_main customer) {
		this.member=member;
		this.productOwner=productOwner;
		this.scrumMaster=scrumMaster;
		this.customer=customer;
	}

	public Team() {
		// TODO Auto-generated constructor stub
	}

}
