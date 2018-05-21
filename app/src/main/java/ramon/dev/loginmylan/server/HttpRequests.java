package ramon.dev.loginmylan.server;

import ramon.dev.loginmylan.Usuario;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface HttpRequests {
    @POST("api/login")
    @Headers({ "Content-Type: application/json;charset=UTF-8", "Accept: application/json"})
    Call<ResultRequest<Usuario>> logar(@Body Usuario usuario);
}
