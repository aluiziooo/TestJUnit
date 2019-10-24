import org.junit.Test;
public class ColecionadorTeste {


    @Test(expected = NullPointerException.class)
    public void addCarroTestAdicionandoCarro(){
        Carro carro = null;
        Colecionador colecionador = new Colecionador("Neto",22);

        colecionador.addCarro(carro);
    }
    @Test(expected = NullPointerException.class)
    public void seLivrandoCarroTestObjetonulo()  {

        Carro carro = null;
        Colecionador colecionador = new Colecionador("Neto",22);

        colecionador.seLivrardoCarro(carro);



    }

}
