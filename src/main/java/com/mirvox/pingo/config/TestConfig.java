package com.mirvox.pingo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mirvox.pingo.entities.Strings;
import com.mirvox.pingo.repositories.StringsRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private StringsRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		List<Strings> listStrings = new ArrayList<>();
		listStrings.add(new Strings(null, "ESPAÇO LIVRE"));
		listStrings.add(new Strings(null, "ANDRÉ GANHA MEIO PONTO"));
		listStrings.add(new Strings(null, "AULA COMEÇA ATRASADA"));
		listStrings.add(new Strings(null, "'RUINDOWS'"));
		listStrings.add(new Strings(null, "'DERRUBAR O PROFESSOR'"));
		listStrings.add(new Strings(null, "'NÃO É PRA IR ATÉ A SEARA'"));
		listStrings.add(new Strings(null, "'PÁI-THOWN'"));
		listStrings.add(new Strings(null, "'PORRA NENHUMA'"));
		listStrings.add(new Strings(null, "NÃO CONSEGUE USAR O TEAMS"));
		listStrings.add(new Strings(null, "'VALENDO MEIO PONTO'"));
		listStrings.add(new Strings(null, "RESPONSA CERTA, SQN!"));
		listStrings.add(new Strings(null, "NÃO QUER DAR INTERVALO"));
		listStrings.add(new Strings(null, "ISSO O CHATGPT NÃO FAZ"));
		listStrings.add(new Strings(null, "HISTÓRIA DO ESTAGIÁRIO"));
		listStrings.add(new Strings(null, "'NÃO EXISTE ALMOÇO GRÁTIS'"));
		listStrings.add(new Strings(null, "'ISSO AQUI É FACULDADE'"));
		listStrings.add(new Strings(null, "CITAR FUTEBOL"));
		listStrings.add(new Strings(null, "POR ISSO TEM QUE VIR PRA AULA"));
		listStrings.add(new Strings(null, "MELZINHO NA CHUPETA"));
		listStrings.add(new Strings(null, "TUDO BEM AÍ PESSOAL?"));
		listStrings.add(new Strings(null, "TÁ MEIO MANCO"));
		listStrings.add(new Strings(null, "CAIU O AVIÃO"));
		listStrings.add(new Strings(null, "COMANDO BOMBOM"));
		listStrings.add(new Strings(null, "A VIDA NÃO É NEXT"));
		listStrings.add(new Strings(null, "MENCIONAR A MÃE"));

		repository.saveAll(listStrings);

	}
	
	
}
