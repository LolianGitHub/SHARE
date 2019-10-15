Feature: Create Presales 

	Background: 
		User Log in the system
	
	@PresalesCreation
	Scenario: Create an WAN Premotion presales
		When Homepage dispaly
		Then Go to Presales page
		Then Click Create Cross icon
		Then Click the link
		