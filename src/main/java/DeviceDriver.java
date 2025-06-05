/**
 * This class is used by the operating system to interact with the hardware 'FlashMemoryDevice'.
 */
public class DeviceDriver {

    FlashMemoryDevice hw;

    public DeviceDriver(FlashMemoryDevice hardware) {
        hw = hardware;
    }

    public byte read(long address) {
        return hw.read(address);
    }

    public void write(long address, byte data) {
        hw.write(address, data);
    }
}
