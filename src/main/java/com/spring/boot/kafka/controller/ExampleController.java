package com.spring.boot.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.kafka.dto.MyIntroductionDTO;
import com.spring.boot.kafka.service.ExampleService;

@RestController
@RequestMapping("/LombokDemo")
public class ExampleController {

	@Autowired
	ExampleService example;
	
	@Autowired
    private KafkaTemplate<String, MyIntroductionDTO> kafkaTemplate;

    private static final String TOPIC = "Kafka_Example";

	@GetMapping("/hello")
	public String Hello() {
		return example.Hello();
	}
	
    @GetMapping("/publish/{name}/{experiance}/{skills}")
    public String post(@PathVariable("name") final String name, @PathVariable("experiance") final String experiance, @PathVariable("skills") final String skills) {

        kafkaTemplate.send(TOPIC, new MyIntroductionDTO(name, experiance, skills));

        return "Published successfully";
    }
}
