package co.udea.apifinalnote.component.nota.service;


import co.udea.apifinalnote.component.nota.io.web.v1.model.NotaListResponse;
import co.udea.apifinalnote.component.nota.model.Nota;
import co.udea.apifinalnote.component.nota.service.NotaGateway;
import co.udea.apifinalnote.component.nota.service.NotaService;
import co.udea.apifinalnote.component.nota.service.NotaServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class NotaServiceTest {


    @Mock
    private NotaGateway notaGateway;

    @InjectMocks
    private NotaServiceImpl notaService;

    @Test
    public void shouldReturnAverageWithNoteList() {

        List<Nota> notaList = new ArrayList<>();
        notaList.add(Nota.builder().nota(5.0).porcentaje(0.1).build());
        notaList.add(Nota.builder().nota(5.0).porcentaje(0.1).build());

        when(notaGateway.findAll()).thenReturn(notaList);

        System.out.println(notaService);

        Double average = notaService.getAverage();

        assertThat(average)
                .isEqualTo(1.0);


    }

}
