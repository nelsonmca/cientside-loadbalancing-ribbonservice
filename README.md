# cientside-loadbalancing-ribbonservice


create 2 instance of the same service with different port say 4444,5555

start the application in order:

-> start discovery-service
-> start ribbon-time-service with port 4444
-> start ribbon-time-service with port 5555

URL: 
	http://localhost:5555
	http://localhost:4444