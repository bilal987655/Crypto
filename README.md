Title: Filtering UI and extracting data for comparison

Description: go to https://coinmarketcap.com
show rows by 20
capture all page contents - we will let you decide what is the correct information to capture, suggestions e.g. price, name, position
filter by Algorith - "PoW"
followed by "+ Add Filter"
toggle "Mineable"
then select "All Cryptocurrencies"
select "Coins"
then select price and set minimum value to 100 and maximum to 10,000
compare page content to the content in step 3

This project shows 20 rows from the website mentioned above. Then captures all of the page's contents based on price, name and position. These are then filtered by algorith - PoW, + add filter. Mineable is then toggled. 

All of the cryptocurrencies listed are then selected

Coins are then select along with their price, the min and max values are 100 to 10,000.

I used selenium webdriver with the cucumber/gherkin format. This is an easy way to automate web UI data analysis selection.
