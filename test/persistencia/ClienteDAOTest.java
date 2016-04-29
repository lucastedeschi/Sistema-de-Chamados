/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Persistencia.ClienteDAO;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import java.util.HashMap;
import org.junit.Assert;

import org.junit.Test;

/**
 *
 * @author 31449530
 */
public class ClienteDAOTest {

    public ClienteDAOTest() {
    }

    @Test
    public void verificarSeCPFExisteNoBancoTest() {

        ClienteDAO cDAO = new ClienteDAO();
        Empresa emp = new Empresa(33333, "LXN");
        ClienteEmpresa cEmp = new ClienteEmpresa(12346, emp, 55555, "OI", 222222);

        cDAO.put(cEmp);
        
        ClienteEmpresa cEmp2 = cDAO.voltaCashCliente().get(cEmp.getCpf());
        
        if(cEmp.getCpf() == cEmp2.getCpf()){
        Assert.assertTrue(true);
        }else{
            Assert.assertFalse(false);
        }
    }

    @Test
    public void GerarCodigoTest() {
        ClienteDAO cDAO = new ClienteDAO();

        int codigo = cDAO.gerarCodigo();

        Assert.assertNotNull(codigo);

    }

    @Test
    public void HashMapTest() {
        ClienteDAO cDAO = new ClienteDAO();

        HashMap<Long, ClienteEmpresa> empHash = cDAO.voltaCashCliente();

        Assert.assertNotNull(empHash);
    }

    @Test
    public void InsereClienteTest() {
        ClienteDAO cDAO = new ClienteDAO();
        Empresa emp = new Empresa(111111, "LXN");
        ClienteEmpresa cEmp = new ClienteEmpresa(1234, emp, 3333333, "OI", 222222);

        cDAO.put(cEmp);

        ClienteEmpresa cEmp2 = cDAO.get(3333333L);

        Assert.assertEquals(cEmp, cEmp2);

    }

    @Test
    public void BuscaClienteTest() {
        ClienteDAO cDAO = new ClienteDAO();
        Empresa emp = new Empresa(111111, "LXN");

        ClienteEmpresa cEmp = new ClienteEmpresa(12345, emp, 444444, "OI", 222222);
        cDAO.put(cEmp);

        Assert.assertEquals(cEmp, cDAO.get(444444L));
    }

}
