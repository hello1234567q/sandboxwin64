package sandbox.win.x64.abs;

import android.app.Activity;
import android.content.Context;

/**
 * @author Lody
 */
public interface BaseView<T> {
    Activity getActivity();
    Context getContext();
	void setPresenter(T presenter);
}
