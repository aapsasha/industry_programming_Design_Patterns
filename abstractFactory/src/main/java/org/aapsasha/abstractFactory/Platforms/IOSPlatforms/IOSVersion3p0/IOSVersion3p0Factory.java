package org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion3p0;

import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion3p0.IOSVersion3p0Actions.IOSVersion3p0Action;
import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion3p0.IOSVersion3p0Actions.IOSVersion3p0Option;
import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion3p0.IOSVersion3p0Actions.IOSVersion3p0SuperAction;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IAction;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IOption;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.ISuperAction;
import org.aapsasha.abstractFactory.Platforms.IParts.IPlatformFactory;

public class IOSVersion3p0Factory extends IPlatformFactory {
    @Override
    public IAction createAction() {
        return new IOSVersion3p0Action();
    }

    @Override
    public IOption createOption() {
        return new IOSVersion3p0Option();
    }

    @Override
    public ISuperAction createSuperAction() {
        return new IOSVersion3p0SuperAction();
    }
}
