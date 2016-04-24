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
    
    @Test
    public void alteracaoTest(){
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
        Tecnico t2 = new Tecnico("Tecnico2", 123456);
        Empresa empresa2 = new Empresa(123456789, "Empresa2");
        ClienteEmpresa cq2 = new ClienteEmpresa(codigo, empresa2, 123456, "ClienteEmpresa2", 12345678);
        c.setBancoDeDados("BS2");
        c.setTitulo("Titulo2");
        c.setDescricao("Descrição2");
        c.setTecnico(t2);
        c.setCliente(cq2);
        c.setSistemaOperacional("Linux");
        c.setVersaoSO("Ubuntu");
        assertEquals("Titulo2", c.getTitulo());
        assertEquals("Descrição2", c.getDescricao());
        assertEquals(1, c.getPrioridade());
        assertEquals(t2, c.getTecnico());
        assertEquals(cq2, c.getCliente());
        assertEquals("Linux", c.getSistemaOperacional());
        assertEquals("Ubuntu", c.getVersaoSO());
        assertEquals("BS2", c.getBancoDeDados());
    }
}
