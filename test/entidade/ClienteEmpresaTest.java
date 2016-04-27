/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class ClienteEmpresaTest {
    //(acept = Assertion.error)
    @Test
    public void inicializacaoTest(){
        Empresa empresa = new Empresa(123456789, "Empresa");
        Integer codigo = 1;
        ClienteEmpresa cq = new ClienteEmpresa(codigo, empresa, 123456, "ClienteEmpresa", 12345678);
        Assert.assertEquals(empresa, cq.getEmpresa());
        Assert.assertEquals(123456, cq.getCpf());
        Assert.assertEquals(codigo, cq.getCodigo());
        Assert.assertEquals("ClienteEmpresa", cq.getNome());
        Assert.assertEquals(12345678, cq.getTelefone());
    }
    
    @Test 
    public void alteracaoTest(){
        Empresa empresa = new Empresa(123456789, "Empresa");
        Integer codigo = 1;
        ClienteEmpresa cq = new ClienteEmpresa(codigo, empresa, 123456, "ClienteEmpresa", 12345678);
        Assert.assertEquals(empresa, cq.getEmpresa());
        Assert.assertEquals(123456, cq.getCpf());
        Assert.assertEquals(codigo, cq.getCodigo());
        Assert.assertEquals("ClienteEmpresa", cq.getNome());
        Assert.assertEquals(12345678, cq.getTelefone());
        cq.setNome("ClienteEmpresa2");
        cq.setTelefone(12345);
        cq.setCpf(123456);
        Assert.assertEquals(empresa, cq.getEmpresa());
        Assert.assertEquals(123456, cq.getCpf());
        Assert.assertEquals(codigo, cq.getCodigo());
        Assert.assertEquals("ClienteEmpresa2", cq.getNome());
        Assert.assertEquals(12345, cq.getTelefone());
    }
}
