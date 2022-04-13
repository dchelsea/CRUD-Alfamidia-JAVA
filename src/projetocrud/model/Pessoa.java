package projetocrud.model;

/**
 *
 * @author Douglas
 */
public class Pessoa {
    
    protected String nome;
    
    protected String telefone;
            
    protected String dataNascimento;
            
    protected String dataCadastro;
            
    protected String dataUltimaAlteracao;

    public Pessoa(String nome, String telefone, String dataNascimento, String dataCadastro, String dataUltimaAlteracao) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
        this.dataUltimaAlteracao = dataUltimaAlteracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataUltimaAlteracao() {
        return dataUltimaAlteracao;
    }

    public void setDataUltimaAlteracao(String dataUltimaAlteracao) {
        this.dataUltimaAlteracao = dataUltimaAlteracao;
    }

    @Override
    public String toString() {
        return  nome + 
                ", Telefone: " + telefone +
                ", Data de nascimento: " + dataNascimento +
                ", Cadastro realizado: " + dataCadastro +
                ", Alteração realizada: " + dataUltimaAlteracao;
    }
    
    
    
    



    

    

    
    
    
            
            
            
    
}
