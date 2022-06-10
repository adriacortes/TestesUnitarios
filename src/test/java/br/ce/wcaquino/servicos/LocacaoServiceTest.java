package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import java.util.Date;

public class LocacaoServiceTest {

    /* Utilizado para validar todas as acertivas quando a mesma esta dentro
    * do mesmo metodo! Uma ideia é fazer uma função para cada acertiva!*/
    @Rule
    public ErrorCollector error=new ErrorCollector();

    @Test
    public void testeLocacao() {
        //cenario
        LocacaoService service = new LocacaoService();
        Usuario usuario = new Usuario("Usuario 1");
        Filme filme = new Filme("Filme 1", 2, 5.0);

        //acao
        Locacao locacao = service.alugarFilme(usuario, filme);

        //verificacao
        /*error.checkThat(locacao.getValor(), is(equalTo(6.0)));
        error.checkThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date(),is(true)));
        error.checkThat(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1),is(false)));*/

        Assert.assertEquals(5.0,locacao.getValor(),0.01);
        Assert.assertTrue(DataUtils.isMesmaData ( locacao.getDataLocacao(),new Date()) );
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)) ) ;

    }
}
