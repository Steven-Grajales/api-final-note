package karate.nota.v1;

import co.udea.apifinalnote.ApiFinalNoteApplication;
import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

public class NotaRunner {

    @Karate.Test
    Karate testCreate() {
        return Karate.run("create").relativeTo(getClass());
    }

    @Karate.Test
    Karate testList() {
        return Karate.run("list").relativeTo(getClass());
    }

}
