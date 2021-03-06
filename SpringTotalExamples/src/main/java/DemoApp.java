plugins{
        id'org.springframework.boot'version'2.2.1.RELEASE'
        id'io.spring.dependency-management'version'1.0.9.RELEASE'
        id'java'
        }

        configurations{
        compileOnly{
        extendsFrom annotationProcessor
        }
        }

        dependencies{
        
        implementation'org.springframework.boot:spring-boot-starter-thymeleaf'
        implementation'org.springframework.boot:spring-boot-starter-web'
        compileOnly'org.projectlombok:lombok'
        annotationProcessor'org.projectlombok:lombok'
        compile group:'commons-io',name:'commons-io',version:'2.6'
        compile'org.springframework:spring-orm'
        compile'org.apache.httpcomponents:httpclient:4.5.12'
        testCompile group:'junit',name:'junit',version:'4.12'
        }