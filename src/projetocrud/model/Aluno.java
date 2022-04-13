package projetocrud.model;

/**
 *
 * @author Douglas
 */
public class Aluno extends Pessoa{
    
    private double notaFinal;

    public Aluno(double notaFinal, String nome, String telefone, String dataNascimento, String dataCadastro, String dataUltimaAlteracao) {
        super(nome, telefone, dataNascimento, dataCadastro, dataUltimaAlteracao);
        this.notaFinal = notaFinal;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return  nome + 
                ", Telefone: " + telefone +
                ", Data de nascimento: " + dataNascimento +
                ", Cadastro realizado: " + dataCadastro +
                ", Alteração realizada: " + dataUltimaAlteracao +
                ", Nota final: " + getNotaFinal();       
    }
    
}
