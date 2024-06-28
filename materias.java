//classe principal dos materias

public class materias {
    //atributos
        String nome;
        String cidade;
        double valorunidade;
        double valortotal;
        double quantidade;
    //metodo contrutor
        public materias(String nome, String cidade, double valorunidade, double valortotal) {
            this.nome = nome;
            this.cidade = cidade;
            this.valorunidade = valorunidade;
            this.valortotal = valortotal;
            this.quantidade = quantidade;
        }
    //getters e setters
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public double getValorunidade() {
            return valorunidade;
        }
    
        public void setValorunidade(double valorunidade) {
            this.valorunidade = valorunidade;
        }
    
        public String getCidade() {
            return cidade;
        }
    
        public void setCidade(String cidade) {
            this.cidade = cidade;
        }
    
        public double getValortotal() {
            return valortotal;
        }
    
        public void setValortotal(double valortotal) {
            this.valortotal = valortotal;
        }
    
        public Double getQuantidade() {
            return quantidade;
        }
    
        public void setQuantidade(Double quantidade) {
            this.quantidade = quantidade;
        }
    }
    