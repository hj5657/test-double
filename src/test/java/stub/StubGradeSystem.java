package stub;

import java.util.Arrays;
import java.util.List;

/**
 * Create by 木水 on 2020/9/15.
 */
public class StubGradeSystem extends GradeSystem {
    @Override
    public List<Double> gradesFor(long studentId) {
        return Arrays.asList(90.0, 90.0, 90.0);
    }
}
