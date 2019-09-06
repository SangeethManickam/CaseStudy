Feature: Login


Scenario Outline: Login to TestMeApp
	Given user open the TestMeApp
	When User click the signin button
	And Enter the "<username>"
	And Enter password the "<password>"
	Then click the signin button

 Examples:
| username | password |
| Alex | Alex@123 |
