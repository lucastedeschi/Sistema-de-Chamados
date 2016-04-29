/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Persistencia.TecnicoDAO;
import entidade.Tecnico;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 31449530
 */
public class TecnicoDAOTest {
    
    public TecnicoDAOTest() {
    }
    
    @Test
    public void GerarCodigoTest() {
        TecnicoDAO tDAO = new TecnicoDAO();
        
        int codigo = tDAO.gerarCodigo();
       
        Assert.assertNotNull(codigo);
        
    }

    
    @Test
    public void HashMapTest() {
        
        TecnicoDAO tDAO = new TecnicoDAO();
       
        HashMap<Integer, Tecnico> hashRetornado = tDAO.voltaCashTecnico();
        
        Assert.assertNotNull(hashRetornado);
        
    }

    
    @Test
    public void InserirTecnicotest() {
        Tecnico tecnico = new Tecnico("Jose",333);
        TecnicoDAO tDAO = new TecnicoDAO();
        tDAO.put(tecnico);
        Tecnico tecnico2 = tDAO.get(tDAO.gerarCodigo() - 1);
        
        Assert.assertEquals(tecnico, tecnico2);
        
    }
    
   @Test
    public void BuscaTecnicoPeloCodigo() {
       
        Tecnico tecnico = new Tecnico("Jonas",333);
        TecnicoDAO tDAO = new TecnicoDAO();
        tDAO.put(tecnico);
        Tecnico tec2 = tDAO.get(tDAO.gerarCodigo()-1);
        Assert.assertEquals(tecnico, tec2);
    }
}