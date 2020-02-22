package br.com.bandtec.projeto02.controller;

import br.com.bandtec.projeto02.entity.Sala;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/controle-salas")
public class ControleSalasController {
    private List<Sala> salas = new ArrayList<>();

    @GetMapping
    public List<Sala> getSalas() {
        return salas;
    }

    @PostMapping("/criar/{nome}/{capacidade}")
    public void cadastrarSala(@PathVariable("nome") String nome, @PathVariable("capacidade") Integer capacidade) {
            salas.add(new Sala(nome, capacidade));
    }
}
