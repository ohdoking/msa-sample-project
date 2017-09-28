package com.ohdoking.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//spring boot 에서 제공하는 고도로 추상화된 해당 annotation을 넣어주면 설정 완료
@SpringBootApplication
public class MsaSampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaSampleProjectApplication.class, args);
	}
}
