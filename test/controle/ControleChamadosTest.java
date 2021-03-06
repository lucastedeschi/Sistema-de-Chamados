/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import Persistencia.ChamadoDAO;
import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.RegistroChamado;
import entidade.Tecnico;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class ControleChamadosTest {

    @Test
    public void incluiChamadoTest() {
        Tecnico t = new Tecnico("Tecnico", 1234567);
        Empresa empresa = new Empresa(123456789, "Empresa");
        ClienteEmpresa cq = new ClienteEmpresa(2, empresa, 1234567, "ClienteEmpresa", 123456789);
        Chamado c = new Chamado("Titulo", "Descrição", 2, t, cq, "Windows", "10", "BD");
        ControleChamados cc = new ControleChamados();
        Chamado cr = cc.InserirChamadoBancoDeDados(c.getTitulo(), c.getDescricao(), c.getPrioridade(), c.getTecnico(), c.getCliente(), c.getSistemaOperacional(), c.getVersaoSO(), c.getBancoDeDados());
        Assert.assertEquals(cr.getTitulo(), c.getTitulo());
        Assert.assertEquals(c.getDescricao(), cr.getDescricao());
        Assert.assertEquals(c.getPrioridade(), cr.getPrioridade());
        Assert.assertEquals(c.getTecnico(), cr.getTecnico());
        Assert.assertEquals(c.getCliente(), cr.getCliente());
        Assert.assertEquals(c.getSistemaOperacional(), cr.getSistemaOperacional());
        Assert.assertEquals(c.getVersaoSO(), cr.getVersaoSO());
        Assert.assertEquals(c.getBancoDeDados(), cr.getBancoDeDados());
    }

    @Test
    public void alteraChamadoTest() {
        Tecnico t = new Tecnico("Tecnico", 1234567);
        Empresa empresa = new Empresa(123456789, "Empresa");
        ClienteEmpresa cq = new ClienteEmpresa(2, empresa, 1234567, "ClienteEmpresa", 123456789);
        Chamado c = new Chamado("Titulo", "Descrição", 2, t, cq, "Windows", "10", "BD");
        ControleChamados cc = new ControleChamados();
        Chamado cr = cc.InserirChamadoBancoDeDados(c.getTitulo(), c.getDescricao(), c.getPrioridade(), c.getTecnico(), c.getCliente(), c.getSistemaOperacional(), c.getVersaoSO(), c.getBancoDeDados());
        Assert.assertEquals(cr.getTitulo(), c.getTitulo());
        Assert.assertEquals(c.getDescricao(), cr.getDescricao());
        Assert.assertEquals(c.getPrioridade(), cr.getPrioridade());
        Assert.assertEquals(c.getTecnico(), cr.getTecnico());
        Assert.assertEquals(c.getCliente(), cr.getCliente());
        Assert.assertEquals(c.getSistemaOperacional(), cr.getSistemaOperacional());
        Assert.assertEquals(c.getVersaoSO(), cr.getVersaoSO());
        Assert.assertEquals(c.getBancoDeDados(), cr.getBancoDeDados());
        cc.alterarChamado(c, "Status", "Causa", "Solucao");
        Assert.assertEquals("Causa", c.getCausaProblema());
        Assert.assertEquals("Status", c.getStatus());
        Assert.assertEquals("Solucao", c.getSolucaoProblema());
    }

    @Test
    public void readChamadoTest() {
        Tecnico t = new Tecnico("Tecnico", 1234567);
        Empresa empresa = new Empresa(123456789, "Empresa");
        ClienteEmpresa cq = new ClienteEmpresa(2, empresa, 1234567, "ClienteEmpresa", 123456789);
        Chamado c = new Chamado(4, "Titulo", "Descrição", 1, t, cq, "SO", "10", "tipoConexao", "enderecoRede");
        ControleChamados cc = new ControleChamados();
        cc.InserirChamadoRede(c.getTitulo(), c.getDescricao(), c.getPrioridade(), t, cq, c.getSistemaOperacional(), c.getVersaoSO(), c.getTipoConexao(), c.getEnderecoRede());
        //Chamado i = cc.buscaPeloCodigo(c.getCodigo());

        //Assert.assertEquals(c, i);
        Assert.fail("O método não funciona, pois quando é realizado a busca uma exceção de cast é disparada");

    }

    @Test
    public void validarQtdChamadosTest() {
        Tecnico t = new Tecnico("Tecnico", 1234567);
        Empresa empresa = new Empresa(123456789, "Empresa");
        ClienteEmpresa cq = new ClienteEmpresa(2, empresa, 1234567, "ClienteEmpresa", 123456789);
        Chamado c = new Chamado(4, "Titulo", "Descrição", 1, t, cq, "SO", "10", "tipoConexao", "enderecoRede");
        ControleChamados cc = new ControleChamados();

        int i = cc.validarQtdChamados(cq);

        Assert.assertEquals(1, i);

    }

    @Test
    public void retornaDetalhesChamadoTest() {
        ControleChamados cc = new ControleChamados();
        Tecnico t = new Tecnico("Tecnico", 1234567);

        Empresa empresa = new Empresa(123456789, "Empresa");
        ClienteEmpresa cq = new ClienteEmpresa(2, empresa, 1234567, "ClienteEmpresa", 123456789);
        Chamado c = new Chamado(4, "Titulo", "Descrição", 1, t, cq, "SO", "10", "tipoConexao", "enderecoRede");

        String retornoMedtodo = "\n" + "--------" + "\n" + "Data de abertura do chamado: "
                + c.getData() + "\n" + "Hororio de abertura do chamado: " + c.getHora() + "\n"
                + "Titulo do chamado: " + c.getTitulo() + "\n" + "Descrição do chamado: " + c.getDescricao() + "\n"
                + "Prioridade do chamado" + c.getPrioridade() + "\n" + "Status do chamado: " + c.getStatus() + "\n"
                + "Tipo de problema do chamado: " + c.getTipoProblema() + "\n" + "Tecnico responsovel pelo chamado: "
                + c.getTecnico() + "\n" + "Cliente requisitor do chamado: " + c.getCliente() + "\n";

        Assert.assertEquals(retornoMedtodo, cc.retornaDetalhesChamado(c));

    }

    @Test
    public void emitirRelatoriobancoDeDadosTest() {

        ControleChamados cc = new ControleChamados();
        Tecnico t = new Tecnico("Tecnico", 1234567);

        Empresa empresa = new Empresa(123456789, "Empresa");
        ClienteEmpresa cq = new ClienteEmpresa(2, empresa, 1234567, "ClienteEmpresa", 123456789);
        Chamado ref = new Chamado(7, "Titulo", "Descrição", 1, t, cq, "SO", "10", "tipoConexao", "enderecoRede");
        
        ChamadoDAO cDAO = new ChamadoDAO();
        
        cDAO.put(ref);
        
        
        int prioridade = 2;

        String relatorio = "\n" + "--------" + "\nData de abertura do chamado: "
                + ref.getData()
                + "\nHor�rio de abertura do chamado: " + ref.getHora()
                + "\nTítulo do chamado: " + ref.getTitulo()
                + "\nCódigo do chamado: " + ref.getCodigo()
                + "\nDescrição do chamado: " + ref.getDescricao()
                + "\nPrioridade do chamado: " + prioridade
                + "\nStatus do chamado: " + ref.getStatus()
                + "\nTipo de problema do chamado: " + ref.getTipoProblema()
                + "\nTécnico responsável pelo chamado: " + ref.getTecnico()
                + "\nCliente requisitor do chamado: " + ref.getCliente() + "\n";

        RegistroChamado rc = new RegistroChamado("assunto", ref, t);

        relatorio += "\nRelatório de registros de acompanhamento:"
                + "\nData: " + rc.getData()
                + "\nHora: " + rc.getHora()
                + "\nAssunto: " + rc.getAssunto()
                + "\nTécnico responsável: " + rc.getTecnico().getNome()
                + "\nCausa do problema: " + ref.getCausaProblema()
                + "\nSolução do problema: " + ref.getSolucaoProblema();;

       Assert.assertEquals(relatorio, cc.emitirRelatorios(ref.getCodigo()));
       
    }
}
