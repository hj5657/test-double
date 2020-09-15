package mock;

/**
 * Create by 木水 on 2020/9/15.
 */
public class MockDoorPanel extends DoorPanel {
    @Override
    public void close() {
        System.out.println("关门了");
    }
}
