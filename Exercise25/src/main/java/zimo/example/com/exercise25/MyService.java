package zimo.example.com.exercise25;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG="myServiceTag";
    private LocalBinder binder = new LocalBinder();
    public MyService() {
    }


    public class LocalBinder extends Binder {
        MyService getServer(){
            return MyService.this;
        }
    }

    public int add(int x,int y){
        return x+y;
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.v(TAG, "onBind()");
        return binder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.v(TAG,"onUnbind");
        return super.onUnbind(intent);
    }
}
