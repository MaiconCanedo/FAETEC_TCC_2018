package br.org.faetectcc2018.resources.retrofit;


import br.org.faetectcc2018.model.Candidato;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CandidatoRestService {

    @GET("/candidatos")
    Call<RestPageImpl<Candidato>> findPage(@Query("page") Integer page,
                                           @Query("linesPerPage") Integer linesPerPage,
                                           @Query("oderBy") String orderBy,
                                           @Query("direction") String direction);

    @GET("/candidatos/{id}")
    Call<Candidato> find(@Path("id") Long id);
}
