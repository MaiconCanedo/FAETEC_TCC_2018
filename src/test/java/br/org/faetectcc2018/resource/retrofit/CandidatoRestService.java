package br.org.faetectcc2018.resource.retrofit;


import br.org.faetectcc2018.dto.CandidatoDTO;
import br.org.faetectcc2018.model.Candidato;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface CandidatoRestService {

    @GET("/candidato")
    Call<RestPageImpl<CandidatoDTO>> findByCargoAndUf(@Query("uf") String uf,
                                                      @Query("cargo") Integer cargo,
                                                      @Query("page") Integer page,
                                                      @Query("linesPerPage") Integer linesPerPage,
                                                      @Query("oderBy") String orderBy,
                                                      @Query("direction") String direction);

    @GET("/candidato/{id}")
    Call<Candidato> find(@Path("id") Long id);

    @GET("candidato/estado")
    Call<List<String>> findEstados();
}
