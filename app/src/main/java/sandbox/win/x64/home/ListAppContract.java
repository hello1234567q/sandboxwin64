package sandbox.win.x64.home;

import java.util.List;

import sandbox.win.x64.abs.BasePresenter;
import sandbox.win.x64.abs.BaseView;
import sandbox.win.x64.home.models.AppInfo;

/**
 * @author Lody
 * @version 1.0
 */
/*package*/ class ListAppContract {
    interface ListAppView extends BaseView<ListAppPresenter> {

        void startLoading();

        void loadFinish(List<AppInfo> infoList);
    }

    interface ListAppPresenter extends BasePresenter {

    }
}
