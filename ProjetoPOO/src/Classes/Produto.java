package Classes;

import Classes.Agropecuario;

public class Produto {
    
    private int cod_P;
    private String Categoria;
    private Agropecuario agropecuario;
    private String NomePD;
    private float Valor;
    private int Quant;
    
    
    public String Status() {
        return "Produto{" + "Nome=" + NomePD + ", Quantidade=" + Quant + 
                ", Valor=" + Valor + ", Categoria=" + Categoria 
                + ", Codigo Prod=" + cod_P + '}';
    }
    
    public String Resumo() {
        return "Produto{" + "Nome=" + NomePD + ", Quantidade=" + Quant + 
                ", Valor=" + Valor + ", Codigo Prod=" + cod_P + '}';
    }
    
    public int getCod_P() {
        return cod_P;
    }

    public void setCod_P(int cod_P) {
        this.cod_P = cod_P;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        if(Categoria=="1")
        {
            this.Categoria = "Perecível";
        }
        if(Categoria=="2")
        {
            this.Categoria = "Não Perecível";
        }
        
    }

    public String getNomePD() {
        return NomePD;
    }

    public void setNomePD(String NomePD) {
        this.NomePD = NomePD;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public int getQuant() {
        return Quant;
    }

    public void setQuant(int Quant) {
        this.Quant = Quant;
    }

    public Agropecuario getAgropecuario() {
        return agropecuario;
    }

    public void setAgropecuario(Agropecuario agropecuario) {
        this.agropecuario = agropecuario;
    }

}
