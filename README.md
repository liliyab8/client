# client
simple client identification spring boot app

There is no database use, but the comented code left to connect to H2 DB later.
The app is pure backend.
Objects id's are saved manually because of DB absent.
Each product can be assosiated to many clients.
Each client can have each product only once.


The api's and their signatures weren't noted.

I supposed that when a client tries to sight up to his account the api will identificate the customer, if yes - will authorize him and return the list of his products, if the customer doesn't exists - will create a new one.




