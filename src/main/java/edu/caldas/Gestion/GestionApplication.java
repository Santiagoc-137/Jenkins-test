	package edu.caldas.Gestion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GestionApplication {
    public static void main(String[] args) {
      SpringApplication.run(GestionApplication.class, args);
    }
    @GetMapping("/hello")
    public org.springframework.http.ResponseEntity<String> hello(
      @RequestParam(value = "name", defaultValue = "World") String name) {
      
      String message = "Hello, Soy Santiago Medina Varon Entusiasta de la Ciberseguridad!!.\n" +
                      "Y esto es una prueba de Jenkins.\n" +
                      "Todo funciona correctamente!";
      
      return org.springframework.http.ResponseEntity
              .ok()
              .header("Content-Type", "text/plain")
              .body(message);
  }
}
