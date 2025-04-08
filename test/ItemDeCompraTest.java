import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemDeCompraTest {

    @Test
    void testCriacaoItem() {
        ItemParaCompra item = new ItemParaCompra("Arroz");
        assertEquals("Arroz", item.getNome());
        assertFalse(item.isComprado());
    }

    @Test
    void testMarcarComoComprado() {
        ItemParaCompra item = new ItemParaCompra("Feijão");
        item.marcarComoComprado();
        assertTrue(item.isComprado());
    }

    @Test
    void testDesmarcarComoComprado() {
        ItemParaCompra item = new ItemParaCompra("Pão");
        item.marcarComoComprado();
        item.desmarcarComoComprado();
        assertFalse(item.isComprado());
    }
}