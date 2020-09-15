package mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Create by 木水 on 2020/9/15.
 */
public class MockitoGradeServiceTest {
    @Test
    public void should_return_90_when_calculate_student_average_grade_and_grade_is_80And90And100() {
        GradeSystem gradeSystem = mock(GradeSystem.class);
        GradeService service = new GradeService(gradeSystem);
        when(gradeSystem.gradesFor(1L)).thenReturn(Arrays.asList(80.0, 90.0, 100.0));
        double result = service.calculateAverageGrades(1L);
        Assertions.assertEquals(90.0, result);
    }
}
