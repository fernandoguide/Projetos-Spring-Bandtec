package br.com.bandtec.projeto01;

import java.util.List;

public class TotalCompra {
    private  Integer quantidadeItens;
    private Double totalCompra;


    public TotalCompra(List<Compra> lista){
        this.quantidadeItens = lista.size();
        totalCompra =0.0;
        lista.forEach( item -> {
            totalCompra += (item.getValor()*item.getQuantidade());
        });
    }


    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public Double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(Double totalCompra) {
        this.totalCompra = totalCompra;
    }
}
