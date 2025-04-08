public class ItemParaCompra {
    private String nome;
    private boolean comprado;

    public ItemParaCompra(String nome) {
        this.nome = nome;
        this.comprado = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean isComprado() {
        return comprado;
    }

    public void marcarComoComprado() {
        this.comprado = true;
    }

    public void desmarcarComoComprado() {
        this.comprado = false;
    }
}