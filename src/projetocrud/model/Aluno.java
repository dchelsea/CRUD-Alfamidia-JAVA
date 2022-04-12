package projetocrud.model;

/**
 *
 * @author Douglas
 */
public class Aluno extends Pessoa{
    
    protected double notaFinal;

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
                ", telefone: " + telefone +
                ", data de nascimento: " + dataNascimento +
                ", cadastro realizado em: " + dataCadastro +
                ", alteração realidada em: " + dataUltimaAlteracao +
                ", nota final: " + notaFinal;
                /*"Aluno{" + "nome=" + this.getNome() +
                ", telefone=" + this.getTelefone() +
                ", dataNascimento=" + this.getDataNascimento() +
                ", dataCadastro=" + this.getDataCadastro() +
                ", dataUltimaAlteracao=" + this.getDataUltimaAlteracao() +
                ", notaFinal=" + notaFinal +
                '}';
                */
    }

    

    
    
    
    
    
}
