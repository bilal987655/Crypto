Feature: CoinMarketCap
  As a user
  I want to filter the coins by various criteria
  So that I can see the list of coins that match my selection

Scenario: Filter coins by Algorithm, mineable, cryptocurrency type and price range
  Given I am on the CoinMarketCap website
  When I show rows by 20
  And I capture all page contents
  And I filter by Algorithm - PoW
  And I follow by "+ Add Filter"
  And I toggle Mineable
  And I select All Cryptocurrencies
  And I select Coins
  And I select price and set minimum value to 100 and maximum to 10,000
  Then I compare page content to the content in step 3
