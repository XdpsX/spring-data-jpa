package com.alibou.jpa;

import com.alibou.jpa.models.Author;
import com.alibou.jpa.models.Video;
import com.alibou.jpa.repositories.AuthorRepository;
import com.alibou.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository,
			VideoRepository videoRepository
	) {
		return args -> {
				/*var author = Author.builder()
						.firstName("alibou")
						.lastName("alibou")
						.age(34)
						.email("contact@aliboucoding.com")
						.build();
				repository.save(author);*/
			var video = Video.builder()
					.name("abc")
					.length(5)
					.build();
			videoRepository.save(video);
		};
	}

}
