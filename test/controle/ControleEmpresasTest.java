/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Empresa;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class ControleEmpresasTest {

    @Test
    public void inserirTest() {
        ControleEmpresas ce = new ControleEmpresas();
        Empresa e = new Empresa(12345670, "Empresa5");
        ce.inserir(e.getNumeroContrato(), e.getNomeEmpresa());
        Empresa ei = ce.retorna(12345670, "Empresa5");
        Assert.assertTrue(ei.getNomeEmpresa().equals(e.getNomeEmpresa()));
        Assert.assertTrue(ei.getNumeroContrato() == e.getNumeroContrato());
    }

    @Test
    public void inserirDuplicaTest() {
        ControleEmpresas c = new ControleEmpresas();
        Empresa ee = c.retorna(12345670, "Empresa5");
        Assert.assertNull(c.inserir(ee.getNumeroContrato(), ee.getNomeEmpresa()));

    }

    @Test
    public void readTest() {
        Empresa e = new Empresa(123456789, "Empresa8");
        ControleEmpresas c = new ControleEmpresas();
        c.inserir(e.getNumeroContrato(), e.getNomeEmpresa());
        Empresa ei = c.retorna(123456789, "Empresa8");
        Assert.assertEquals("Empresa8", ei.getNomeEmpresa());
        Assert.assertEquals(123456789, ei.getNumeroContrato());

    }
}
