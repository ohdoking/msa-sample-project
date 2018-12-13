# msa-sample-project
스프링 부트를 활용하여 msa sample 애플리케이션을 만들어봄.


## Spring boot 란?
> Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run". We take an opinionated view of the Spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need very little Spring configuration.

### @SpringBootApplication
spring boot 에서 제공하는 고도로 추상화된 해당 annotation을 넣어주면 설정 완료
해당 어노테이션은 3가지 어노테이션이 결합되어 있음
1. @Configuration
2. @EnableAutoConfiguration
3. @ComponentScan

@Configuration tags the class as a source of bean definitions for the application context.
@EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings. Technically, Spring Boot doesn’t have anything to auto-configure when it comes to scheduling but a future version might.
@ComponentScan tells Spring to look for other components, configurations, and services

### 독립 실행가능 한 jar
spring boot는 특별한 launcher를 사용하여 독립된 형태로 실행가능
1. jarLauncher
2. warLauncher

실행파일 내부에 의존성이 있는 라이브러리들이 repackage 작업을 통하여 별도의 디렉토리 구조로 복사되어 빌드 
1. spring boot:run
2. spring boot:repackage




## 참고
- http://www.namooz.com/2016/02/09/springbootapplication-meaning/
- https://www.slideshare.net/heungrae_kim/spring-boot-docker-msa



