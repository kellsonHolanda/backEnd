package br.com.aluno.SpringBootPrimeiroExemplo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.aluno.domain.Cliente;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.aluno.repository")
@EntityScan("br.com.aluno.*")  
@ComponentScan(basePackages = "br.com.aluno")
public class SpringBootPrimeiroExemploApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPrimeiroExemploApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");
		Cliente cliente = createCliente();
		repository.save(cliente);
		
	}

}
