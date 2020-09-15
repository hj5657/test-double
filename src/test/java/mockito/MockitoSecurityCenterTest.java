package mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

/**
 * Create by 木水 on 2020/9/15.
 */
public class MockitoSecurityCenterTest {
    SecurityCenter securityCenter;
    DoorPanel doorPanel;
    @BeforeEach
    public void setUp() {
        doorPanel= mock(DoorPanel.class);
        securityCenter = new SecurityCenter(doorPanel);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        verify(doorPanel,times(1)).close();
    }
}
