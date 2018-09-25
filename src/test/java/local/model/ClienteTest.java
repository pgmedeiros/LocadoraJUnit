package local.model;

import local.exception.ClienteException;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {
    //TODO: O nome não pode ser nulo. Lança RuntimeException -  Nome não é um campo obrigatório
     private Cliente cliente;
    
    
    
    //TODO: O nome não pode ser nulo. Lança RuntimeException -  Nome é um campo obrigatório
    
    @Test
    public void naoDeveAceitarNomeNulo(){
        //Cenário
        Cliente cliente = new Cliente();
        //Processamento
        try{
        cliente.setNome(null);
        Assert.fail("Aceitou nome nulo");
        }catch(RuntimeException ex){
            Assert.assertThat(ex.getMessage(), is("Nome é um campo obrigatório"));
        }
        //Validação
    }
    //TODO: nome deve possuir entre 4 e 55 caracteres (inclusive). Lança ClienteException - O nome do cliente deve possuir entre 4 e 55 caracteres
    
    @Test
    public void verificarTamanhoDoNome(){
        //Cenário
        Cliente cliente = new Cliente();
        //Processamento
        
            //cliente.setNome("patttttttttttttttttttttttttiioioirtrtiroioirjfirjtifjhfjfijiij");
            cliente.setNome("rick");
            Assert.assertThat(cliente.getNome(),is("rick"));
        
        //Validação
    }
    //TODO: O nome do cadastro deve possuir pelo menos 2 nomes (ex.: Angelo Luz)
    //TODO: O nome deverá ser salvo sem espaços no início e fim
    //TODO: O nome não deverá possuir símbolo ou número.Lança ClienteException - Números e símbolos não são permitidos

}
