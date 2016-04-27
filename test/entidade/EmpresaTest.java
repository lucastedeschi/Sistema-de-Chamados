/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.Assert;;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class EmpresaTest {
    @Test
    public void inicializaçãoTest(){
        Empresa empresa = new Empresa(123456789, "Empresa");
        Assert.assertEquals(123456789, empresa.getNumeroContrato());
        Assert.assertEquals("Empresa", empresa.getNomeEmpresa());
    }
    
    @Test
    public void alteracaoTest(){
        Empresa empresa = new Empresa(123456789, "Empresa");
        Assert.assertEquals(123456789, empresa.getNumeroContrato());
        Assert.assertEquals("Empresa", empresa.getNomeEmpresa());
        empresa.setNomeEmpresa("NovaEmpresa");
        empresa.setNumeroContrato(12345);
        Assert.assertEquals(12345, empresa.getNumeroContrato());
        Assert.assertEquals("NovaEmpresa", empresa.getNomeEmpresa());
    }
}
