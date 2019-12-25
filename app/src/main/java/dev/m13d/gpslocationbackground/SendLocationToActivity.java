package dev.m13d.gpslocationbackground;

import android.location.Location;
import android.widget.Toast;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class SendLocationToActivity {

    private Location location;

    public SendLocationToActivity(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
