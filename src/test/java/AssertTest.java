import br.ce.wcaquino.entidades.Usuario;
import org.junit.Assert;
import org.junit.Test;

public class AssertTest {

    @Test
    public void testAsserts(){


        Assert.assertTrue(true);
        Assert.assertFalse(false);

        /* Verifica se o valor esperado é o que foi passado! */
        Assert.assertEquals("Erro de comparação",1,1);

        /* Para double e float,informar o valor delta 0.01!*/
        Assert.assertEquals(0.51,0.51,0.01);

        /* Delta define as casas decimais a serem validadas!*/
        Assert.assertEquals(0.51234,0.512,0.001);

        /* Para comparar tipos primitivos com objetos!  Antes ,fazer a conversão de um deles!*/
        int i=5;
        Integer i2=5;
        Assert.assertEquals(Integer.valueOf(i),i2); /*Conversão do int para obj */
        Assert.assertEquals(i,i2.intValue()); /*Conversão do obj para int*/

        /*Testando Strings*/
        Assert.assertEquals("bola","bola");
        Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
        /*Ignorando o Radical*/
        Assert.assertTrue("bola".startsWith("bo"));
        Assert.assertNotEquals("Bola","Casa");

        Usuario u1 = new Usuario("Usuario 1");
        Usuario u2 = new Usuario("Usuario 1");
        Usuario u3 = u2;
        Usuario u4 = null;

        /* Para validar que são do mesmo tipo (Usuario) é preciso definir na Class
        * o método equals,caso contrario,o teste vai falhar! */
        Assert.assertEquals(u1,u2);

        /* Verificar se é o mesmo objeto!*/
        Assert.assertSame(u2,u3);
        /* Verifica se são intancias diferentes!*/
        Assert.assertNotSame(u1,u3);

        /* Verificar se objeto é nulo*/
        Assert.assertTrue(u4 == null);
        Assert.assertNull(u4);
        Assert.assertNotNull(u3);

        /* */




    }
}
