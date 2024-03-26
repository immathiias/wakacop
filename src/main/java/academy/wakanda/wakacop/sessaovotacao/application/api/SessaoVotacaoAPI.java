package academy.wakanda.wakacop.sessaovotacao.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sessao")
public interface SessaoVotacaoAPI {
    @PostMapping("/abertura")
    @ResponseStatus(HttpStatus.CREATED)
    SessaoAberturaResponse abreSessao(@RequestBody @Valid SessaoAberturaRequest sessaoAberturaRequest);
}
