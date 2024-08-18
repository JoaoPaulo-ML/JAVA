package Project.dio.com.service;

import Project.dio.com.model.Pessoa;
import Project.dio.com.repository.PessoaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostConstruct
    public void init() {

        Pessoa individuo = new Pessoa();
        individuo.setNome("Pedro");
        individuo.setIdade(30);
        pessoaRepository.save(individuo);


        StringBuilder sb = new StringBuilder("Pessoas:\n");
        for (Pessoa pessoa : pessoaRepository.findAll()) {
            sb.append("Nome: ").append(pessoa.getNome()).append(", Idade: ").append(pessoa.getIdade()).append("\n");
        }
        System.out.println(sb.toString());
    }

}
