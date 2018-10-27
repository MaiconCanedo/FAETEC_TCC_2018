package br.org.faetectcc2018.resources.retrofit;

import br.org.faetectcc2018.model.BemCandidato;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BemCandidatoRestService {

    @GET("/benscandidatos/{id}")
    Call<BemCandidato> find(@Path(value = "id") Long id);
}