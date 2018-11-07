package br.org.faetectcc2018.resource.retrofit;

import br.org.faetectcc2018.dto.TipoBemCandidatoDTO;
import br.org.faetectcc2018.model.BemCandidato;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface BemCandidatoRestService {

    @GET("/benscandidatos/{id}")
    Call<BemCandidato> find(@Path("id") Long id);

    @GET("/benscandidatos/tiposdebens")
    Call<List<TipoBemCandidatoDTO>> findTipoDeBem();

    @GET("/benscandidatos")
    Call<RestPageImpl<BemCandidato>> findPage(@Query("page") Integer page,
                                              @Query("linesPerPage") Integer linesPerPage,
                                              @Query("orderBy") String orderBy,
                                              @Query("direction") String direction);
}