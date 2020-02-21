package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CarrinhoComprasController {

    List<Compra> lista = new ArrayList<>();

    @GetMapping("/carrinho/comprar/{item}/{valor}/{quantidade}")
    public void comprar(@PathVariable("valor") Double valor,
                          @PathVariable("item") String item,
                          @PathVariable("quantidade") Integer quantidade) {
        Compra c = new Compra(item,valor,quantidade);
        lista.add(c);
    }

    @GetMapping("/carrinho")
    public List<Compra> listarCarrinho() {
        Compra c = new Compra("maça",1.5,2);
        Compra c1 = new Compra("arroz",3.0,7);
        lista.addAll(Arrays.asList(c,c1));
        return lista;

    }

    @GetMapping("/carrinho/total")
    public TotalCompra calcularTotal() {
       TotalCompra totalCompra = new TotalCompra(lista);
        return totalCompra;

    }


}
