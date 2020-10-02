import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestDriver {

    @Test
    public void EphraimSLCWifi(){
        Seat X = new EphraimToSLC();
        X = new Wifi(X);
        assertEquals(127.00, X.cost());
    }

    @Test
    public void EphraimSLC(){
        Seat X = new EphraimToSLC();
        assertEquals(120, X.cost());
    }
}