package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * 
 * The @EnableAsync annotation switches on Spring’s ability to run @Async
 * methods in a background thread pool. This class also customizes the used
 * Executor by defining a new bean. Here the method is named taskExecutor since
 * this is the specific method name Spring will search for. In our case, we want
 * to limit the number of concurrent threads to 2 and limit the size of the
 * queue to 500. There are many more things you can tune. If the user does not
 * define an Executor bean Spring will create a SimpleAsyncTaskExecutor and use
 * that.
 *
 */
@SpringBootApplication
@EnableAsync
public class Application {

	public static void main(String[] args) {
		// close the application context to shut down the custom ExecutorService
		SpringApplication.run(Application.class, args).close();
	}

	@Bean
	public Executor taskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(2);
		executor.setMaxPoolSize(2);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("GithubLookup-");
		executor.initialize();
		return executor;
	}

}