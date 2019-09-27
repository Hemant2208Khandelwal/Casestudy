Feature: Purchase product

	Scenario: Alex purchases headphones

		Given user enters login details
		When user goes for product search
		And user searches the product with four keywords
		Then user makes the purchase and logout