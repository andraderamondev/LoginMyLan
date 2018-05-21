package ramon.dev.loginmylan.server;

import com.google.gson.annotations.SerializedName;

public class ResultRequest<TypeClass> {
    @SerializedName("codigo")
    private Integer codigo;
    @SerializedName("resultado")
    private TypeClass resultado;

    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public TypeClass getResultado() {
        return resultado;
    }
    public void setResultado(TypeClass resultado) {
        this.resultado = resultado;
    }
}
