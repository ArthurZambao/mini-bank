package br.com.arthurzambao.mini_bank;

import org.springframework.boot.SpringApplication;

public class TestMiniBankApplication {

	public static void main(String[] args) {
		SpringApplication.from(MiniBankApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
