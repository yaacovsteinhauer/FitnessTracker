package za.co.entelect.jbootcamp.FitnessTracker.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="device_manufacturer")
public class DeviceManufacturer implements java.io.Serializable {

    @Id
    @Column(name="device_manufacturer_id")
    private int deviceManufacturerId;

    @Column(name="manufacturer")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "deviceManufacturer")
    private List<Device> devices = new ArrayList<>();

    public DeviceManufacturer() {}

    public DeviceManufacturer(int deviceManufacturerId, String name) {
        this.deviceManufacturerId = deviceManufacturerId;
        this.name = name;
    }

    public int getDeviceManufacturerId() {
        return deviceManufacturerId;
    }

    public void setDeviceManufacturerId(int deviceManufacturerId) {
        this.deviceManufacturerId = deviceManufacturerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}
