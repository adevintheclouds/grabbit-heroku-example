
######################
# Grabbit

An example, multi node, groovy / grails app with RabbitMQ providing the glue, Heroku the home.	

######################
# Getting Started:

*These instructions assume that you are working on MacOS, other OS may vary :)*

Setup environment:

1. Ensure that RabbitMQ is installed

- http://www.rabbitmq.com/download.html

2. Install the Heroku toolbelt (includes foreman)

- https://toolbelt.heroku.com/

Start the application locally:

1. Ensure RabbitMQ is running

- sudo rabbitmq-server start

2. Run the following command:

- make start

3. Check it out!

- http://localhost:8080/web/

4. (optional) Scale processes by running forman manually

- ./gradlew build
- foreman start -f Procfile-dev -c web=1,address_lookup=2

Setup Heroku:

Coming soon...

1. Sign up for account

2. Login

3. Create application

4. Add CloudAMQP service

Deploy to Heroku:

Coming soon...

1. git push!

2. Have a look...

3. Scale the processes...

IDE Support

./gradlew idea





