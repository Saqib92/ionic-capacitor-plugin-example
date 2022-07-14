package io.ionic.starter;

import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "Echo")
public class EchoPlugin extends Plugin {

  private static final String TAG = "log";

  @PluginMethod()
  public void echo(PluginCall call) {
    String value = call.getString("value");

    JSObject ret = new JSObject();
    ret.put("value", value);
    call.resolve(ret);
  }


  @PluginMethod()
  public void sum(PluginCall call) {
    double value1 = call.getDouble("int1");
    double value2 = call.getDouble("int2");

    double value3 = (value1 + value2);
    Log.d(TAG, "sum: "+ value3);
    JSObject ret = new JSObject();
    ret.put("response", value3);
    call.resolve(ret);
  }
}
