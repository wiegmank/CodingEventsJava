id - unique id for user
username - string for username of user
password - strings for user's stored password 
firstName - string for first name of user
lastName - string for last name of user
email - string for email address of user

###########

Getter/setter for all fields, getter only for id field.

Additional fields/methods for "Person":
Status - to designate whether the person would be attending or hosting/running an event
List<eventsAttending> - list that stores events which user has registered to attend
List<eventsAttended> - list that stores events which user has previously attended
Profile - profile information of user could be removed from "Person" class and stored in separate "Profile" class 

###########

ManyToMany relationship between Person class and eventsAttended & eventsAttending
OneToOne relationship between Person and Profile



### APP PURPOSE ###

### STATE OF APP ###

### UPCOMING IMPROVEMENTS ###
