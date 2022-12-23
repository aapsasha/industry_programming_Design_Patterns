package org.aapsasha.abstractFactory.Platforms.AndroidPlatforms.AndroidVersion2p0;

import org.aapsasha.abstractFactory.Platforms.AndroidPlatforms.AndroidVersion2p0.AndroidVersion1p0Actions.AndroidVersion2p0Action;
import org.aapsasha.abstractFactory.Platforms.AndroidPlatforms.AndroidVersion2p0.AndroidVersion1p0Actions.AndroidVersion2p0Option;
import org.aapsasha.abstractFactory.Platforms.AndroidPlatforms.AndroidVersion2p0.AndroidVersion1p0Actions.AndroidVersion2p0SuperAction;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IAction;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IOption;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.ISuperAction;
import org.aapsasha.abstractFactory.Platforms.IParts.IPlatformFactory;

public class AndroidVersion2p0Factory extends IPlatformFactory {
    @Override
    public IAction createAction() {
        return new AndroidVersion2p0Action();
    }

    @Override
    public IOption createOption() {
        return new AndroidVersion2p0Option();
    }

    @Override
    public ISuperAction createSuperAction() {
        return new AndroidVersion2p0SuperAction();
    }
}
