package ro.pub.cs.systems.eim.lab05.boundedserviceactivity.view;
import android.os.IBinder;
/**
 * Created by student on 23.03.2018.
 */

public class BoundService extends IBinder {
    final private IBinder boundedServiceBinder = new BoundedServiceBinder();

    public class BoundedServiceBinder extends Binder {
        public BoundedService getService() {
            return BoundedService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return boundedServiceBinder;
    }
}
