package sandbox.win.x64.sandxposed;

import com.lody.virtual.sandxposed.XposedConfig;
import com.lody.virtual.sandxposed.XposedModuleProfile;
import com.trend.lazyinject.annotation.ComponentImpl;

@ComponentImpl(process = "sandbox.win.x64.sandvxposed:x")
public class XposedConfigComponent implements XposedConfig {
    @Override
    public boolean xposedEnabled() {
        return XposedModuleProfile.isXposedEnable();
    }

    @Override
    public void enableXposed(boolean enable) {
        XposedModuleProfile.enbaleXposed(enable);
    }

    @Override
    public boolean moduleEnable(String pkg) {
        return XposedModuleProfile.isModuleEnable(pkg);
    }

    @Override
    public void enableModule(String pkg, boolean enable) {
        XposedModuleProfile.enableModule(pkg, enable);
    }
}
