import java.util.ArrayList;
import java.util.List;

public class Colecionador {
    private String nome;
    private int idade;
    private List<Carro> carros = null;

    public Colecionador(String nome, int idade){
        this.setNome(nome);
        this.setIdade(idade);
    }
    public void addCarro(Carro c){
        if(c.equals(null)){
            throw new NullPointerException("O objeto passado foi nulo");
        }else{
            this.getCarros().add(c);
        }
    }
    public void seLivrardoCarro(Carro c)  {

        if(c.equals(null)){
            throw new NullPointerException("O objeto passado foi nulo");
        }else{
            this.getCarros().remove(c.getId());
        }

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}
