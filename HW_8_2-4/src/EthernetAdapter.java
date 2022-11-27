import java.util.Objects;

public class EthernetAdapter extends Device{
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getMac() {
        return this.mac;
    }

    @Override
    public String toString() {
        return String.format("%s EthernetAdapter: manufacturer = %s, price = %f, serialNumber = %s, speed = %d, mac = %s",
                super.toString(),
                this.getManufacturer(),
                this.getPrice(),
                this.getSerialNumber(),
                this.speed,
                this.mac);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        EthernetAdapter that = (EthernetAdapter) obj;
        return Objects.equals(mac, that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mac);
    }
}
