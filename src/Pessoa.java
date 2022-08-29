
public class Pessoa {
    public String nome;
    public Integer idade;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return  this.nome;

    }

    public Integer getIdade(){
        return this.idade;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }
}
/** METODOS ACESSORES:
 * PUBLIC: Indica que qualquer um pode acessar o elemento.
 * PRIVATE: indica que somente a classe consegue acessar.
 * PROTECTED: indica somente a classe e seus filhos consegue acessar.
 * DEFAULT: Indica que somente a classe, seus filhos e as classes no mesmo pacote podem acessar
 * */

