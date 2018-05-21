package ramon.dev.loginmylan;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String bssid;

    public Usuario(String email, String senha, String bssid) {
        this.email = email;
        this.senha = senha;
        this.bssid = bssid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getBssid() {
        return bssid;
    }

    public void setBssid(String bssid) {
        this.bssid = bssid;
    }
}
