/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import locadora.entity.Veiculo;
import locadora.rn.VeiculoRN;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camila
 */
public class VeiculoRNTest {
    
    Veiculo veiculo;
    
    VeiculoRN v = new VeiculoRN();
    Veiculo vei = new Veiculo();
    Integer id;
    
    @Test
    public void VeiculoRNTest() {
    v.salvar(vei);
    v.excluir(vei);
    v.obterTodos();
    v.obter(id);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
