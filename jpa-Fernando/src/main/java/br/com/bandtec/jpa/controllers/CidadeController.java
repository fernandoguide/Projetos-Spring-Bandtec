package br.com.bandtec.jpa.controllers;

import br.com.bandtec.jpa.entidades.Cidade;
import br.com.bandtec.jpa.repositorios.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

import static org.springframework.http.ResponseEntity.ok;


@RestController
@RequestMapping("/cidades")
public class CidadeController {


    @Autowired
    private CidadeRepository repository;

    @PostMapping
    public ResponseEntity criarCidade(@RequestBody Cidade novaCidade) {
        this.repository.save(novaCidade);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(novaCidade.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    public ResponseEntity listarTodos() {
        if (this.repository.count() > 0) {
            return ResponseEntity.ok().body(this.repository.findAll());
        } else {
            return ResponseEntity.noContent().build();
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity getCidade(@PathVariable Integer id) {
        Optional<Cidade> consultaCidade = this.repository.findById(id);
        if (consultaCidade.isPresent()) {
            return ResponseEntity.ok(consultaCidade.get()); // status 200-ok
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/contagem")
    public ResponseEntity contagem() {
        if (this.repository.count() > 0) {
            return ResponseEntity.ok().body(this.repository.count());
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluirCidade(@PathVariable Integer id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
