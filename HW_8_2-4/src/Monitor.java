import java.util.Objects;

public class Monitor extends Device{
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return this.resolutionX;
    }

    public int getResolutionY() {
        return this.resolutionY;
    }

    @Override
    public String toString() {
        return String.format("%s Monitor: manufacturer = %s, price = %f, serialNumber = %s, X = %d, Y = %d",
                                super.toString(),
                                this.getManufacturer(),
                                this.getPrice(),
                                this.getSerialNumber(),
                                this.resolutionX,
                                this.resolutionY);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}
