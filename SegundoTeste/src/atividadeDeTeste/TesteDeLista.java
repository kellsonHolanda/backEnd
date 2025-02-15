package atividadeDeTeste;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class TesteDeLista {

    @Test
    public void testFiltrarNomesFemininos() {
        List<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("Maria", "F"));
        lista.add(new Pessoa("João", "M"));
        lista.add(new Pessoa("Ana", "F"));
        lista.add(new Pessoa("Carlos", "M"));

        List<String> filtro = lista.stream()
                .filter(e -> e.getGenero().equalsIgnoreCase("F"))
                .map(Pessoa::getNome)
                .collect(Collectors.toList());

        assertEquals(2, filtro.size());
        assertTrue(filtro.contains("Maria"));
        assertTrue(filtro.contains("Ana"));
    }
}
