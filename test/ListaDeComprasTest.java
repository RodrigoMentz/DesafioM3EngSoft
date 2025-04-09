import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListaDeComprasTest {

    @Test
    void testAdicionarItem() {
        ListaDeCompras lista = new ListaDeCompras();
        ItemParaCompra item = new ItemParaCompra("Leite");
        lista.adicionarItem(item);
        assertEquals(1, lista.getItens().size());
        assertEquals("Leite", lista.getItens().get(0).getNome());
    }

    @Test
    void testRemoverItem() {
        ListaDeCompras lista = new ListaDeCompras();
        ItemParaCompra item = new ItemParaCompra("Café");
        lista.adicionarItem(item);
        lista.removerItem(item);
        assertTrue(lista.getItens().isEmpty());
    }

    @Test
    void testMarcarItemComoComprado() {
        ListaDeCompras lista = new ListaDeCompras();
        ItemParaCompra item = new ItemParaCompra("Açúcar");
        lista.adicionarItem(item);
        lista.marcarItemComoComprado("Açúcar");
        assertTrue(lista.getItens().get(0).isComprado());
    }
    
    @Test
    void testAdicionarItem2() {
        ListaDeCompras lista = new ListaDeCompras();
        ItemParaCompra item = new ItemParaCompra("Ovo");
        lista.adicionarItem(item);
        assertEquals(1, lista.getItens().size());
        assertEquals("Leite", lista.getItens().get(0).getNome());
    }
}