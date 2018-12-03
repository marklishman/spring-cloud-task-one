package io.lishman.taskone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
@EnableTask
public class TaskOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskOneApplication.class, args);
    }

    @Bean
    public TaskOne taskOne() {
        return new TaskOne();
    }

    public class TaskOne implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {
            Arrays.stream(args).forEach(
                    System.out::println
            );
        }
    }
}
