package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/placar")
public class PlacarController {

    private int golsTime1;
    private int golsTime2;

    @GetMapping
    public String boasVindas() {
        return "Bem vindo(a) a API de placar!";
    }

    @GetMapping("/atual")
    public String placarAtual() {
        return "Placar: Time 1 " +golsTime1+
                "  x  "+
                "Time 2 "+golsTime2;
    }

    // Endpoint "/gol/{time}". Se time for 1, aumenta
    // em 1 gol o time 1. Se for 2, aumenta em 1 gol
    // o time 2. Apenas ignorar se não for 1 nem 2
    // este método retorna "void"
    @GetMapping("/gol/{time}")
    public void gol(@PathVariable("time") int time) {
        if (time == 1) {
            golsTime1++;
        }
        if (time == 2) {
            golsTime2++;
        }
    }

    // "/placar/resultado
    // retorna "O time 1 venceu!" (ou time 2)
    // OU "EMPATE" (em caso em empate, claro)
    @GetMapping("/resultado")
    public String getResultado() {
        String resultado;
        if (golsTime1 > golsTime2) {
            resultado = "O time 1 venceu";
        } else if (golsTime2 > golsTime1) {
            resultado = "O time 2 venceu";
        } else {
            resultado = "EMPATE";
        }
        return resultado;
    }

}
