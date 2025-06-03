package sandbox.win.x64.home;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;

import com.lody.virtual.sandxposed.XposedConfig;
import com.trend.lazyinject.annotation.InjectComponent;

import java.util.ArrayList;
import java.util.List;

import sandbox.win.x64.R;
import sandbox.win.x64.abs.ui.VActivity;
import sandbox.win.x64.abs.ui.VUiKit;
import sandbox.win.x64.home.adapters.XposedModuleAdapter;
import sandbox.win.x64.home.adapters.decorations.ItemOffsetDecoration;
import sandbox.win.x64.home.models.AppData;
import sandbox.win.x64.home.repo.AppRepository;

public class XposedManagerActivity extends VActivity {

    SwitchCompat xposedSwitch;
    RecyclerView recyclerView;

    AppRepository appRepository;
    List<AppData> modules = new ArrayList<>();

    XposedModuleAdapter adapter;

    @InjectComponent
    XposedConfig config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xposed_manager);
        setSupportActionBar(findViewById(R.id.toolbar));
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        initXposedGlobalSettings();
        initModuleList();
    }

    private void initXposedGlobalSettings() {
        xposedSwitch = findViewById(R.id.xposed_enable_switch);
        xposedSwitch.setChecked(config.xposedEnabled());
        xposedSwitch.setOnCheckedChangeListener((compoundButton, b) -> {
            config.enableXposed(b);
            recyclerView.setEnabled(b);
            recyclerView.setAlpha(b ? 1 : 0.5f);
        });
    }

    private void initModuleList() {

        boolean xposedEnabled = config.xposedEnabled();

        recyclerView = findViewById(R.id.module_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new ItemOffsetDecoration(VUiKit.dpToPx(getContext(), 4)));
        recyclerView.setEnabled(xposedEnabled);
        recyclerView.setAlpha(xposedEnabled ? 1 : 0.5f);

        appRepository = new AppRepository(this);
        adapter = new XposedModuleAdapter(this, appRepository, modules);
        appRepository.getVirtualXposedModules()
                .done(result -> {
                    modules.clear();
                    modules.addAll(result);
                    adapter.notifyDataSetChanged();
                });

        recyclerView.setAdapter(adapter);

    }

}
