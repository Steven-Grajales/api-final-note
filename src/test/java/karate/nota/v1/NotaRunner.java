package karate.nota.v1;

import com.intuit.karate.junit5.Karate;

public class NotaRunner {

    @Karate.Test
    Karate testCreate() {
        return Karate.run("create").relativeTo(getClass());
    }

}
