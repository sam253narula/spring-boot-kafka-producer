# spring-boot-kafka-producer basic skeleton architechture Project
Use this project as a base project for creating spring boot kafka producer ready applications

## Getting Started
Things to follow for utilizing this base project
<br>Use Eclipse IDE 
<br>Use Git bash for Kafka commands

### Prerequisites
* Install Eclipse IDE
* [Maven](https://maven.apache.org/) - Dependency Management
* Kafka for your specific OS
* Install JDK 8

## Now, Follow below Steps: 
Step 1) Run your application

Step 2) Start the zookeeper

Command:
```bash
bin/windows/zookeeper-server-start.bat config/zookeeper.properties
```
Step 3) If you want to create new topic, we don't really need this step, as we are creating the consumer in our config file in spring boot project

Command: 
```bash
bin/windows/kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example
```
Step 4) To start the consumer

Command: 
```bash
bin/windows/kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic Kafka_Example --from-beginning
```

### Referance used
https://kafka.apache.org/quickstart

