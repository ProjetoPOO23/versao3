package Classes;


public class Merceeiro {
    private int cod_M;
    private String CPF;
    private String Razao_Social; 
    private String NomeM;
    private String Endereço;
    private String Telefone;
    private String Email;
    private String Senha;
    
    public String Login(){
        return "Nome: "+NomeM + "   Email: "+Email + "\n "+Razao_Social + "   Endereço: "+Endereço;
    }
    
    public String Status() {
        return "Merceeiro{" + "CPF= " + CPF + ", Razão Social= " + Razao_Social + ", Nome= " + NomeM + ", Endereço=" + Endereço + ", Telefone=" + Telefone + ", Email=" + Email + ", Senha=" + Senha + '}';
    }

    public int getCod_M() {
        return cod_M;
    }

    public void setCod_M(int cod_M) {
        this.cod_M = cod_M;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRazao_Social() {
        return Razao_Social;
    }

    public void setRazao_Social(String Razao_Social) {
        this.Razao_Social = Razao_Social;
    }

    public String getNomeM() {
        return NomeM;
    }

    public void setNomeM(String NomeM) {
        this.NomeM = NomeM;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
}