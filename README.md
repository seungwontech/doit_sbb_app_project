## 스프링 부트
- 정의: 웹 애플리케이션을 쉽고 빠르게 만들 수 있도록 도와주는 자바의 웹 프레임워크.
- 특징: 스프링 프레임워크에 톰캣이라는 서버를 내장하여, 별도의 WAS 설정 없이 바로 실행 가능.

## 웹 프레임워크
- 정의: 웹 개발에 필요한 다양한 기능을 제공하며, 개발자가 반복적인 작업을 피하고, 코드의 재사용성을 높이고, 애플리케이션의 유지보수를 쉽게 할 수 있도록 돕는 소프트웨어 툴.
- 장점: 효율적인 개발, 코드 관리 용이, 보완 기능 제공 등.
  
## 스프링 부트를 배워야 하는 이유
- 생산성: 웹 애플리케이션을 쉽고 빠르게 개발할 수 있는 다양한 도구와 기능 제공.
- SQL인젝션, XSS, CSRF, 클릭재킹과 같은 보안 위협에 대한 기본적인 방어책을 제공.
  - 기본적인 보완 설정 외에도, 추가적인 보안 조치와 설정 가능.

## 스프링부트는 WAS가 필요 없다
- 내장서버: 톰캣 서버가 내장되어 있고 설정도 자동 적용되어 있음.
- 배포: 배포되는 jar 파일에도 톰캣 서버가 내장되어 있음.
- 유연성: 스프링 부트로 작성하더라도 톰캣 대신 다른 WAS를 사용할 수 있음.

### WAS란
- 정의: 웹 애플리케이션과 서버 환경을 연결하는 중간 역할을 하는 소프트웨어 플랫폼.
- 역할: 사용자가 웹 브라우저로 보낸 요청을 처리하고, 그 결과를 반환하여 사용자에게 보여줌.
- 종류: 제이보스, 제우스, 아파치 톰캣 등.

## 스프링 부트는 설정이 쉽다
- 자동 설정: 스프링 부트는 복잡한 설정을 자동화하여, 최소한의 설정으로 애플리케이션을 시작할 수 있도록 함.
- 단순화: 이전의 복잡한 스프링 설정을 단순화하여, 초보자도 쉽게 스프링 프레임워크를 사용할 수 잇도록 지원.

## build.gradle와 Maven 비교
- Maven은 표준화와 간편성을 제공하는 반면, Gradle은 유연성과 확장성에서 강점을 보임.
- Maven은 XML을 기반, Gradle은 코드 기반의 DSL을 사용.
- Gradle은 일반적으로 더 빠른 빌드 시간을 제공하며, 특히 대규모 프로젝트에서 빌드 성능이 뛰어남.

## ORM이란
- 객체 지향 프로그래밍 언어에서 데이터베이스의 데이터를 객체로 매핑하는 기술
- 개발자가 데이터베이스와 상호 작용할 때 SQL 쿼리를 직접 작성하지 않고도, 객체 지향 언어의 객체와 메서드를 사용하여 데이터베이스 작업을 수행할 수 있도록 함.
- DBMS의 종류에 관계없이 일관된 자바 코드를 사용할 수 있어 프로그램을 유지보수가 편리함.

## JPA란
- 자바 표준 ORM API로, 자바 객체와 관계형 데이터베이스 간의 데이터 관리 작업을 단순화 하고 표준화함.
- 하이버네이트(Hibernate)는 JPA의 인터페이스를 구현한 실제 클래스이자 자바의 ORM 프레임워크로 스프링 부트에서 데이터베이스를 관하하기 쉽게 도와줌.

