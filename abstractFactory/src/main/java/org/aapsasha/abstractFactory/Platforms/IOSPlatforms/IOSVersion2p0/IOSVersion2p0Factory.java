package org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion2p0;

import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion2p0.IOSVersion2p0Actions.IOSVersion2p0Action;
import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion2p0.IOSVersion2p0Actions.IOSVersion2p0Option;
import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion2p0.IOSVersion2p0Actions.IOSVersion2p0SuperAction;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IAction;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IOption;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.ISuperAction;
import org.aapsasha.abstractFactory.Platforms.IParts.IPlatformFactory;

public class IOSVersion2p0Factory extends IPlatformFactory {
    @Override
    public IAction createAction() {
        return new IOSVersion2p0Action();
    }

    @Override
    public IOption createOption() {
        return new IOSVersion2p0Option();
    }

    @Override
    public ISuperAction createSuperAction() {
        return new IOSVersion2p0SuperAction();
    }
}
