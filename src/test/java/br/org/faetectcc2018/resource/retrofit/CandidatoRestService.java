package br.org.faetectcc2018.resource.retrofit;


import br.org.faetectcc2018.model.Candidato;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CandidatoRestService {

    @GET("/candidato")
    Call<RestPageImpl<Candidato>> findPage(@Query("page") Integer page,
                                           @Query("linesPerPage") Integer linesPerPage,
                                           @Query("oderBy") String orderBy,
                                           @Query("direction") String direction);

    @GET("/candidato/{id}")
    Call<Candidato> find(@Path("id") Long id);
}
