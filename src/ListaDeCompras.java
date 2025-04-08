import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<ItemParaCompra> itens;
    private LocalDateTime dataAtualizacao;

    public ListaDeCompras() {
        this.itens = new ArrayList<>();
        this.dataAtualizacao = LocalDateTime.now();
    }

    public List<ItemParaCompra> getItens() {
        return itens;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void adicionarItem(ItemParaCompra item) {
        itens.add(item);
        atualizarData();
    }

    public void removerItem(ItemParaCompra item) {
        itens.remove(item);
        atualizarData();
    }

    public void marcarItemComoComprado(String nome) {
        for (ItemParaCompra item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                item.marcarComoComprado();
                atualizarData();
                break;
            }
        }
    }

    private void atualizarData() {
        this.dataAtualizacao = LocalDateTime.now();
    }
}