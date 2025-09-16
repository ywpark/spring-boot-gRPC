# Spring Boot gRPC 연동 샘플

## 모듈별 빌드 환경

### common
- java 17
- gradle 8.14

### server
- Spring Boot: 3.5.5
- gradle 8.14
- 
### client
- Spring Boot: 3.5.5
- gradle 8.14

## 실행 방법
1. ./gradlew build
2. ./gradlew :server:bootRun
3. ./gradlew :client:bootRun