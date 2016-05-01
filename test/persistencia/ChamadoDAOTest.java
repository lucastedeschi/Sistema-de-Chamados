/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Tecnico;
import entidade.TipoConexao;
import org.junit.Assert;
import org.junit.Test;
import Persistencia.ChamadoDAO;

/**
 *
 * @author lucas
 */
public class ChamadoDAOTest {

    @Test
    public void insereChamadoTest() {
        Tecnico t =  new Tecnico("Tecnico", 111111111);
        Empresa e = new Empresa(1000, "Empresa");
        ClienteEmpresa ce = new ClienteEmpresa(Integer.SIZE, e, 45126575848L, "Tecnico", 1111111);
        Chamado c = new Chamado(5, "Problema", "Descrição", 8, t, ce, "Windows", "10", "" + TipoConexao.ADSL, "111111111");
        
        ChamadoDAO dao = new ChamadoDAO();
        dao.put(c);
        
        Chamado ci = dao.get(dao.gerarCodigo() - 1);
        
        Assert.assertEquals(c.getTitulo(), ci.getTitulo());
        Assert.assertEquals(c.getDescricao(), ci.getDescricao());
        Assert.assertEquals(c.getPrioridade(), ci.getPrioridade());
        Assert.assertEquals(c.getTecnico().getNome(), ci.getTecnico().getNome());
        Assert.assertEquals(c.getCliente().getCpf(), ci.getCliente().getCpf());
        Assert.assertEquals(c.getSistemaOperacional(), ci.getSistemaOperacional());
        Assert.assertEquals(c.getTipoConexao(), ci.getTipoConexao());
        Assert.assertEquals(c.getEnderecoRede(), ci.getEnderecoRede()); 
    }

    @Test
    public void gerarCodigoTest() {
        ChamadoDAO dao = new ChamadoDAO();
        Assert.assertEquals(dao.getChamados().size(), dao.gerarCodigo() - 1);
    }

    @Test
    public void leituraChamadosTest() {
        Tecnico t =  new Tecnico("Tecnico", 111111111);
        Empresa e = new Empresa(1000, "Empresa");
        ClienteEmpresa ce = new ClienteEmpresa(Integer.SIZE, e, 45126575848L, "Tecnico", 1111111);
        Chamado c = new Chamado(5, "Problema", "Descrição", 8, t, ce, "Windows", "10", "" + TipoConexao.ADSL, "111111111");

        ChamadoDAO dao = new ChamadoDAO();
        dao.put(c);
        
        Assert.assertTrue(dao.getChamados().size() >= 1);
        
    }
}
