import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

@RestController
class MessageController {

    private static final List<String> MENSAJES = Arrays.asList(
            "Hoy es un gran día para aprender algo nuevo.",
            "La práctica hace al maestro.",
            "Cada línea de código te acerca a tu objetivo.",
            "Nunca dejes de mejorar.",
            "Recuerda siempre depurar y probar tu código."
    );

    @GetMapping("/")
    public String getMessage() {
        // Selecciona un mensaje aleatorio
        Random random = new Random();
        return MENSAJES.get(random.nextInt(MENSAJES.size()));
    }
}
