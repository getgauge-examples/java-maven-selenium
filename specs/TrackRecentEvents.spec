Track recent events
===================

* Open the home page

Admin dashboard should reflect recently created customers
---------------------------------------------------------
tags: dashboard, register

* Register as "customer" with email "customer@example.com" and "password"
* Admin dashboard should reflect recent customer "customer@example.com"
* Delete customer "customer@example.com"
* Admin dashboard should not show customer "customer" in recent customers

Admin dashboard should reflect Recently created orders
------------------------------------------------------
tags: dashboard, order

* Register as "customer" with email "customer@example.com" and "password"
* Customer with credentials "customer" and "password" shops for Products 

     |Product                                                                |
     |-----------------------------------------------------------------------|
     |The Ruby Programming Language                                          |
     |Programming Ruby 1.9: The Pragmatic Programmers' Guide (Facets of Ruby)|
* Admin dashboard should reflect recent order of "customer@example.com" dated "TODAY"
* Delete customer