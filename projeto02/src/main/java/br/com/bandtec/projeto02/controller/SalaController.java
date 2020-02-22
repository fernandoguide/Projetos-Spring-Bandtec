package br.com.bandtec.projeto02.controller;


import br.com.bandtec.projeto02.entity.Sala;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sala")
public class SalaController {

    private Sala salaAtual;

    @GetMapping
    public Sala getSalaAtual() {
        return salaAtual;
    }

    @PostMapping("/cadastrar/{nome}/{capacidade}")
    public void cadastrarSala(@PathVariable("nome") String nome, @PathVariable("capacidade") Integer capacidade) {
        if (salaAtual == null)
            salaAtual = new Sala(nome, capacidade);

    }

    @PutMapping("/cadastrar/{nome}/{capacidade}")
    public void atualizarSala(@PathVariable("nome") String nome, @PathVariable("capacidade") Integer capacidade) {
        if (salaAtual != null)
            salaAtual = new Sala(nome, capacidade);

    }

    //    @RequestMapping(value = "/excluir",method = RequestMethod.DELETE)
    @DeleteMapping("/excluir")
    public void excluirSala() {
        salaAtual = null;
    }
}
