package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        GradeSystem gradeSystem = mock(GradeSystem.class);
        GradeService service = new GradeService(gradeSystem);
        when(gradeSystem.gradesFor(1L)).thenReturn(Arrays.asList(80.0, 90.0, 100.0));
        double result = service.calculateAverageGrades(1L);
        Assertions.assertEquals(90.0, result);
    }
}
