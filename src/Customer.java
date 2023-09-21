 
	public class Customer {
	 
	    public Customer(int id, String firstname, String lastname) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
		}

	    public Customer( ) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
		}
		public int getId() {
			return id;
		}

		public String getFirstname() {
			return firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		protected int id;
	    
	    
	    protected String firstname;
	    
	    
	    protected String lastname;
	    
	    
	    
	 
}
