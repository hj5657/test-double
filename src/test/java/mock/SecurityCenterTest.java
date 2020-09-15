package mock;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */
    // MockDoorPanel mockDoorPanel;
    SecurityCenter securityCenter;
    DoorPanel doorPanel;
    @BeforeEach
    public void setUp() {
        // mockDoorPanel = new MockDoorPanel();
        doorPanel= mock(DoorPanel.class);
        securityCenter = new SecurityCenter(doorPanel);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        verify(doorPanel,times(1)).close();
    }

}
