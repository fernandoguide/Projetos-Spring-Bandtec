package br.com.bandtec.corporequisicao.controllers;


import br.com.bandtec.corporequisicao.modelo.Virus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/virus")
public class VirusController {

    private Virus virus;
    List<Virus> lista = new ArrayList<>();

    @GetMapping
    public ResponseEntity getVirus() {
        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(lista);
    }
    @GetMapping("/{id}")
    public ResponseEntity getVirus(@PathVariable Integer id) {
        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        if(id >= lista.size()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(lista.get(id));
    }
    @PostMapping
    public ResponseEntity criarVirus(@RequestBody Virus novoVirus) {
        lista.add(novoVirus);
        return ResponseEntity.status(201).build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity excluirAnimal(@PathVariable Integer id) {
        if (lista.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        if(id >= lista.size()){
            return ResponseEntity.notFound().build();
        }
        lista.remove(lista.get(id));
        return ResponseEntity.ok().build();
    }
}
