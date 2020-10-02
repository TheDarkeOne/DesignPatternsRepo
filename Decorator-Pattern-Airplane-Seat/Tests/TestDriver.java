import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class TestDriver {

    @Test
    public void EphraimSLC(){
        Seat X = new EphraimToSLC();
        X = new Wifi(X);
        assertEquals(117.00, X.cost());
    }
}