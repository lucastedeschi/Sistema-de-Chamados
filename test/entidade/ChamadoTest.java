/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class ChamadoTest {
    @Test
    public void inicializacaoTest(){
        Integer codigo = 1;
        Tecnico t = new Tecnico("Tecnico", 123456);
        Empresa empresa = new Empresa(123456789, "Empresa");
        ClienteEmpresa cq = new ClienteEmpresa(codigo, empresa, 123456, "ClienteEmpresa", 12345678);
        Chamado c = new Chamado("Titulo", "Descrição", 1, t, cq, "Windows", "10", "BD");
        assertEquals("Titulo", c.getTitulo());
        assertEquals("Descrição", c.getDescricao());
        assertEquals(1, c.getPrioridade());
        assertEquals(t, c.getTecnico());
        assertEquals(cq, c.getCliente());
        assertEquals("Windows", c.getSistemaOperacional());
        assertEquals("10", c.getVersaoSO());
        assertEquals("BD", c.getBancoDeDados());
    }
}
