package com.spring.boot.kafka.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public final class MyIntroductionDTO {

	private final String name;
	private final String experiance;
	private final String skills;

}
