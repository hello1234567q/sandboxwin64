package sandbox.win.x64.home;


import java.util.List;

import sandbox.win.x64.abs.BasePresenter;
import sandbox.win.x64.abs.BaseView;
import sandbox.win.x64.home.models.AppData;
import sandbox.win.x64.home.models.AppInfoLite;

/**
 * @author Lody
 */
/* package */ class HomeContract {

	/* package */ interface HomeView extends BaseView<HomePresenter> {

        void showBottomAction();

        void hideBottomAction();

		void showLoading();

		void hideLoading();

		void loadFinish(List<AppData> appModels);

		void loadError(Throwable err);

		void showGuide();

		void addAppToLauncher(AppData model);

        void removeAppToLauncher(AppData model);

		void refreshLauncherItem(AppData model);

		void askInstallGms();
	}

	/* package */ interface HomePresenter extends BasePresenter {

		void launchApp(AppData data);

		void dataChanged();

		void addApp(AppInfoLite info);

		void deleteApp(AppData data);

        void createShortcut(AppData data);
    }

}
