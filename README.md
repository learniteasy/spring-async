# spring-async

```
2019-02-02 20:31:10.978  INFO 82493 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService
2019-02-02 20:31:10.984  INFO 82493 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService  'taskExecutor'
2019-02-02 20:31:11.055  INFO 82493 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2019-02-02 20:31:11.070  INFO 82493 --- [           main] hello.Application                        : Started Application in 0.835 seconds (JVM running for 1.267)
2019-02-02 20:31:11.124  INFO 82493 --- [ GithubLookup-1] hello.GitHubLookupService                : Looking up PivotalSoftware
2019-02-02 20:31:11.124  INFO 82493 --- [ GithubLookup-2] hello.GitHubLookupService                : Looking up CloudFoundry
2019-02-02 20:31:12.675  INFO 82493 --- [ GithubLookup-1] hello.GitHubLookupService                : Looking up Spring-Projects
2019-02-02 20:31:13.740  INFO 82493 --- [           main] hello.AppRunner                          : Elapsed time: 2668
2019-02-02 20:31:13.740  INFO 82493 --- [           main] hello.AppRunner                          : --> User [name=Pivotal Software, Inc., blog=http://pivotal.io]
2019-02-02 20:31:13.740  INFO 82493 --- [           main] hello.AppRunner                          : --> User [name=Cloud Foundry, blog=https://www.cloudfoundry.org/]
2019-02-02 20:31:13.740  INFO 82493 --- [           main] hello.AppRunner                          : --> User [name=Spring, blog=http://spring.io/projects]
2019-02-02 20:31:13.741  INFO 82493 --- [           main] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@7d68ef40: startup date [Sat Feb 02 20:31:10 EST 2019]; root of context hierarchy
2019-02-02 20:31:13.743  INFO 82493 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans on shutdown
2019-02-02 20:31:13.744  INFO 82493 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'taskExecutor'
```
