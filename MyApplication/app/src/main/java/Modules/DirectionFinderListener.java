package Modules;

import java.util.List;

/**
 * Created by Lê Bảo Chi on 4/8/2017.
 */

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}

