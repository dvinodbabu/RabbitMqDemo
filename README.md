# **RABBIT MQ**


### **What?**

* Rabbitmq is a AMQP message broker.
* It is lightweight, open source, highly scalable and cross platform.
* It is like a post office.
* AMQP - Advanced Message Queuing Protocol - Developed by JPMorgan and IMatix.
* Features of AMQP are message orientation, queuing, routing (P2P & pub-sub), reliability and security.
* Used by whatsapp.

### **Why?**

* Asynchronous communication.
* Decoupled services.
* Exchange messages between different platforms.
* Management UI and a large community.

### **How?**

<img src="https://www.rabbitmq.com/img/tutorials/intro/hello-world-example-routing.png" width="700">

##### RabbitMQ Exchanges
* When producer creates a message it will not be directly sent to a queue, instead the message will be send to exchanges first.

##### RabbitMQ Queues
* Queue is a buffer that stores a messages that are sent from the exchanges to queues.

##### RabbitMQ Bindings 
* Binding is a relationship between an exchange and a queue.

##### RabbitMQ Routing key
* The routing key is a message attribute the exchange looks at when deciding how to route the message to queues

##### RabbitMQ Exchange Types

* *Direct*

 <img src="https://www.tutlane.com/images/rabbitmq/rabbitmq_direct_exchange_process_flow_diagram.PNG" width="700">

* *Fanout*

 <img src="https://www.tutlane.com/images/rabbitmq/rabbitmq_fanout_exchange_process_flow_diagram.PNG" width="700">

* *Topic*

 <img src="https://www.tutlane.com/images/rabbitmq/rabbitmq_topic_exchange_process_flow_diagram.PNG" width="700">

* *Headers*

 <img src="https://www.tutlane.com/images/rabbitmq/rabbitmq_headers_exchange_process_flow_diagram.PNG" width="700">

### **Installation**

For ubuntu follow below steps

1. sudo apt install rabbitmq-server 
2. sudo rabbitmq-server 
3. sudo rabbitmqctl status
4. sudo rabbitmq-plugins enable rabbitmq_management

For Windows

* [Windows](https://www.tutlane.com/tutorial/rabbitmq/rabbitmq-installation)

### **Links**
[Exchanges](https://www.tutlane.com/tutorial/rabbitmq/rabbitmq-exchanges)

